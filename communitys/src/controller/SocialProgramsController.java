package controller;
import java.util.List;

import service.SocialProgramsService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import entity.SocialPrograms;;


@WebServlet(name="SocialProgramsController",urlPatterns={"/SocialProgramsController"})
public class SocialProgramsController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	SocialProgramsService sopService = new SocialProgramsService();
	
	/**
	 * 添加一条社会项目
	 * @param req
	 * @param resp
	 * @return
	 */
	public String addPrograms(HttpServletRequest req, HttpServletResponse resp){
		SocialPrograms sop = CommonUtils.toBean(req.getParameterMap(),SocialPrograms.class);
		try{
			sopService.addSocialPrograms(sop);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listPrograms(req, resp);
	}
	
	/**
	 *查看所有的社会项目
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listPrograms(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<SocialPrograms> socialProgramsList =  sopService.selectAll();
			req.setAttribute("socialProgramsList", socialProgramsList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/project/project.jsp";
	}
	
	/**
	 * 根据Id删除一条社会项目
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			sopService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return  this.listPrograms(req, resp);
	}
	
	/**
	 * 前往修改的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			SocialPrograms socialPrograms =  sopService.queryById(id);
			req.setAttribute("socialPrograms", socialPrograms);
		}catch(Exception e){
			e.printStackTrace();
		}
 		return "f:backpages/project/change.jsp";
	}
	
	/**
	 * 根据Id修改相应的社会项目
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updatePrograms(HttpServletRequest req, HttpServletResponse resp){
		SocialPrograms sop = CommonUtils.toBean(req.getParameterMap(),SocialPrograms.class);
		try{
			sopService.updateById(sop);
		}catch(Exception e){
			e.printStackTrace();
		}
		return  this.listPrograms(req, resp);
	}
	
	/**
	 * 查看详情
	 * 后台管理
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			SocialPrograms socialPrograms =  sopService.queryById(id);
			req.setAttribute("socialPrograms", socialPrograms);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/project/view.jsp";
	}
	
	/**
	 * 查看详情
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView2(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			SocialPrograms socialPrograms =  sopService.queryById(id);
			req.setAttribute("socialPrograms", socialPrograms);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/project/content.jsp";
	}
	
	/**
	 * 审核通过或者不通过
	 * @param req
	 * @param resp
	 * @return
	 */
	public String passOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		String type = req.getParameter("type");
		try{
			sopService.updateTypeById(type, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return  this.listPrograms(req, resp);
	}
	
	/**
	 * 查找出审核通过的社会项目
	 * 前台显示 
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listByType(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<SocialPrograms> socialProgramsList =  sopService.queryByType("审核通过");
			req.setAttribute("socialProgramsList", socialProgramsList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/project/project_index.jsp";
	}
}
