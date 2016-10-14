package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Account;
import entity.Place;


public interface PlaceDao {
	/**
	 * 添加一条地点
	 * @param account
	 * @throws Exception
	 */
	public void addPlace(Place place) throws Exception;

	/**
	 * 根据id删除一条地点
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Id查找到地点
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Place queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Campus查找到相应的用户
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Place> queryByCampus(@Param("campus") String campus) throws Exception;
	
	/**
	 * 查找所有的地点信息
	 * @return
	 * @throws Exception
	 */
	public List<Place> selectAll() throws Exception;
	
	
}
