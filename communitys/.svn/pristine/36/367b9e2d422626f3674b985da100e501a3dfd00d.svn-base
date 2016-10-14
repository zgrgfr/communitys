package test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.ClassService;
import util.DateUtil;
import util.MybatisUtil;
import dao.ClassDao;
import entity.Class;

public class ClassTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	ClassDao classDao = sqlSession.getMapper(ClassDao.class);
	public void toAdd() throws Exception{
		Class c = new Class();
		c.setAuthor("单继重");
		c.setClassType("体育");
		c.setContent("教你如何打篮球");
		c.setIntroduce("这个课就是教你怎么打篮球");
		c.setName("篮球");
		c.setSchool("东北师范大学");
		c.setStartTime("周日");
		c.setEndTime("周日");
		c.setCommunityId(1);
		c.setType("未审核");
		classDao.addClass(c);
	}
	
	public void delectById() throws Exception{
		classDao.deleteById(1);
	}
	
	public Class queryById() throws Exception{
		return classDao.queryById(2);
	}
	
//	public List<Class> queryByType() throws Exception{
//		return classDao.queryByType("未审核");
//	}
	
	public void updateTypeById() throws Exception{
		classDao.updateTypeById(2, "审核通过");
	}
	
	
	public static void main(String args[]) throws Exception {
		System.out.println(DateUtil.StringToDate("1970-01-01 00:00:00"));
	}
}
