/**
 * 
 */
package service;

import java.io.File;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.DatumDownloadDao;
import entity.DatumDownload;

/**
 * 资料的Service
 * @author shanjizhong
 *
 */
public class DatumDownloadService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	DatumDownloadDao datumDownloadDao = sqlSession.getMapper(DatumDownloadDao.class);
	
	/**
	 * 添加一条资料
	 * @param datumDownload
	 * @throws Exception
	 */
	public void addDatumDownload(DatumDownload datumDownload) throws Exception {
		datumDownloadDao.addDatumDownload(datumDownload);
	}
		
	/**
	 * 根据Id删除一条资料
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		datumDownloadDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找返回一个社团简介
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public DatumDownload queryById(int id) throws Exception{
		return datumDownloadDao.queryById(id);
	}
	
	/**
	 * 找到所有的社团简介
	 * @return
	 * @throws Exception
	 */
	public List<DatumDownload> selsectAll() throws Exception{
		return datumDownloadDao.selectAll();
	}
	
	/**
	 * 根据Id修改
	 * @param datumDownload
	 * @throws Exception
	 */
	public void updateById(DatumDownload datumDownload) throws Exception{
		datumDownloadDao.updateById(datumDownload);
	}
	
	/**
	 * 根据路径删除文件
	 * @param delPath
	 */
	public void deleteFile(String delPath) {
		  File file = new File(delPath);
		  // 路径为文件且不为空则进行删除
		  if (file.isFile() && file.exists()) {
		    file.delete();
		  }
		}
}
