/**
 * 
 */
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.ClassEnter;



public interface ClassEnterDao {
	/**
	 * 添加classEnter
	 * @param classEnter
	 * @throws Exception
	 */
	public void addClassEnter(ClassEnter classEnter) throws Exception;
	
	/**
	 * 根据ID删除ClassEnter
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ClassEnter queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 查找所有ClassEnter
	 * @return
	 * @throws Exception
	 */
	public List<ClassEnter> selectAll() throws Exception;
	
	/**
	 * 根据ID修改
	 * @param classEnter
	 * @throws Exception
	 */
	public void updateById(ClassEnter classEnter) throws Exception;
	
	/**
	 * 根据课程id查找
	 * @param classId
	 * @return
	 * @throws Exception
	 */
	public List<ClassEnter> queryByclassId(@Param("classId") int classId) throws Exception;
	
	/**
	 * 根据课程Id和账户Id查找ClassEnter
	 * @param classId
	 * @param accountId
	 * @return
	 * @throws Exception
	 */
	public ClassEnter queryByClassIdAndAccountId(@Param("classId") int classId, @Param("accountId") int accountId) throws Exception;
}
