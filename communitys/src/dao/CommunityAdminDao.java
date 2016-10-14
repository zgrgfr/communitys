package dao;

import org.apache.ibatis.annotations.Param;

import entity.Community;

/**
 * 社团和账户链接
 * @author 郭丰瑞
 *
 */
public interface CommunityAdminDao {
	
	/**
	 * 根据账户id查找社团id
	 * @param accountId
	 * @return
	 * @throws Exception
	 */
	public Integer queryCommunityIdByAccountId(@Param("accountId") int accountId) throws Exception;

	/**
	 * 添加一条管理员信息
	 * @param communityId
	 * @param accountId
	 * @throws Exception
	 */
	public void addCommunityAdmin(@Param("communityId") int communityId,@Param("accountId") int accountId) throws Exception;
}
