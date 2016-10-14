package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Account;
import entity.HomeCarousel;


public interface HomeCarouselDao {
	/**
	 * 添加一条首页轮播
	 * @param account
	 * @throws Exception
	 */
	public void addHomeCarousel(HomeCarousel homeCarousel) throws Exception;

	/**
	 * 根据id删除一条首页轮播
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据Id查找到首页轮播
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public HomeCarousel queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据showType查找到相应的首页轮播
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<HomeCarousel> queryByShowType(@Param("showType") String showType) throws Exception;
	
	/**
	 * 根据Id修改是否能首页显示
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateShowTypeById(@Param("id") int id,@Param("showType")String showType) throws Exception;
	
	/**
	 * 查找所有的首页轮播
	 * @return
	 * @throws Exception
	 */
	public List<HomeCarousel> selectAll() throws Exception;
	
}
