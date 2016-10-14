package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.CommunityAdminDao;
import entity.CommunityAdmin;
/**
 * 账号的Service
 * @author guofengrui
 *
 */
public class CommunityAdminService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	CommunityAdminDao coaDao = sqlSession.getMapper(CommunityAdminDao.class);
	
	/**
	 * 根据账号id查找社团的Id
	 * @param accountId
	 * @return
	 * @throws Exception
	 */
	public int queryCommunityIdByAccountId(int accountId) throws Exception{
		if(coaDao.queryCommunityIdByAccountId(accountId) == null){
			return 0;
		}else{
			return coaDao.queryCommunityIdByAccountId(accountId);
		}
	}
	
	/**
	 * 添加一条管理员信息
	 * 判断这个账号是否在表中已存在，存在的话不能添加数据
	 * @param communityId
	 * @param accountId
	 * @throws Exception
	 */
	public void addCommunityAdmin(int communityId,int accountId) throws Exception{
		if(this.queryCommunityIdByAccountId(accountId) == 0 ){
			coaDao.addCommunityAdmin(communityId, accountId);
		}
	}
	
	
}
