package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.ArticleLend;

import service.ArticleLendService;
import util.MybatisUtil;

public class ArticleLnedTest {	
	public static void main(String[] args) throws Exception{
		ArticleLendService als = new ArticleLendService();
//		ArticleLend al = new ArticleLend();
//		al.setArticleName("测试名称1");
//		al.setCommunityName("测试社团1");
//		al.setHeader("测试负责人1");
//		al.setPhone("测试电话1");
//		al.setUse("测试用途1");
//		al.setLendTime("测试时间1");
//		al.setType("未审核");
//		als.addArticleLend(al);
//		System.out.println(als.queryById(2).getHeader());
		ArticleLend al2 = new ArticleLend();
//		al2.setId(2);
		al2.setArticleName("测试名称2");
		al2.setCommunityName("测试社团2");
		al2.setHeader("测试负责人2");
		al2.setPhone("测试电话2");
		al2.setArticleUse("测试用途2");
		al2.setLendTime("测试时间2");
		al2.setAccountId(1);
		al2.setType("未审核");
		als.addArticleLend(al2);
//		System.out.println(als.queryById(2).getHeader());
//		als.updateTypeById(1, "审核通过");
//		System.out.println(als.queryById(1).getType());
//		List<ArticleLend> list = als.queryByType("审核通过");
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i).getArticleName());
//		}
//		als.deleteById(1);
	}
	
}
