package controller;
import java.util.List;

import service.CommunityBookService;
import util.IPTimeStamp;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import entity.CommunityBook;
import entity.DatumDownload;



@WebServlet(name="CommunityBookController",urlPatterns={"/CommunityBookController"})
@MultipartConfig
public class CommunityBookController extends BaseServlet{
	private static final long serialVersionUID = 1L;
	CommunityBookService cobService = new CommunityBookService();
	
	/**
	 * 新增一条资料下载
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newCommunityBook(HttpServletRequest req, HttpServletResponse resp){
		IPTimeStamp its = new IPTimeStamp(req.getRemoteAddr());
		CommunityBook communityBook = new CommunityBook();
		try{
			// 使用servlet3.0实现文件的上传
    		Part part = req.getPart("file");
    		String cd = part.getHeader("Content-Disposition");  
            String[] cds = cd.split(";");  
            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
            String ext = filename.substring(filename.lastIndexOf(".")+1);
            
            String path = its.getIPTimeStampRand()+"."+ext;
            communityBook.setPath(path);
            cobService.addCommunityBook(communityBook);
            part.write(getServletContext().getRealPath("/backpages/file") + "/" + path);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityBook(req, resp);
	}
	
	/**
	 * 列表查询所有的资料下载
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityBook(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<CommunityBook> communityBookList = cobService.selectAll();
			req.setAttribute("communityBookList", communityBookList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/club_book/club_book.jsp";
	}
	
	/**
	 * 列表查询所有的资料下载
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listCommunityBook2(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<CommunityBook> communityBookList = cobService.selectAll();
			req.setAttribute("communityBookList", communityBookList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/services/book.jsp";
	}
	
	/**
	 * 根据id删除一个资料下载
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			cobService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listCommunityBook(req, resp);
	}
	
}
