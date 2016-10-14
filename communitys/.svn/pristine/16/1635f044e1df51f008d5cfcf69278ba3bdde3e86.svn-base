package test;

import entity.CommunityPresence;
import service.CommunityPresenceService;

public class CommunityPresenceTest {
	public static void main(String[] args) throws Exception {
		CommunityPresenceService cps = new CommunityPresenceService();
//		CommunityPresence cp = new CommunityPresence();
//		cp.setTitle("测试标题");
//		cp.setAuthor("测试作者");
//		cp.setContent("测试内容");
//		cp.setTime("测试时间");
//		cp.setArticleType("社团风采");
//		cp.setType("审核通过");
//		cp.setId(2);
//		cps.addCommunityPresence(cp);
//		System.out.println(cps.queryById(1).getContent());
//		System.out.println(cps.queryByArticleType("社团风采").get(0).getAuthor());
		System.out.println(cps.queryByType("审核通过","社团风采").get(0).getTime());
//		cps.updateArticleTypeById(1, "社团动态");
//		System.out.println(cps.queryById(1).getArticleType());
//		cps.updateById(cp);
//		System.out.println(cps.queryById(1).getType());
//		System.out.println(cps.queryByCommunityId(5));
		/*CommunityPresence cp2 = new CommunityPresence();
		cp2.setTitle("测试标题2");
		cp2.setAuthor("测试作者2");
		cp2.setContent("测试内容2");
		cp2.setTime("测试时间2");
		cp2.setArticleType("社团风采2");
		cp2.setType("未审核");
		cp2.setId(1);
		cps.updateById(cp2);
		System.out.println(cps.queryById(1).getContent());
		cps.deleteById(1);*/
	}
}