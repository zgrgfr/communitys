package controller;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import service.HomeCarouselService;
import util.IPTimeStamp;
import util.ParamUtil;
import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;
import entity.Account;
import entity.Community;
import entity.CommunityShow;
import entity.HomeCarousel;

/**
 * 首页轮播
 * @author guofr
 * 
 *
 */
@WebServlet(name="HomeCarouselController",urlPatterns={"/HomeCarouselController"})
@MultipartConfig
public class HomeCarouselController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	private HomeCarouselService homeCarouselService = new HomeCarouselService();

	/**
	 * 插入一条数据
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newHomeCarousel(HttpServletRequest req, HttpServletResponse resp)  {
		IPTimeStamp its = new IPTimeStamp(req.getRemoteAddr());
    	try{
    		// 使用servlet3.0实现文件的上传
    		Part part = req.getPart("file");
    		String cd = part.getHeader("Content-Disposition");  
            String[] cds = cd.split(";");  
            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
            String ext = filename.substring(filename.lastIndexOf(".")+1);
            
            String path = its.getIPTimeStampRand()+"."+ext;
            String title = req.getParameter("title"); 
			String type = req.getParameter("type");
			HomeCarousel homeCarousel = new HomeCarousel();
			homeCarousel.setPath(path);
			homeCarousel.setTitle(title);
			part.write(getServletContext().getRealPath("/backpages/image") + "/" + path);
			homeCarouselService.addHomeCarousel(homeCarousel);
    	}catch(Exception e){
		e.printStackTrace();
    	}
    	return this.listAllHomeCarousel(req, resp);
	}
	
	/**
	 * 查找所有的首页轮播
	 * 超级管理员，社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listAllHomeCarousel(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<HomeCarousel> homeCarouselList = homeCarouselService.selectAll();
			req.setAttribute("homeCarouselList", homeCarouselList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/index_img/show.jsp";
	}
	
	/**
	 * 标记为首页显示，取消首页显示
	 * 超级管理员，社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String showOrNotShow(HttpServletRequest req, HttpServletResponse resp){
		String showType = req.getParameter("showType");
		int id = ParamUtil.getInt(req, "id",0);
		try{
			homeCarouselService.updateShowTypeById(id, showType);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listAllHomeCarousel(req, resp);
	}
	
	/**
	 * 根据Id删除一条数据
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id = ParamUtil.getInt(req, "id",0);
		try{
			homeCarouselService.deleteById(id);
		}catch(Exception e){
			
		}
		return this.listAllHomeCarousel(req, resp);
	}
}
