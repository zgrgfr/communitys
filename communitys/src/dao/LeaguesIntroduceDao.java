package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Community;
import entity.LeaguesIntroduce;;

public 	interface LeaguesIntroduceDao {
	/**
	 * 添加一条社联的简介
	 * @param community
	 */
	public void addLeaguesIntroduce(LeaguesIntroduce leaguesIntroduce) throws Exception;
	
	/**
	 * 删除一条社联简介
	 * @param id
	 */
	public void deleteById(int id) throws Exception;
	
	/**
	 * 通过id查找相应的社联简介
	 * @param id
	 */
	public LeaguesIntroduce queryById(int id) throws Exception;
	
	/**
	 * 找到所有的社联简介
	 * @return
	 */
	public List<LeaguesIntroduce> selectAll() throws Exception;
	
	/**
	 * 根据id进行更新社联简介的信息
	 * @param id
	 * @throws Exception
	 */
	public void updateById(LeaguesIntroduce leaguesIntroduce) throws Exception;
	
	/**
	 * 根据显示状态和审核状态查询相应的数据
	 * @param type
	 * @param showType
	 * @return
	 * @throws Exception
	 */
	public List<LeaguesIntroduce> queryByTypeAndShowType(@Param("type") String type,@Param("showType") String showType) throws Exception;

	/**
	 * 根据Id修改显示状态
	 * @param id
	 * @param showType
	 * @throws Exception
	 */
	public void updateShowTypeById(@Param("id") int id,@Param("showType") String showType) throws Exception;
	
	/**
	 * 根据Id修改审核状态
	 * @param id
	 * @param showType
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type") String type) throws Exception;
}
