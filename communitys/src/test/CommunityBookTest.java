package test;

import entity.CommunityBook;
import service.CommunityBookService;

public class CommunityBookTest {
	public static void main(String[] args) throws Exception{
		CommunityBookService cbs = new CommunityBookService();
		CommunityBook cb = new CommunityBook();
		cb.setPath("测试路径");
		cbs.addCommunityBook(cb);
//		System.out.println(cbs.queryById(1).getPath());
//		cbs.deleteById(1);
		CommunityBook cb2 = new CommunityBook();
		cb2.setPath("测试路径2");
		cb2.setId(2);
		cbs.updateById(cb2);
	}
}
