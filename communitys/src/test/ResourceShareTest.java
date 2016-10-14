package test;

import entity.ResourceShare;
import service.ResourceShareService;

public class ResourceShareTest {
	public static void main(String[] args) throws Exception {
		ResourceShareService rss = new ResourceShareService();
		ResourceShare rs = new ResourceShare();
//		rs.setTitle("测试标题");
//		rs.setContent("测试内容");
//		rs.setCommunityName("测试社团");
//		rs.setCommunityId(5);
//		rs.setType("审核通过");
//		rss.addResourceShare(rs);
//		System.out.println(rss.queryById(1).getTitle());
//		System.out.println(rss.queryByType("审核通过").get(0).getContent());
//		rss.updateTypeById(1, "审核不通过");
//		System.out.println(rss.queryById(1).getType());
		ResourceShare rs2 = new ResourceShare();
		rs2.setId(2);
		rs2.setTitle("测试标题2");
		rs2.setContent("测试内容2");
		rs2.setCommunityName("测试社团2");
		rs2.setCommunityId(5);
		rs2.setType("审核通过");
		rss.updateById(rs2);
//		System.out.println(rss.queryById(1).getTitle());
//		rss.deleteById(1);
//		System.out.println(rss.queryByCommunity(5).get(1).getId());
	}
}
