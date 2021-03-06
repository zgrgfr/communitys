package controller;
import java.util.List;

import service.ClassEnterService;
import service.ClassService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.ClassDto;
import entity.Account;
import entity.Class;
import entity.Community;
import entity.ResourceShare;

@WebServlet(name="ClassController",urlPatterns={"/ClassController"})
public class ClassController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	ClassService claService = new ClassService();
	private ClassEnterService classEnterService = new ClassEnterService();
	
	public String newClass(HttpServletRequest req, HttpServletResponse resp){
		Class cla = CommonUtils.toBean(req.getParameterMap(),Class.class);
		try{
			claService.addClass(cla);
		}catch(Exception e){
			e.printStackTrace();
		}
		HttpSession session = req.getSession();
		Account acc = (Account)session.getAttribute("account");
		if("社团管理员".equals(acc.getRole())){
			return this.listCommunityClass(req, resp);
		}else{
			return this.listCommunityClass2(req, resp);
		}
	}
	
	/**
	 * 查看课程列表
	 * 社团管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityClass(HttpServletRequest req, HttpServletResponse resp){
		HttpSession session = req.getSession();
		try{
			int communityId = ((Community)session.getAttribute("community")).getId();
			List<Class> classList = claService.queryByCommunityId(communityId);
			req.setAttribute("classList", classList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/course/course.jsp";
	}
	
	/**
	 * 查看所有的精品课程
	 * 社联管理员，超级管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityClass2(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<Class> classList = claService.selectAll();
			req.setAttribute("classList", classList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/course/course.jsp";
	}
	/**
	 * 去修改的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate(HttpServletRequest req, HttpServletResponse resp){
		int classId =Integer.parseInt(req.getParameter("id"));
		try{
			Class course = claService.queryById(classId);
			req.setAttribute("course", course);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/course/change.jsp";
	}
	
	/**
	 * 查看详情（加上申请这个这个课程的账号集合）
	 * 后台
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView(HttpServletRequest req, HttpServletResponse resp){
		int classId =Integer.parseInt(req.getParameter("id"));
		try{
			Class course = claService.queryById(classId);
			req.setAttribute("course", course);
			List<Account> accountList = classEnterService.queryAccountByClassId(classId);
			req.setAttribute("accountList",accountList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/course/view.jsp";
	}
	
	/**
	 * 查看详情Dto
	 * 前台
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView2(HttpServletRequest req, HttpServletResponse resp){
		int classId =Integer.parseInt(req.getParameter("id"));
		try{
			ClassDto classDto = claService.queryClassDtoById(classId); 
			req.setAttribute("classDto", classDto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/course/content.jsp";
	}
	
	
	/**
	 * 修改一条资源共享
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updateClass(HttpServletRequest req, HttpServletResponse resp){
		Class cla = CommonUtils.toBean(req.getParameterMap(),Class.class);
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("account");
		try{
			claService.updateById(cla.getId(), cla);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团管理员".equals(account.getRole())){
			return this.listCommunityClass(req, resp);
		}else{
			// 超级管理员和社联管理员看全部的数据
			return this.listCommunityClass2(req, resp);	
		}
	}
	
	/**
	 * 根据Id删除一条精品课程
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int classId =Integer.parseInt(req.getParameter("id"));
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("account");
		try{
			claService.deleteById(classId);
		}catch(Exception e){
			e.printStackTrace();
		}
		if("社团管理员".equals(account.getRole())){
			return this.listCommunityClass(req, resp);
		}else{
			// 超级管理员和社联管理员看全部的数据
			return this.listCommunityClass2(req, resp);	
		}
	}
	
	/**
	 * 审核通过或者不通过
	 * @param req
	 * @param resp
	 * @return
	 */
	public String passOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		int id =Integer.parseInt(req.getParameter("id"));
		String type= req.getParameter("type");
		try{
			claService.updateTypeById(type, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityClass2(req, resp);
	}
	/**
	 * 根据课程类型和审核类型和时间进行的状态以及排序方式来返回相应的课程
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listByTypeAndclassType(HttpServletRequest req, HttpServletResponse resp){
		String classType = req.getParameter("classType");
		String classTime = req.getParameter("classTime");
		String select = req.getParameter("select");
		try{
			List<ClassDto> classDtoList = claService.queryByAllCondition("审核通过",classType,classTime,select);
			req.setAttribute("classDtoList", classDtoList);
			req.setAttribute("classType", classType);
			req.setAttribute("classTime", classTime);
			req.setAttribute("select", select);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:/frontpages/pages/course/course_index.jsp";
	}
}
