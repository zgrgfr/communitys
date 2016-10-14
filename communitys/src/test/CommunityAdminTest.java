package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import entity.ArticleLend;
import service.ArticleLendService;
import service.CommunityAdminService;
import util.MybatisUtil;

public class CommunityAdminTest {	
	public static void main(String[] args) throws Exception{
		CommunityAdminService coaService = new CommunityAdminService();
		System.out.println(coaService.queryCommunityIdByAccountId(1));
	}
	
}
