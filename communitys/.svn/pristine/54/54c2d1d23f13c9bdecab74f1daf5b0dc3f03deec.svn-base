package controller;
import java.util.List;

import service.PlaceApplyService;
import util.DateUtil;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.commons.CommonUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;






import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import dto.PlaceApplyDto;
import entity.Place;
import entity.PlaceApply;
import entity.Account;

/**
 * 场地借用
 * @author guofr
 * 
 *
 */
@WebServlet(name="PlaceApplyController",urlPatterns={"/PlaceApplyController"})
public class PlaceApplyController extends BaseServlet{
	
	private static final long serialVersionUID = 1L;
	PlaceApplyService plaService = new PlaceApplyService();
	
	/**
	 * 新增一条场地申请
	 * @param req
	 * @param resp
	 * @return
	 */
	public String newPlaceApply(HttpServletRequest req, HttpServletResponse resp){
		PlaceApply placeApply = CommonUtils.toBean(req.getParameterMap(), PlaceApply.class);
		String day = DateUtil.changeStringDate(placeApply.getDayTime());
		placeApply.setDayTime(day);
		try{
			plaService.addPlaceApply(placeApply);
			req.setAttribute("msg", "申请成功，等待审核");
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:frontpages/pages/services/place.jsp";
	}
	
	/**
	 * 根据Id删除一条信息
	 * @param req
	 * @param resp
	 * @return
	 */
	public String deleteById(HttpServletRequest req, HttpServletResponse resp){
		int id =Integer.parseInt(req.getParameter("id"));
		try{
			plaService.deleteById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listPlaceApplyDto(req, resp);
	}
	
	/**
	 * 查找所有的场地申请Dto
	 * 超级管理员
	 * @param req
	 * @param resp
	 * @return
	 */
	public String listPlaceApplyDto(HttpServletRequest req, HttpServletResponse resp){
		try{
			List<PlaceApplyDto> placeApplyDtoList = plaService.selectAllPlaceApplyDto();
			req.setAttribute("placeApplyDtoList", placeApplyDtoList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/place/place_review.jsp";
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
			plaService.updateTypeById(type, id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.listPlaceApplyDto(req, resp);
	}
	
	/**
	 * 去修改的页面
	 * @param req
	 * @param resp
	 * @return
	 */
	public String toUpdate(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			PlaceApply placeApply = plaService.queryById(id);
			req.setAttribute("placeApply", placeApply);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "f:backpages/place/change.jsp";
	}
	
	/**
	 * 查看详情
	 * @param req
	 * @param resp
	 * @return
	 */
	public String detailsView(HttpServletRequest req, HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		try{
			PlaceApply placeApply = plaService.queryById(id);
			req.setAttribute("placeApply", placeApply);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 修改一条数据
	 * @param req
	 * @param resp
	 * @return
	 */
	public String updatePlaceApply(HttpServletRequest req, HttpServletResponse resp){
		PlaceApply placeApply = CommonUtils.toBean(req.getParameterMap(), PlaceApply.class);
		try{
			plaService.updateById(placeApply);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 根据不同的条件查找对应的场地申请
	 * 前台
	 * @param req
	 * @param resp
	 * @return
	 */
	public String queryByAllCondition(HttpServletRequest req, HttpServletResponse resp){
		JSONArray jsonArray = new JSONArray();
		try{
			String campus = req.getParameter("campus");
			String place = req.getParameter("place");
			String day = req.getParameter("day");
			List<PlaceApplyDto> PlaceApplyDtoList = plaService.queryByAllCondition(campus, place, day);
			if(PlaceApplyDtoList.size() != 0){
				for(PlaceApplyDto placeApplyDto : PlaceApplyDtoList){
					JSONObject jsonObject = new JSONObject();
					jsonObject.put("place", placeApplyDto.getPlaceApply().getPlace());
					jsonObject.put("account", placeApplyDto.getAccount().getName());
					jsonObject.put("text", placeApplyDto.getPlaceApply().getUses());
					jsonObject.put("date", placeApplyDto.getPlaceApply().getDayTime());
					jsonObject.put("startTime", placeApplyDto.getPlaceApply().getStartTime());
					jsonObject.put("endTime", placeApplyDto.getPlaceApply().getEndTime());
					jsonObject.put("apply", placeApplyDto.getPlaceApply().getType());
					jsonArray.add(jsonObject);
				}
			}else{
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("place", "");
				jsonObject.put("account", "");
				jsonObject.put("text", "");
				jsonObject.put("date", "");
				jsonObject.put("startTime", "");
				jsonObject.put("endTime", "");
				jsonObject.put("apply", "");
				jsonArray.add(jsonObject);
			}
			
			resp.getWriter().write(jsonArray.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonArray.toString();
	}
}
