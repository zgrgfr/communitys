package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.CommunityPresence;

public interface CommunityPresenceDao {
	
	/**
	 * 添加一篇社团风采报道
	 * @param communityPresence
	 * @throws Exception
	 */
	public void addCommunityPresence(CommunityPresence communityPresence) throws Exception;
	
	/**
	 * 删除一条物品借用申请
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据id查找一条报道
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityPresence queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据文章审核状态找到相应的文章
	 * @param articleType
	 * @return
	 * @throws Exception
	 */
	public List<CommunityPresence> queryByType(@Param("type") String type,@Param("articleType") String articleType) throws Exception;
	
	/**
	 * 根据文章类型找到相应的文章
	 * @param articleType
	 * @return
	 * @throws Exception
	 */
	public List<CommunityPresence> queryByArticleType(@Param("articleType") String articleType) throws Exception;
	
	/**
	 * 根据id修改一篇文章的文章类型
	 * @param id
	 * @param articleType
	 * @throws Exception
	 */
	public void updateArticleTypeById(@Param("id") int id, @Param("articleType") String articleType) throws Exception;
	
	/**
	 * 根据id修改一篇文章的审核状况
	 * @param id
	 * @param articleType
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id, @Param("type") String type) throws Exception;
	
	/**
	 * 根据id修改一篇文章
	 * @param communityPresence
	 * @throws Exception
	 */
	public void updateById(CommunityPresence communityPresence) throws Exception;
	
	/**
	 * 根据社团id查找相应的社团风采，社团动态
	 * @param communityId
	 * @return
	 * @throws Exception
	 */
	public List<CommunityPresence> queryByCommunityId(@Param("communityId") int communityId) throws Exception;
	
	/**
	 * 查找所有的社团风采和社团动态
	 * @return
	 * @throws Exception
	 */
	public List<CommunityPresence> selectAll() throws Exception;
}
