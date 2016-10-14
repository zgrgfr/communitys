package test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import service.DatumDownloadService;
import util.MybatisUtil;
import entity.DatumDownload;


public class DatumDownloadTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	DatumDownloadService datumDownloadService = new DatumDownloadService();
	public void toAdd() throws Exception{
		DatumDownload datumDownload = new DatumDownload();
		datumDownload.setPath("admin/admin");
		datumDownload.setTitle("资料1");
		datumDownload.setUploadName("单继重");
		datumDownloadService.addDatumDownload(datumDownload);
	}
	
	public void deleteById() throws Exception{
		datumDownloadService.deleteById(1);
	}
	
	public DatumDownload queryById() throws Exception{
		return datumDownloadService.queryById(2);
	}
	
	public List<DatumDownload> selectAll() throws Exception{
		return datumDownloadService.selsectAll();
	}
	
	public void updateById() throws Exception{
		DatumDownload datumDownload = new DatumDownload();
		datumDownload.setId(2);
		datumDownload.setPath("admin/admin1");
		datumDownload.setTitle("资料2");
		datumDownload.setUploadName("董丝纶");
		datumDownloadService.updateById(datumDownload);
	}
	public static void main(String args[]) throws Exception{
//		DatumDownloadTest DDT = new DatumDownloadTest();
//		DDT.toAdd();
//		DDT.deleteById();
//		System.out.println(DDT.queryById());
//		for(DatumDownload datumDownload : DDT.selectAll()){
//			System.out.println(datumDownload);
//		}
//		DDT.updateById();
	}
}
