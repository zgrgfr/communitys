package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Account;
import entity.CommunityCorporator;


public interface CommunityCorporatorDao {
	/**
	 * 添加一条社团成员
	 * @param account
	 * @throws Exception
	 */
	public void addCommunityCorporator(CommunityCorporator communityCorporator) throws Exception;

	/**
	 * 根据id删除一条社团成员
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Id查找到社团成员
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityCorporator queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Type查找到相应的社团成员
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<CommunityCorporator> queryByType(@Param("type") String type) throws Exception;
	
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;
	
	
	/**
	 * 根据社团Id查找所有的社团成员
	 * @return
	 * @throws Exception
	 */
	public List<CommunityCorporator> selectAllByCommunityId(@Param("communityId") int communityId) throws Exception;
	
	/**
	 * 根据账号Id和社团Id查找到社团成员
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityCorporator queryByAccountIdAndCommunityId(@Param("accountId") int accountId,@Param("communityId") int communityId) throws Exception;
	
}
