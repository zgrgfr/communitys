package test;

import entity.CommunityShow;
import service.CommunityShowService;

public class CommunityShowTest {
	public static void main(String[] args) throws Exception{
		CommunityShowService css = new CommunityShowService();
//		CommunityShow cs = new CommunityShow();
//		cs.setCampus("测试校区");
//		cs.setCommunityType("测试类型");
//		cs.setGrade("测试等级");
//		cs.setLogo("测试logo");
//		cs.setType("审核通过");
//		css.addCommunityShow(cs);
//		System.out.println(css.queryById(1).getCampus());
//		System.out.println(css.queryByType("审核通过").get(0).getCampus());
//		css.updateTypeById(1, "未审核");
//		System.out.println(css.queryById(1).getType());
//		CommunityShow cs2 = new CommunityShow();
//		cs2.setId(1);
//		cs2.setCampus("测试校区2");
//		cs2.setCommunityType("测试类型2");
//		cs2.setGrade("测试等级2");
//		cs2.setLogo("测试logo2");
//		cs2.setType("审核不通过");
//		css.updateById(cs2);
//		System.out.println(css.queryById(1).getCampus());
		css.deleteById(1);
		css.listByAllCondition("净月", "D", "公益服务", "审核通过");
	}
}
