package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.AccountDao;
import entity.Account;
/**
 * 账号的Service
 * @author guofengrui
 *
 */
public class AccountService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	AccountDao accDao = sqlSession.getMapper(AccountDao.class);
	
	/**
	 * 添加一条用户
	 * @param account
	 * @throws Exception
	 */
	public void addAccount(Account account) throws Exception{
		accDao.addAccount(account);
	}
	
	/**
	 * 根据Id删除用户
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		accDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Account queryById(int id) throws Exception{
		sqlSession.clearCache();
		return accDao.queryById(id);
	}
	
	/**
	 * 根据type找到相应的用户
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<Account> queryByType(String type) throws Exception{
		sqlSession.clearCache();
		return accDao.queryByType(type);
	}
	
	/**
	 * 根据Id改变某个用户的审核状态
	 * @param type
	 * @param id
	 * @throws Exception
	 */
	public void updateTypeById(String type, int id) throws Exception{
		accDao.updateTypeById(id, type);
	}
	
	/**
	 * 根据Id改变某个用户的身份状态
	 * @param type
	 * @param id
	 * @throws Exception
	 */
	public void updateRoleById(String role, int id) throws Exception{
		accDao.updateRoleById(id, role);
	}
    
	/**
	 * 根据账号密码查找这个账户的信息 
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Account queryByAccountAndPassword(String account , String password) throws Exception{
		sqlSession.clearCache();
		return accDao.queryByAccountAndPassword(account, password);
	}
	
	/**
	 * 查找所有的账户信息
	 * @return
	 * @throws Exception
	 */
	public List<Account> selectAll() throws Exception{
		sqlSession.clearCache();
		return accDao.selectAll();
	}
	
	/**
	 * 根据Id修改场地申请权限
	 * @param id
	 * @param placeRole
	 * @throws Exception
	 */
	public void updatePlaceRoleById(@Param("id") int id,@Param("placeRole")String placeRole) throws Exception{
		accDao.updatePlaceRoleById(id, placeRole);
	}
	
	/**
	 * 根据Id修改场地申请权限
	 * @param id
	 * @param placeRole
	 * @throws Exception
	 */
	public void updateRoleById(@Param("id") int id,@Param("role")String role) throws Exception{
		accDao.updateRoleById(id, role);
	}
	
	
	/**
	 * 根据账号查找这个账户的信息 
	 * @param account
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Account queryByAccount(String account) throws Exception{
		sqlSession.clearCache();
		return accDao.queryByAccount(account);
	}
	
}
