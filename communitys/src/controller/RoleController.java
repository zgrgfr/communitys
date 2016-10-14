package controller;
import java.util.List;

import service.ActivityApplyService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import entity.ActivityApply;
import entity.Account;

/**
 * 物品借用
 * @author guofr
 * 
 *
 */
@WebServlet(name="RoleController",urlPatterns={"/RoleController"})
public class RoleController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 想要查看基本业务页面的时候判断前台是否登陆
	 * @param req
	 * @param resp
	 * @return
	 */
	public String isLoginFront(HttpServletRequest req, HttpServletResponse resp){
		String url = req.getParameter("url");
		HttpSession session = req.getSession();
		Account account = (Account)session.getAttribute("accountFront");
		if(account != null){
			return "f:"+ url +"";
		}else{
			return "";
		}
	}
	
}
