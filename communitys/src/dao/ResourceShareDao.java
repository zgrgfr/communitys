package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.ResourceShare;

public interface ResourceShareDao {

	/**
	 * 添加一个资源分享
	 * @param resourceShare
	 * @throws Exception
	 */
	public void addResourceShare(ResourceShare resourceShare) throws Exception;

	/**
	 * 根据id删除一个资源分享
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据id查找一个资源分享
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ResourceShare queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据审核情况查找对应的资源分享
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> queryByType(@Param("type") String type) throws Exception;
	
	/**
	 * 根据id修改审核情况
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id, @Param("type") String type) throws Exception; 

	/**
	 * 根据id修改资源分享
	 * @param resourceShare
	 * @throws Exception
	 */
	public void updateById(ResourceShare resourceShare) throws Exception;
	
	/**
	 * 根据社团的id查找相应的资源分享
	 * @param CommunityId
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> queryByCommunity(@Param("communityId") int communityId) throws Exception;
	
	/**
	 * 查找所有的资源共享
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> selectAll() throws Exception;
}
