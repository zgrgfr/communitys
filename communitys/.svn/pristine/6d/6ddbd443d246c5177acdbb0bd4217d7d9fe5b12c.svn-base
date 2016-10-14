package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.PlaceApply;

import service.PlaceApplyService;
import util.MybatisUtil;

public class PlaceApplyTest {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	PlaceApplyService PAS = new PlaceApplyService();
//	public void toAdd() throws Exception{
//		PlaceApply placeApply = new PlaceApply();
//		placeApply.setCampus("净月");
//		placeApply.setPlace("图书馆");
//		placeApply.setAccountId(2015012030);
//		placeApply.setDayTime("5月12日");
//		placeApply.setHourTime("8:00-9:00");
//		placeApply.setUses("打篮球");
//		placeApply.setType("未审核");
//		PAS.addPlaceApply(placeApply);
//	}
	
	public void delete() throws Exception{
		PAS.deleteById(1);
	}
	
	public PlaceApply queryById() throws Exception{
		return PAS.queryById(2);
	}
	
	public List<PlaceApply> selectAll() throws Exception{
		return PAS.selectAll();
	}
	
	public List<PlaceApply> queryByType() throws Exception{
		return PAS.queryByType("未审核");
	}
	
	public void updateTypeById() throws Exception{
		PAS.updateTypeById("审核通过", 2);
	}
	
//	public void updateById() throws Exception{
//		PlaceApply placeApply = new PlaceApply();
//		placeApply.setId(3);
//		placeApply.setCampus("本部");
//		placeApply.setPlace("教学楼");
//		placeApply.setAccountId(2015012030);
//		placeApply.setDayTime("10月10日");
//		placeApply.setHourTime("12:00-14:00");
//		placeApply.setUses("打篮球");
//		placeApply.setType("审核通过");
//		PAS.updateById(placeApply);
//	}
	
	public static void main(String args[]) throws Exception{
		String dayChange = "";
		String day = "2016-12-15";
		System.out.println(day);
		System.out.println(day.split("-")[1]);
		if(Integer.parseInt(day.split("-")[1]) < 10){
			dayChange = "0".concat(day.split("-")[1]);
		}else{
			dayChange = day.split("-")[1];
		}
		System.out.println(dayChange);
	}
}
