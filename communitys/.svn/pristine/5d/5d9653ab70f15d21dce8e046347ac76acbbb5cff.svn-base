package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Class;

public interface ClassDao {
	/**
	 * 添加一个课程
	 * @param class
	 * @throws Exception
	 */
	public void addClass(Class Class) throws Exception;
	
	/**
	 * 根据id删除一个课程
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Id查找到课程
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Class queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Type查找到相应的课程
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Class> queryByTypeAndclassType(@Param("type") String type,@Param("classType") String classType) throws Exception;
	
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;

	/**
	 * 根据ID更改课程
	 * @param id
	 * @param Class
	 * @throws Exception
	 */
	public void updateById(Class Class)throws Exception;
	
	/**
	 * 根据社团Id查找相应的课程
	 * @return
	 * @throws Exception
	 */
	public List<Class> queryByCommunityId(@Param("communityId") int communityId) throws Exception;
	
	/**
	 * 查询所有的精品课程
	 * @return
	 * @throws Exception
	 */
	public List<Class> selectAll() throws Exception;
}
