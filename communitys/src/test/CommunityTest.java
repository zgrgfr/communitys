package test;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.CommunityDao;
import entity.Community;
import service.CommunityService;
public class CommunityTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	CommunityDao communityDao = sqlSession.getMapper(CommunityDao.class);
	public void toAdd() throws Exception{
		Community community = new Community();
		community.setName("篮球社");
		community.setNameHead("篮球社社长");
		community.setPhone("110");
		community.setStudentIdNumber("2014012152");
		community.setContent("篮球社是一个温暖的大家庭");
		communityDao.addCommunity(community);
	}
	
	public void deleteById() throws Exception{
		communityDao.deleteById(1);
	}
	
	public Community queryById() throws Exception{
		return communityDao.queryById(1);
	}
	
	public List<Community> selectAll() throws Exception{
		return communityDao.selectAll();
	}
	public static void main(String args[]) throws Exception{
		/*CommunityTest communityTest = new CommunityTest();
		communityTest.toAdd();
		//System.out.print(communityTest.queryById().toString());
		for(Community community : communityTest.selectAll()){
			System.out.println(community.toString());
		}*/
		CommunityService communityService = new CommunityService();
		communityService.queryById(5);
//		Community community = new Community();
//		community.setName("篮球社");
//		community.setNameHead("篮球社社长");
//		community.setPhone("110");
//		community.setStudentIdNumber("2014012152");
//		community.setContent("篮球社是一个温暖的大家庭");
//		community.setType("审核未审批");
//		communityService.addCommunity(community);
		List<Community> communityList = communityService.selsectAll();
		System.out.println(communityList.size());
		//communityService.selsectAll();
	}
}
