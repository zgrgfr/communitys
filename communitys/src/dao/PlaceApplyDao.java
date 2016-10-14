/**
 * 
 */
package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.PlaceApply;

/**
 * @Title PlaceApplyDao
 * @author 单继重
 *
 * @time 2016-8-1下午4:50:05
 */
public interface PlaceApplyDao {
	/**
	 * 添加一个申请
	 * @param placeApply
	 * @throws Exception
	 */
	public void addPlaceApply(PlaceApply placeApply) throws Exception;
	
	/**
	 * 根据id删除一个申请
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Id查找到申请
	 * @param id
	 * @return placeApply
	 * @throws Exception
	 */
	public PlaceApply queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Type查找到相应的课程
	 * @param type
	 * @return list
	 * @throws Exception
	 */
	public List<PlaceApply> queryByType(@Param("type") String type) throws Exception;
	
	/**
	 * 查找所有申请
	 * @return list
	 */
	public List<PlaceApply> selectAll() throws Exception;
		
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;
	
	/**
	 * 根据ID修改
	 * @param placeApply
	 * @throws Exception
	 */
	public void updateById(PlaceApply placeApply) throws Exception;
	
	/**
	 * 根据传入的参数找到对应的场地申请
	 * @param campus
	 * @param place
	 * @param monday
	 * @param sunday
	 * @return
	 * @throws Exception
	 */
	public List<PlaceApply> queryByAllCondition(@Param("campus") String campus,@Param("place") String place, @Param("monday") String monday,@Param("sunday") String sunday) throws Exception;
}
