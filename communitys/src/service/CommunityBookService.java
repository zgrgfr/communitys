package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.CommunityBookDao;
import entity.CommunityBook;

/**
 * 社团宝典的Service
 * @author 我要睡觉了
 *
 */
public class CommunityBookService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	CommunityBookDao communityBookDao = sqlSession.getMapper(CommunityBookDao.class);
	
	/**
	 * 添加一条社团宝典
	 * @param communityBook
	 * @throws Exception
	 */
	public void addCommunityBook(CommunityBook communityBook) throws Exception { 
		communityBookDao.addCommunityBook(communityBook);
	}
	
	/**
	 * 删除一条社团宝典
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception {
		communityBookDao.deleteById(id);
	}
	
	/**
	 * 根据id查找一条社团宝典
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityBook queryById(@Param("id") int id) throws Exception {
		return communityBookDao.queryById(id);
	}
	
	
	public void updateById(CommunityBook communityBook) throws Exception {
		communityBookDao.updateById(communityBook);
	}
	/**
	 *  查询所有的社团宝典
	 * @return
	 * @throws Exception
	 */
	public List<CommunityBook> selectAll() throws Exception{
		return communityBookDao.selectAll();
	}
}
