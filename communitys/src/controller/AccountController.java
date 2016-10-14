package controller;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountService;
import util.ParamUtil;
import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;
import entity.Account;

/**
 * 账号
 * @author guofr
 * 
 *
 */
@WebServlet(name="AccountController",urlPatterns={"/AccountController"})
public class AccountController extends BaseServlet{
	private static final long serialVersionUID = 1L;
	private AccountService accountService = new AccountService();
	
	/**
	 * 添加一条账户信息
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newAccount(HttpServletRequest req, HttpServletResponse resp){
		Account account = CommonUtils.toBean(req.getParameterMap(), Account.class);
		try{
			accountService.addAccount(account);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/index.jsp";
	}
	
	/**
	 * 查看所有的账号信息
	 * 超级管理员
	 * 社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listAccount(HttpServletRequest req,HttpServletResponse resp){
		try{
			List<Account> accountList = accountService.selectAll();
			for(int i=0;i<accountList.size();i++){
				if("场地管理员".equals(accountList.get(i).getRole())){
					accountList.remove(i);
					i--;
				}
			}
			req.setAttribute("accountList", accountList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/account/account.jsp";
	}
	
	/**
	 * 审核通过或者不通过
	 * @param req
	 * @param resp
	 * @return
	 */
	public String passOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		String type = req.getParameter("type");
		int id = ParamUtil.getInt(req, "id",0);
		try{
			accountService.updateTypeById(type, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listAccount(req, resp);
	}
	
	/**
	 * 授权场地申请或者不授权
	 * @param req
	 * @param resp
	 * @return
	 */
	public String placeSetOrNotSetRole(HttpServletRequest req, HttpServletResponse resp){
		String placeRole = req.getParameter("placeRole");
		int id = ParamUtil.getInt(req, "id",0);
		try{
			accountService.updatePlaceRoleById(id, placeRole);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listAccount(req, resp);
	}
	
	/**
	 * 授权场地申请或者不授权
	 * 场地管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String placeSetOrNotSetRole2(HttpServletRequest req, HttpServletResponse resp){
		String placeRole = req.getParameter("placeRole");
		int id = ParamUtil.getInt(req, "id",0);
		try{
			accountService.updatePlaceRoleById(id, placeRole);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listAccount2(req, resp);
	}
	
	/**
	 * 授权社联管理员，一般学生
	 * 
	 * @param req
	 * @param resp
	 * @return
	 */
	public String SetRole(HttpServletRequest req, HttpServletResponse resp){
		String role = req.getParameter("role");
		int id = ParamUtil.getInt(req, "id",0);
		try{
			if(!"社团管理员".equals(accountService.queryById(id).getRole())){
				accountService.updateRoleById(id, role);
			}else{
				req.setAttribute("msg", "社团管理员不能修改身份!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listAccount(req, resp);
	}
	
	/**
	 * 账号查重
	 * 
	 * @param req
	 * @param resp
	 * @return
	 */
	public String AccountCnki(HttpServletRequest req, HttpServletResponse resp){
		String account = req.getParameter("account");
		try{
			if("".equals(account) || account == null){
				resp.getWriter().write("请填写账号！");
			}else{
				if(accountService.queryByAccount(account) != null ){
					resp.getWriter().write("该账号已被注册！");
				}else{
					resp.getWriter().write("该账号可用！");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 查看所有的账号除去场地管理员
	 * 场地管理员
	 * 授权场地申请的权限
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listAccount2(HttpServletRequest req,HttpServletResponse resp){
		try{
			List<Account> accountList = accountService.selectAll();
			for(int i=0;i<accountList.size();i++){
				if("场地管理员".equals(accountList.get(i).getRole())){
					accountList.remove(i);
					i--;
				}
			}
			req.setAttribute("accountList", accountList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/place/place_authority.jsp";
	}
}
