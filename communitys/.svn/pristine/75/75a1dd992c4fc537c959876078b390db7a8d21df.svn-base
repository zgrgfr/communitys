package controller;
import java.util.Collections;
import java.util.List;

import service.ActivityApplyService;
import service.CommunityShowService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;





import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import dto.CommunityShowDto;
import entity.ActivityApply;
import entity.Account;

/**
 * 物品借用
 * @author guofr
 * 
 *
 */
@WebServlet(name="JsonController",urlPatterns={"/JsonController"})
public class JsonController extends HttpServlet {
	
	private CommunityShowService communityShowService = new CommunityShowService();
	/**
	 * 查找审核通过的社团展示
	 * 根据接收到的校区，类型，等级
	 * 前台显示
	 * @param req
	 * @param resp
	 * @return
	 */
	public JSONArray listByAllCondition(HttpServletRequest req, HttpServletResponse resp){
		String grade = req.getParameter("grade");
		String campus = req.getParameter("school");
		String communityType = req.getParameter("type");
		List<CommunityShowDto> communityShowDtoList = Collections.emptyList();
		JSONArray jsonArray = new JSONArray();
		try{
			communityShowDtoList = communityShowService.listByAllCondition(campus, grade, communityType, "审核通过");
			for(CommunityShowDto communityShowDto : communityShowDtoList){
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("logo", communityShowDto.getCommunityShow().getLogo());
				jsonObject.put("name", communityShowDto.getCommunity().getName());
				jsonArray.add(jsonObject);
			}
			System.out.println(jsonArray.toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonArray;
	}
}
