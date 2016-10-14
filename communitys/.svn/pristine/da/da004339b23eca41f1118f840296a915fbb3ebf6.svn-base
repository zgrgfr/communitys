package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.SocialProgramsDao;
import entity.SocialPrograms;

import util.MybatisUtil;

/**
 * 社会项目的Service
 * @author shanjizhong
 *
 */ 
public class SocialProgramsService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	SocialProgramsDao socialProgramsDao = sqlSession.getMapper(SocialProgramsDao.class);
	
	/**
	 * 添加一个社会项目
	 * @param SocialPrograms
	 * @throws Exception
	 */
	public void addSocialPrograms(SocialPrograms socialPrograms) throws Exception{
		socialProgramsDao.addSocialPrograms(socialPrograms);
	}
	
	/**
	 * 根据Id删除社会项目
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		socialProgramsDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找社会项目
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public SocialPrograms queryById(int id) throws Exception{
		return socialProgramsDao.queryById(id);
	}
	
	/**
	 * 查找所有社会项目
	 * @return list
	 * @throws Exception
	 */
	public List<SocialPrograms> selectAll() throws Exception{
		return socialProgramsDao.selectAll();
	}
	
	/**
	 * 根据type找到相应的项目
	 * @param type
	 * @return list
	 * @throws Exception
	 */
	public List<SocialPrograms> queryByType(String type) throws Exception{
		return socialProgramsDao.queryByType(type);
	}
	
	/**
	 * 根据Id改变某个项目的审核状态
	 * @param type
	 * @param id type
	 * @throws Exception
	 */
	public void updateTypeById(String type, int id) throws Exception{
		socialProgramsDao.updateTypeById(id, type);
	}
	
	/**
	 * 根据ID修改项目
	 * @param id
	 * @param SocialPrograms
	 * @throws Exception
	 */
	public void updateById(SocialPrograms socialPrograms)throws Exception{
		socialProgramsDao.updateById(socialPrograms);
	}
}
