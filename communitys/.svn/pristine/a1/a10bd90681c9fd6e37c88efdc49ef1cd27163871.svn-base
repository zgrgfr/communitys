package controller;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import service.DatumDownloadService;
import util.DownLoadUtil;
import util.IPTimeStamp;
import cn.itcast.servlet.BaseServlet;
import entity.DatumDownload;

@WebServlet(name="DatumDownloadController",urlPatterns={"/DatumDownloadController"})
@MultipartConfig
public class DatumDownloadController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	DatumDownloadService ddlService = new DatumDownloadService();
	
	/**
	 * 新增一条资料下载
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newDatumDownload(HttpServletRequest req, HttpServletResponse resp){
		IPTimeStamp its = new IPTimeStamp(req.getRemoteAddr());
		DatumDownload datumDownload = new DatumDownload();
		try{
			// 使用servlet3.0实现文件的上传
    		Part part = req.getPart("file");
    		String cd = part.getHeader("Content-Disposition");  
            String[] cds = cd.split(";");  
            String filename = cds[2].substring(cds[2].indexOf("=")+1).substring(cds[2].lastIndexOf("//")+1).replace("\"", "");  
            String ext = filename.substring(filename.lastIndexOf(".")+1);
            
            String path = its.getIPTimeStampRand()+"."+ext;
            String title = req.getParameter("title"); 
            String uploadName = req.getParameter("uploadName"); 
            datumDownload.setTitle(title);
            datumDownload.setUploadName(uploadName);
            datumDownload.setPath(path);
            ddlService.addDatumDownload(datumDownload);
            part.write(getServletContext().getRealPath("/backpages/file") + "/" + path);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listDatumDownload(req, resp);
	}
	
	/**
	 * 列表查询所有的资料下载
	 * 后台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listDatumDownload(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<DatumDownload> datumDownloadList = ddlService.selsectAll();
			req.setAttribute("datumDownloadList", datumDownloadList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/download/download.jsp";
	}
	/**
	 * 列表查询所有的资料下载
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listDatumDownload2(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<DatumDownload> datumDownloadList = ddlService.selsectAll();
			req.setAttribute("datumDownloadList", datumDownloadList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/download/download_index.jsp";
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
			if(ddlService.queryById(id).getPath() != null){
				String delPath = req.getRealPath("")+"\\backpages\\file\\"+ddlService.queryById(id).getPath();
				ddlService.deleteFile(delPath);
			}
			ddlService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listDatumDownload(req, resp);
	}
	
	public String downloadFile(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String uploadName = req.getParameter("uploadName");
		try{
			//String path = getServletContext().getRealPath("/backpages/file") + "/" + name;
			String path = "http://localhost:8080/communitys/backpages/file/"+name;
			File file = new File(path);
			if(file.isFile() && file.exists()){
				DownLoadUtil.download(path, title+"-"+uploadName);
			}else{
				req.setAttribute("msg", "该资源不存在，请联系管理员将其删除！");
				return this.listDatumDownload2(req, resp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
}
