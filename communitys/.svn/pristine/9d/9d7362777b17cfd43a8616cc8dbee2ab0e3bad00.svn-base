package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.CommunityBook;

public interface CommunityBookDao {

	/**
	 * 添加一个社团宝典
	 * @param communityBook
	 * @throws Exception
	 */
	public void addCommunityBook(CommunityBook communityBook) throws Exception;
	/**
	 * 根据id删除一个社团宝典
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	/**
	 * 根据id查找一个社团宝典
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityBook queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据id修改一个社团宝典
	 * @param id
	 * @param communityBook
	 * @throws Exception
	 */
	public void updateById(CommunityBook communityBook) throws Exception;
	
	/**
	 * 查询所有的社团宝典
	 * @return
	 * @throws Exception
	 */
	public List<CommunityBook> selectAll() throws Exception;
}
