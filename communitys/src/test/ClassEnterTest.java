package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.ClassEnterService;
import util.MybatisUtil;
import dao.ClassEnterDao;
import entity.ClassEnter;

public class ClassEnterTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	ClassEnterDao classEnterDao = sqlSession.getMapper(ClassEnterDao.class);
	
	public void toAdd() throws Exception{
		ClassEnter classEnter = new ClassEnter();
		classEnter.setClassId(1010);
		classEnter.setStudentId(2015012030);
		classEnterDao.addClassEnter(classEnter);
	}
	
	public void deleteById() throws Exception{
		classEnterDao.deleteById(1);
	}
	
	public ClassEnter queryById() throws Exception{
		return classEnterDao.queryById(2);
	}
	
	public List<ClassEnter> selectAll() throws Exception{
		return classEnterDao.selectAll();
	}
	
	public void updateById() throws Exception{
		ClassEnter classEnter = new ClassEnter();
		classEnter.setId(2);
		classEnter.setClassId(2020);
		classEnter.setStudentId(2015012007);
		classEnterDao.updateById(classEnter);
	}
	
	public static void main(String args[]) throws Exception{
		ClassEnterTest classEnterTest = new ClassEnterTest();
	    ClassEnterService classEnterService = new ClassEnterService();
		/*classEnterTest.toAdd();
		classEnterTest.deleteById();
		System.out.println(classEnterTest);
		for(ClassEnter classEnter : classEnterTest.selectAll()){
			System.out.println(classEnter);
		}*/
		//classEnterTest.updateById();
		List<ClassEnter> classEnterList = classEnterService.queryByclassId(1);
		System.out.println(classEnterList.size());
	}
}
