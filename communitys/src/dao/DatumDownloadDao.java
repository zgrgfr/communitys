package dao;

import java.util.List;

import entity.DatumDownload;

public interface DatumDownloadDao {
	/**
	 * 添加一条资料
	 * @param datumDownload
	 * @throws Exception
	 */
	public void addDatumDownload(DatumDownload datumDownload)throws Exception;
	
	/**
	 * 删除一条资料
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id)throws Exception;
	
	/**
	 * 通过id查找相应的资料
	 * @param id
	 */
	public DatumDownload queryById(int id) throws Exception;
	
	/**
	 * 找到所有的资料
	 * @return
	 */
	public List<DatumDownload> selectAll() throws Exception;
	
	/**
	 * 根据ID修改
	 * @param datumDownload
	 * @throws Exception
	 */
	public void updateById(DatumDownload datumDownload) throws Exception;
}
