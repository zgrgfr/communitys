package controller;
import java.util.ArrayList;
import java.util.List;

import service.AccountService;
import service.ActivityApplyService;
import service.ClassEnterService;
import service.ClassService;
import service.CommunityCorporatorService;
import service.CommunityService;
import service.CommunityShowService;
import util.ParamUtil;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


















import dto.ClassDto;
import dto.CommunityCorporatorDto;
import dto.CommunityShowDto;
import entity.ActivityApply;
import entity.Account;
import entity.ClassEnter;
import entity.Community;
import entity.CommunityCorporator;
import entity.CommunityShow;

/**
 * 社团成员管理
 * @author guofr
 * 
 *
 */
@WebServlet(name="CommunityCorporatorController",urlPatterns={"/CommunityCorporatorController"})
public class CommunityCorporatorController extends BaseServlet{
	private static final long serialVersionUID = 1L;
	private CommunityCorporatorService communityCorporatorService = new CommunityCorporatorService();
	private CommunityShowService communityShowService = new CommunityShowService();
	private CommunityService communityService = new CommunityService();		
	/**
	 * 申请加入社团
	 * @param req
	 * @param resp
	 * @return
	 */
	public String applyForCommunity(HttpServletRequest req, HttpServletResponse resp){
		try{
			int accountId = ParamUtil.getInt(req,"accountId",0);
			int communityId = ParamUtil.getInt(req, "communityId", 0);
			int communityShowId =ParamUtil.getInt(req, "communityShowId", 0);;
			if(accountId == 0){
				req.setAttribute("msg", "未登录不能申请！");
			}else{
				if(communityId !=  0){
					CommunityCorporator communityCorporator = communityCorporatorService.queryByAccountIdAndCommunityId(accountId,communityId);
					if(communityCorporator != null){
						req.setAttribute("msg", "你已经申请过该社团了！审核状态："+ communityCorporator.getType() +"");
					}else{
						CommunityCorporator communityCorporator1 = new CommunityCorporator();
						communityCorporator1.setAccountId(accountId);
						communityCorporator1.setCommunityId(communityId);
						communityCorporator1.setType("未审核");
						communityCorporatorService.addCommunityCorporator(communityCorporator1);
						req.setAttribute("msg", "你已申请成功！等待社团管理员审核!");
					}
				}
			}
			// 下面是返回该页面的操作
			CommunityShowDto communityShowDto = new CommunityShowDto();
			if(communityShowService.queryById(communityShowId) != null){
				CommunityShow communityShow = communityShowService.queryById(communityShowId);
				if(communityShow.getCommunityId() != 0){
					Community community = communityService.queryById(communityShow.getCommunityId());
					communityShowDto.setCommunity(community);
					communityShowDto.setCommunityShow(communityShow);
				}
			}
			req.setAttribute("communityShowDto", communityShowDto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/style/show-content.jsp";
	}
	
	/**
	 * 根据社团Id查找所有的社团成员信息
	 * 超级管理员
	 * 社联管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listByCommunityId(HttpServletRequest req,HttpServletResponse resp){
		HttpSession session = req.getSession();
		try{
			Community community = (Community)session.getAttribute("community");
			if(community != null){
				List<CommunityCorporatorDto> communityCorporatorDtoList = communityCorporatorService.selectAllByCommunityId(community.getId());
				req.setAttribute("communityCorporatorDtoList", communityCorporatorDtoList);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/account/account2.jsp";
	}
	
	/**
	 * 审核通过或者不通过
	 * @param req
	 * @param resp
	 * @return
	 */
	public String passOrNotPass(HttpServletRequest req, HttpServletResponse resp){
		String type = req.getParameter("type");
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			communityCorporatorService.updateTypeById(id, type);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listByCommunityId(req, resp);
	}
	
}
