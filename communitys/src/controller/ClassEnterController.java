package controller;
import java.util.ArrayList;
import java.util.List;

import service.AccountService;
import service.ActivityApplyService;
import service.ClassEnterService;
import service.ClassService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;









import dto.ClassDto;
import entity.ActivityApply;
import entity.Account;
import entity.ClassEnter;

/**
 * 物品借用
 * @author guofr
 * 
 *
 */
@WebServlet(name="ClassEnterController",urlPatterns={"/ClassEnterController"})
public class ClassEnterController extends BaseServlet{
	private static final long serialVersionUID = 1L;
	private ClassEnterService classEnterService = new ClassEnterService();
	private ClassService claService = new ClassService();
	/**
	 * 参加某课程
	 * @param req
	 * @param resp
	 * @return
	 */
	public String enterClass(HttpServletRequest req,HttpServletResponse resp){
		try{
			// 课程的Id
			int classId = Integer.parseInt(req.getParameter("classId"));
			// 判断该用户是否登录
			if(req.getParameter("accountId") != null && !"".equals(req.getParameter("accountId"))){
				int accountId = Integer.parseInt(req.getParameter("accountId"));
				if(classEnterService.judgeEnterClass(classId,accountId)){
					ClassEnter classEnter = new ClassEnter();
					classEnter.setClassId(classId);
					classEnter.setStudentId(accountId);
					classEnterService.addClassEnter(classEnter);
					req.setAttribute("msg", "报名成功！");
				}else{
					req.setAttribute("msg", "已报过名，不可重复报名！");
				}
			}else{
				req.setAttribute("msg", "未登录，不能报名参加该课程！");
			}
			ClassDto classDto = claService.queryClassDtoById(classId); 
			req.setAttribute("classDto", classDto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/course/content.jsp";
	}
	
	
}
