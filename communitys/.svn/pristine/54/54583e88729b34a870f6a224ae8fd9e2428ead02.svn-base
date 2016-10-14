package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import dao.ClassEnterDao;
import entity.Account;
import entity.ClassEnter;
import util.MybatisUtil;

/**
 * class_enter的Service
 * @author shanjizhong
 *
 */
public class ClassEnterService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	ClassEnterDao classEnterDao = sqlSession.getMapper(ClassEnterDao.class);
	private AccountService accountService = new AccountService();
	/**
	 * 添加一条class_enter
	 * @param classEnter
	 * @throws Exception
	 */
	public void addClassEnter(ClassEnter classEnter) throws Exception{
			classEnterDao.addClassEnter(classEnter);
	}
		
	/**
	 * 根据Id删除一条class_enter
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		classEnterDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找返回一个class_enter
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ClassEnter queryById(int id) throws Exception{
		return classEnterDao.queryById(id);
	}
	
	/**
	 * 找到所有的class_enter
	 * @return
	 * @throws Exception
	 */
	public List<ClassEnter> selsectAll() throws Exception{
		return classEnterDao.selectAll();
	}
	
	/**
	 * 根据ID修改
	 * @param classEnter
	 * @throws Exception
	 */
	public void updateById(ClassEnter classEnter)throws Exception{
		classEnterDao.updateById(classEnter);
	}
	
	/**
	 * 根据课程Id查找
	 * @param classId
	 * @return
	 * @throws Exception
	 */
	public List<ClassEnter> queryByclassId(int classId) throws Exception{
		sqlSession.clearCache();
		return classEnterDao.queryByclassId(classId);
	}
	
	/**
	 * 根据课程Id找到所有报名参加该课程的学生
	 * @param classId
	 * @return
	 * @throws Exception
	 */
	public List<Account> queryAccountByClassId(int classId) throws Exception{
		List<ClassEnter> classEnterList = this.queryByclassId(classId);
		List<Account> accountList = new ArrayList<Account>();
		if(classEnterList.size() != 0){
			for(ClassEnter classEnter : classEnterList){
				if(classEnter.getStudentId() != 0){
					Account account = accountService.queryById(classEnter.getStudentId());
					accountList.add(account);
				}
			}
		}
		return accountList;
	}
	
	/**
	 * 根据课程Id和账户Id查找ClassEnter
	 * @param classId
	 * @param accountId
	 * @return
	 * @throws Exception
	 */
	public ClassEnter queryByClassIdAndAccountId(@Param("classId") int classId, @Param("accountId") int accountId) throws Exception{
		return classEnterDao.queryByClassIdAndAccountId(classId, accountId);
	}
	
	/**
	 * 判断这个用户是否可以报这个课程
	 * 可以返回true
	 * 不可以返回false
	 * @param classId
	 * @param accountId
	 * @return
	 * @throws Eception
	 */
	public boolean judgeEnterClass(int classId, int accountId)throws Exception{
		return this.queryByClassIdAndAccountId(classId, accountId) == null;
	}
}
