package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.CommunityDao;
import dao.LeaguesIntroduceDao;
import entity.Community;
import entity.LeaguesIntroduce;
/**
 * 社联简介的Service
 * @author guofengrui
 *
 */
public class LeaguesIntroduceService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	LeaguesIntroduceDao leaDao = sqlSession.getMapper(LeaguesIntroduceDao.class);
	
	/**
	 * 添加一条社联简介
	 * @param community
	 * @throws Exception
	 */
	public void addLeaguesIntroduce(LeaguesIntroduce leaguesIntroduce) throws Exception{
		leaDao.addLeaguesIntroduce(leaguesIntroduce);
	}
		
	/**
	 * 根据Id删除一条社联简介
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		leaDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找返回一个社联简介
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public LeaguesIntroduce queryById(int id) throws Exception{
		return leaDao.queryById(id);
	}
	
	/**
	 * 找到所有的社团简介
	 * @return
	 * @throws Exception
	 */
	public List<LeaguesIntroduce> selsectAll() throws Exception{
		return leaDao.selectAll();
	}
	
	
	/**
	 * 根据id修改社团简介
	 * @param community
	 * @throws Exception
	 */
	public void updateById(LeaguesIntroduce leaguesIntroduce) throws Exception{
		leaDao.updateById(leaguesIntroduce);
	}
	
	/**
	 * 根据显示状态和审核状态查询数据
	 * @param type
	 * @param showType
	 * @return
	 * @throws Exception
	 */
	public List<LeaguesIntroduce> queryByTypeAndShowType(String type,String showType) throws Exception{
		return leaDao.queryByTypeAndShowType(type, showType);
	}
	
	/**
	 * 根据Id修改显示状态
	 * @param id
	 * @param showType
	 * @throws Exception
	 */
	public void updateShowTypeById(int id,String showType) throws Exception{
		leaDao.updateShowTypeById(id, showType);
	}
	
	/**
	 * 根据Id修改审核状态
	 * @param id
	 * @param showType
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type") String type) throws Exception{
		leaDao.updateTypeById(id, type);
	}
}
