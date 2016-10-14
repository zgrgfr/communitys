package controller;
import java.util.ArrayList;
import java.util.List;

import service.CommunityPresenceService;
import util.ParamUtil;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;







import dto.CommunityPresenceDto;
import entity.Account;
import entity.Community;
import entity.CommunityPresence;
import entity.ResourceShare;

@WebServlet(name="CommunityPresenceController",urlPatterns={"/CommunityPresenceController"})
public class CommunityPresenceController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	CommunityPresenceService copService = new CommunityPresenceService();
	
	/**
	 * 添加一条社团风采或社团动态
	 * @param req
	 * @param resp
	 * @return
	 */
	public String addCommunityPresence(HttpServletRequest req, HttpServletResponse resp){
		CommunityPresence communityPresence = CommonUtils.toBean(req.getParameterMap(),CommunityPresence.class);
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("account");
		try{
			copService.addCommunityPresence(communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团管理员".equals(account.getRole())){
			return this.listCommunityPresence(req, resp);
		}else{
			// 超级管理员和社联管理员看全部的数据
			return this.listCommunityPresence2(req, resp);	
		}
	}
	
	/**
	 * 添加一条社联通知
	 * 超级管理员，社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String addCommunityPresence2(HttpServletRequest req, HttpServletResponse resp){
		CommunityPresence communityPresence = CommonUtils.toBean(req.getParameterMap(),CommunityPresence.class);
		try{
			copService.addCommunityPresence(communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityPresence3(req, resp);
	}
	
	/**
	 * 查找所有的社联通知
	 * 超级管理员，社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityPresence3(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<CommunityPresence> communityPresenceList =  copService.queryByArticleType("社联通知");
			req.setAttribute("communityPresenceList", communityPresenceList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/shelian_info/style.jsp";
	}
	/**
	 * 根据社团Id查找相应的社团风采和社团动态
	 * 社团管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityPresence(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		List<CommunityPresenceDto> communityPresenceDtoList = new ArrayList<CommunityPresenceDto>();
		try{
			if((Community)session.getAttribute("community") != null){
				int communityId = ((Community)session.getAttribute("community")).getId();
				List<CommunityPresence> communityPresenceList = copService.queryByCommunityId(communityId);
				
				for(CommunityPresence communityPresence : communityPresenceList){
					CommunityPresenceDto communityPresenceDto = new CommunityPresenceDto();
					communityPresenceDto.setCommunity((Community)session.getAttribute("community"));
					communityPresenceDto.setCommunityPresence(communityPresence);
					communityPresenceDtoList.add(communityPresenceDto);
				}
				req.setAttribute("communityPresenceDtoList", communityPresenceDtoList);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_style/style.jsp";
	}
	
	/**
	 * 查找所有的社团风采和社团动态
	 * 超级管理员，社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityPresence2(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<CommunityPresenceDto> communityPresenceDtoList = copService.selectAllDto();
			
			req.setAttribute("communityPresenceDtoList", communityPresenceDtoList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_style/style.jsp";
	}
	
	/**
	 * 根据Id删除该数据
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("account");
		try{
			copService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团管理员".equals(account.getRole())){
			return this.listCommunityPresence(req, resp);
		}else{
			// 超级管理员和社联管理员看全部的数据
			return this.listCommunityPresence2(req, resp);	
		}
	}
	
	/**
	 * 根据Id删除该社联通知
	 * 超级，社联
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById2(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			copService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityPresence3(req, resp); 
	}
	/**
	 * 去修改的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			CommunityPresence communityPresence =  copService.queryById(id);
			req.setAttribute("communityPresence", communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_style/change.jsp";
	}
	
	/**
	 * 去修改社联通知的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate2(HttpServletRequest req, HttpServletResponse resp){
		int id = ParamUtil.getInt(req, "id",0);
		try{
			CommunityPresence communityPresence =  copService.queryById(id);
			req.setAttribute("communityPresence", communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/shelian_info/change.jsp";
	}
	
	/**
	 * 修改一条社团风采或者社团动态
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updateCommunityPresence(HttpServletRequest req, HttpServletResponse resp){
		CommunityPresence communityPresence = CommonUtils.toBean(req.getParameterMap(),CommunityPresence.class);
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("account");
		try{
			copService.updateById(communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团管理员".equals(account.getRole())){
			return this.listCommunityPresence(req, resp);
		}else{
			// 超级管理员和社联管理员看全部的数据
			return this.listCommunityPresence2(req, resp);	
		}
	}
	
	/**
	 * 修改一条社联通知
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updateCommunityPresence2(HttpServletRequest req, HttpServletResponse resp){
		CommunityPresence communityPresence = CommonUtils.toBean(req.getParameterMap(),CommunityPresence.class);
		try{
			copService.updateById(communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityPresence3(req, resp);
	}
	
	/**
	 * 查看详情
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			CommunityPresence communityPresence =  copService.queryById(id);
			req.setAttribute("communityPresence", communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_style/view.jsp";
	}
	
	/**
	 * 查看内容
	 * 前台
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView2(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			CommunityPresence communityPresence =  copService.queryById(id);
			req.setAttribute("communityPresence", communityPresence);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/style/content.jsp";
	}
	
	/**
	 * 审核通过或者审核不通过
	 * 社联管理员,超级管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String PassOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		int id = ParamUtil.getInt(req, "id",0);
		String type = req.getParameter("type");
		String articleType = "";
		try{
			copService.updateTypeById(id, type);
			articleType = copService.queryById(id).getArticleType();
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社联通知".equals(articleType)){
			return this.listCommunityPresence3(req, resp);
		}else{
			return this.listCommunityPresence2(req, resp);
		}
	}
	
	
	public String listByTypeAndArticleType(HttpServletRequest req, HttpServletResponse resp){
		String articleType = req.getParameter("articleType");
		try{
			List<CommunityPresence> communityPresenceList = copService.queryByType("审核通过",articleType);
			req.setAttribute("communityPresenceList", communityPresenceList);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团风采".equals(articleType)){
			return "f:frontpages/pages/style/style.jsp";
		}else{
			return "f:frontpages/pages/style/track.jsp";
		}
		
	}
}
