package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.AccountDao;
import dao.PlaceDao;
import entity.Account;
import entity.Place;
/**
 * 账号的Service
 * @author guofengrui
 *
 */
public class PlaceService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	PlaceDao plaDao = sqlSession.getMapper(PlaceDao.class);
	
	/**
	 * 新增一条地点
	 * @param place
	 * @throws Exception
	 */
	public void addPlace(Place place) throws Exception{
		plaDao.addPlace(place);
	}
	
	/**
	 * 根据Id删除用户
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		plaDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找到地点
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Place queryById(@Param("id") int id) throws Exception{
		return plaDao.queryById(id);
	}
	
	/**
	 * 根据Campus查找到相应的用户
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Place> queryByCampus(@Param("campus") String campus) throws Exception{
		return plaDao.queryByCampus(campus);
	}
	
	/**
	 * 查找所有的地点信息
	 * @return
	 * @throws Exception
	 */
	public List<Place> selectAll() throws Exception{
		return plaDao.selectAll();
	}
}
