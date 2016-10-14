package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.SocialPrograms;

import service.SocialProgramsService;
import util.MybatisUtil;

public class SocialProgramsTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	SocialProgramsService SPS = new SocialProgramsService();
	
	public void toAdd() throws Exception{
		SocialPrograms socialPrograms = new SocialPrograms();
		socialPrograms.setName("全国ACM竞赛");
		socialPrograms.setHolder("东北师范大学软件学院");
		socialPrograms.setActivityTime("5月12日");
		socialPrograms.setActivityContent("就是ACM");
		socialPrograms.setSupportContent("康师傅牛肉面");
		socialPrograms.setType("未审核");
		SPS.addSocialPrograms(socialPrograms);
	}
	
	public void delete() throws Exception{
		SPS.deleteById(1);
	}
	
	public SocialPrograms queryById() throws Exception{
		return SPS.queryById(2);
	}
	
	public List<SocialPrograms> selectAll() throws Exception{
		return SPS.selectAll();
	}
	
	public List<SocialPrograms> queryByType() throws Exception{
		return SPS.queryByType("未审核");
	}
	
	public void updateTypeById() throws Exception{
		SPS.updateTypeById("审核通过", 2);
	}
	
	public void updateById() throws Exception{
		SocialPrograms socialPrograms = new SocialPrograms();
		socialPrograms.setId(3);
		socialPrograms.setName("吃鸡翅大赛");
		socialPrograms.setHolder("东北师范大学雕塑们KFC");
		socialPrograms.setActivityTime("10月10日");
		socialPrograms.setActivityContent("就是吃鸡翅！");
		socialPrograms.setSupportContent("麦当劳");
		socialPrograms.setType("审核通过");
		SPS.updateById(socialPrograms);
	}
	
	public static void main(String args[]) throws Exception{
		SocialProgramsTest SPT = new SocialProgramsTest();
		SPT.toAdd();
		SPT.delete();
		System.out.println(SPT.queryById());
		for(SocialPrograms sp : SPT.selectAll()){
			System.out.println(sp);
		}
		SPT.updateById();
		SPT.updateTypeById();
		for(SocialPrograms sp : SPT.queryByType()){
			System.out.println(sp);
		}
	}
}
