package controller;
import java.util.List;

import service.AccountService;
import service.ArticleLendService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import entity.ActivityApply;
import entity.ArticleLend;

/**
 * 物品借用
 * @author guofr
 * 
 *
 */
@WebServlet(name="ArticleLendController",urlPatterns={"/ArticleLendController"})
public class ArticleLendController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	private ArticleLendService arlService = new ArticleLendService();
	private AccountService accService = new AccountService();
	/**
	 * 新增一条物品借用
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newArticleLend(HttpServletRequest req, HttpServletResponse resp){
		try{
			if(req.getParameter("accountId") != null && !"".equals(req.getParameter("accountId"))){
				// 社团管理员才有权限申请活动
				if("社团管理员".equals(accService.queryById(Integer.parseInt(req.getParameter("accountId"))).getRole())){
					ArticleLend articleLend = CommonUtils.toBean(req.getParameterMap(), ArticleLend.class);
					arlService.addArticleLend(articleLend);
					req.setAttribute("msg","申请成功，等待审核");
				}else{
					req.setAttribute("msg", "没有权限进行物品借用申请！");
				}
			}else{
				req.setAttribute("msg", "未登录，不能进行物品借用申请！");
			}
			}catch(Exception e){
				e.printStackTrace();
			}
		
			
		
		return "f:frontpages/pages/services/borrow.jsp";
	}
	
	/**
	 * 根据Id删除一条信息
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id =Integer.parseInt(req.getParameter("id"));
		try{
			arlService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 查找所有的物品借用
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listArticleLend(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<ArticleLend> articleLendList = arlService.selectAll();
			req.setAttribute("articleLendList", articleLendList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 审核通过或者不通过
	 * @param req
	 * @param resp
	 * @return
	 */
	public String passOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		String type = req.getParameter("type");
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			arlService.updateTypeById(id, type);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
}
