package controller;
import java.io.IOException;
import java.io.PrintWriter;

import service.CommunityService;
import service.CommunityShowService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;














import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;




import java.util.Collections;
import java.util.List;

import entity.Community;
import entity.CommunityShow;
import util.IPTimeStamp;
import util.ParamUtil;

import javax.servlet.http.Part;
import javax.swing.JOptionPane;







import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import dto.CommunityShowDto;
/**
 * 社团展示的Controller 
 * @author 郭丰瑞
 *
 */
@WebServlet(name="CommunityShowController",urlPatterns={"/CommunityShowController"})
@MultipartConfig
public class CommunityShowController extends BaseServlet{
	private static final long serialVersionUID = 1L;
	CommunityShowService communityShowService = new CommunityShowService();
	CommunityService communityService = new CommunityService();
	
	public String newCommunityShow(HttpServletRequest req, HttpServletResponse resp)  {
			HttpSession session = req.getSession();
			IPTimeStamp its = new IPTimeStamp(req.getRemoteAddr());
			 
	    	try{
	    		// 使用servlet3.0实现文件的上传
	    		Part part = req.getPart("file");
	    		String cd = part.getHeader("Content-Disposition");  
	            String[] cds = cd.split(";");  
	            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
	            String ext = filename.substring(filename.lastIndexOf(".")+1);
	            
	            String logo = its.getIPTimeStampRand()+"."+ext;
	            String campus = req.getParameter("campus"); 
				String grade = req.getParameter("grade");
				String communityType = req.getParameter("community_type");
				int communityId = ((Community)session.getAttribute("community")).getId();
				String type = req.getParameter("type");
				CommunityShow communityShow = new CommunityShow(campus,grade,communityType,logo,communityId,type);
				if(communityShowService.queryByCommunityId(communityId) == null){
					communityShowService.addCommunityShow(communityShow);
					part.write(getServletContext().getRealPath("/backpages/image") + "/" + logo);
				}else{
					req.setAttribute("message", "该社团已存在社团展示，不可重复添加");
					return "f:backpages/club_show/add.jsp";
				}
	    	}catch(Exception e){
			e.printStackTrace();
		}
	    return this.listCommunityShow(req, resp);
	}
	
	/**
	 * 根据社团Id查看该社团的社团展示
	 * 社团管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityShow(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		try{
			if((Community)session.getAttribute("community") != null){
				int communityId = ((Community)session.getAttribute("community")).getId();
				CommunityShow communityShow = communityShowService.queryByCommunityId(communityId);
				req.setAttribute("communityShow", communityShow);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_show/show.jsp";
	}
	
	/**
	 * 根据Id删除相应的社团展示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id =Integer.parseInt(req.getParameter("id"));
		try{
			if(communityShowService.queryById(id).getLogo() != null){
				String delPath = req.getRealPath("")+"\\backpages\\image\\"+communityShowService.queryById(id).getLogo();
	        	communityShowService.deleteFile(delPath);
			}
			communityShowService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityShow(req, resp);
	}
	
	/**
	 * 跳转到修改的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate(HttpServletRequest req, HttpServletResponse resp){
		int id =Integer.parseInt(req.getParameter("id"));
		try{
			CommunityShow communityShow = communityShowService.queryById(id);
			req.setAttribute("communityShow", communityShow);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_show/change.jsp";
	}
	
	public String updateCommunityShow(HttpServletRequest req, HttpServletResponse resp){
		IPTimeStamp its = new IPTimeStamp(req.getRemoteAddr());
		try{
    		// 使用servlet3.0实现文件的上传
    		String logo = req.getParameter("logo");
			Part part = req.getPart("file");
    		String cd = part.getHeader("Content-Disposition");  
            String[] cds = cd.split(";");  
            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
            String ext = filename.substring(filename.lastIndexOf(".")+1);
            if(!"".equals(filename)){
            	// 删除原来的logo
            	String delPath = req.getRealPath("")+"\\backpages\\image\\"+logo;
            	communityShowService.deleteFile(delPath);
            	logo = its.getIPTimeStampRand()+"."+ext;
            }
            int id = Integer.parseInt(req.getParameter("id"));
            String campus = req.getParameter("campus"); 
			String grade = req.getParameter("grade");
			String communityType = req.getParameter("communityType");
			int communityId = Integer.parseInt(req.getParameter("communityId"));
			String type = req.getParameter("type");
			CommunityShow communityShow = new CommunityShow(id,campus,grade,communityType,logo,communityId,type);
			communityShowService.updateById(communityShow);
			if(filename != null && (!"".equals(filename))){
				// 存储新的logo
				part.write(getServletContext().getRealPath("/backpages/image") + "/" + logo);
				
			}	
    	}catch(Exception e){
		e.printStackTrace();
	}
    return this.listCommunityShow(req, resp);
	}
	
	/**
	 * 查找审核通过的社团展示
	 * 根据接收到的校区，类型，等级
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listByAllCondition(HttpServletRequest req, HttpServletResponse resp){
		String grade = req.getParameter("grade");
		String campus = req.getParameter("school");
		String communityType = req.getParameter("type");
		List<CommunityShowDto> communityShowDtoList = Collections.emptyList();
		JSONArray jsonArray = new JSONArray();
		try{
			communityShowDtoList = communityShowService.listByAllCondition(campus, grade, communityType, "审核通过");
			if(communityShowDtoList.size() == 0){
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("logo", "");
				jsonObject.put("name", "");
				jsonObject.put("communityShowId", "0");
				jsonObject.put("communityId", "0");
				jsonArray.add(jsonObject);
			}else{
				for(CommunityShowDto communityShowDto : communityShowDtoList){
					JSONObject jsonObject = new JSONObject();
					if(communityShowDto.getCommunityShow() != null && communityShowDto.getCommunity() !=null){
						jsonObject.put("communityShowId", communityShowDto.getCommunityShow().getId());
						jsonObject.put("communityId", communityShowDto.getCommunity().getId());
						jsonObject.put("logo", communityShowDto.getCommunityShow().getLogo());
						jsonObject.put("name", communityShowDto.getCommunity().getName());
						jsonArray.add(jsonObject);
					}
				}
			}
			resp.getWriter().write(jsonArray.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonArray.toString();
	}
	
	/**
	 * 学生跳转到参加社团的页面
	 * 前台
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toEnter(HttpServletRequest req, HttpServletResponse resp){
		try{
			CommunityShowDto communityShowDto = new CommunityShowDto();
			int communityShowId =Integer.parseInt(req.getParameter("communityShowId"));
			if(communityShowService.queryById(communityShowId) != null){
				CommunityShow communityShow = communityShowService.queryById(communityShowId);
				if(communityShow.getCommunityId() != 0){
					Community community = communityService.queryById(communityShow.getCommunityId());
					communityShowDto.setCommunity(community);
					communityShowDto.setCommunityShow(communityShow);
				}
			}
			req.setAttribute("communityShowDto", communityShowDto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/style/show-content.jsp";
	}
	
	/**
	 * 根据社团展示的id修改等级
	 * 社联管理员，超级管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updateGradeById(HttpServletRequest req, HttpServletResponse resp){
		try{
			int id = ParamUtil.getInt(req, "id",0);
			String grade = req.getParameter("grade");
			communityShowService.updateGradeById(id,grade);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
}
