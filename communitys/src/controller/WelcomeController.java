package controller;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ClassService;
import service.CommunityPresenceService;
import service.CommunityService;
import service.CommunityShowService;
import service.HomeCarouselService;
import cn.itcast.servlet.BaseServlet;
import dto.CommunityShowDto;
import entity.CommunityPresence;
import entity.HomeCarousel;

/**
 * 跳转到首页
 * @author 郭丰瑞
 *
 */
@WebServlet(name="WelcomeController",urlPatterns={"/WelcomeController"})
public class WelcomeController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	ClassService claService = new ClassService();
	private CommunityPresenceService communityPresenceService = new CommunityPresenceService();
	private CommunityShowService communityShowService = new CommunityShowService();
	private CommunityService communityService = new CommunityService();
	private HomeCarouselService homeCarouselService = new HomeCarouselService();
	public String welcomeToFrontIndex(HttpServletRequest req, HttpServletResponse resp) {
		try{
			// 社团风采
			List<CommunityPresence> communityPresenceList1 = communityPresenceService.queryByType("审核通过", "社团风采");
			// 社团动态
			List<CommunityPresence> communityPresenceList2 = communityPresenceService.queryByType("审核通过", "社团动态");
//			// 社联通知
//			List<CommunityPresence> communityPresenceList3 = communityPresenceService.queryByType("审核通过", "社联通知");
//			// 社团展示
//			List<CommunityShowDto> communityShowDtoList1 = communityShowService.queryDtoByType("审核通过");
//			// 首页轮播
//			List<HomeCarousel> homeCarouselList =  homeCarouselService.queryByShowType("首页显示");
//			// 十佳社团
//			List<CommunityShowDto> communityShowDtoList2 =  communityService.queryByTopTen(1);
			req.setAttribute("communityPresenceList1", communityPresenceList1);
			req.setAttribute("communityPresenceList2", communityPresenceList2);
//			req.setAttribute("communityPresenceList3", communityPresenceList3);
//			req.setAttribute("communityShowDtoList1", communityShowDtoList1);
//			req.setAttribute("communityShowDtoList2", communityShowDtoList2);
//			req.setAttribute("homeCarouselList", homeCarouselList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/index.jsp";
	}
	
}
