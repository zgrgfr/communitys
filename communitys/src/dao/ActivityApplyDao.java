package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.ActivityApply;


public interface ActivityApplyDao {
	
	/**
	 * 添加一条活动申请
	 * @param ActivityApply
	 * @throws Exception
	 */
	public void addActivityApply(ActivityApply activityApply) throws Exception;

	/**
	 * 删除一条活动申请
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	

	/**
	 * 根据ID查找一条活动申请
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ActivityApply queryById(@Param("id") int id) throws Exception;
	
	
	/**
	 * 根据审核状态找到相应的活动申请
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ActivityApply> queryByType(@Param("type") String type) throws Exception;
	
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;
	
	/**
	 * 查找所有的数据
	 * @return
	 * @throws Exception
	 */
	public List<ActivityApply> selectAll() throws Exception;
	
	/**
	 * 修改一条数据
	 */
	public void updateById(ActivityApply activityApply) throws Exception;
	
	/**
	 * 根据账号Id找到相应社团的活动申请
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ActivityApply> queryByAccountId(@Param("accountId") int accountId) throws Exception;
}
