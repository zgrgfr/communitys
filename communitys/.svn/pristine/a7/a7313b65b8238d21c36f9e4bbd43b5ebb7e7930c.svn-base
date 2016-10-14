package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.PlaceApplyDao;
import dto.PlaceApplyDto;
import entity.Account;
import entity.PlaceApply;
import util.DateUtil;
import util.MybatisUtil;

/**
 * 场地申请的Service
 * @author shanjizhong
 *
 */ 
public class PlaceApplyService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	PlaceApplyDao placeApplyDao = sqlSession.getMapper(PlaceApplyDao.class);
	AccountService accountService = new AccountService();
	
	/**
	 * 添加一个申请
	 * @param placeApply
	 * @throws Exception
	 */
	public void addPlaceApply(PlaceApply placeApply) throws Exception{
		placeApplyDao.addPlaceApply(placeApply);
	}
	
	/**
	 * 根据Id删除申请
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(int id) throws Exception{
		placeApplyDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找课程
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public PlaceApply queryById(int id) throws Exception{
		return placeApplyDao.queryById(id);
	}
	
	/**
	 * 查找所有场地申请
	 * @return list
	 * @throws Exception
	 */
	public List<PlaceApply> selectAll() throws Exception{
		return placeApplyDao.selectAll();
	}
	
	/**
	 * 根据type找到相应的课程
	 * @param type
	 * @return list
	 * @throws Exception
	 */
	public List<PlaceApply> queryByType(String type) throws Exception{
		return placeApplyDao.queryByType(type);
	}
	
	/**
	 * 根据Id改变某个申请的审核状态
	 * @param type
	 * @param id
	 * @throws Exception
	 */
	public void updateTypeById(String type, int id) throws Exception{
		placeApplyDao.updateTypeById(id, type);
	}
	
	/**
	 * 根据ID修改申请
	 * @param id
	 * @param PlaceApply
	 * @throws Exception
	 */
	public void updateById(PlaceApply placeApply)throws Exception{
		placeApplyDao.updateById(placeApply);
	}
	
	/**
	 * 查找所有的场地申请的Dto
	 * @return
	 * @throws Exception
	 */
	public List<PlaceApplyDto> selectAllPlaceApplyDto()throws Exception{
		// 找到所有的场地申请信息
		List<PlaceApply> placeApplyList = this.selectAll();
		List<PlaceApplyDto> placeApplyDtoList = new ArrayList<PlaceApplyDto>();
		
		for(PlaceApply placeApply : placeApplyList){
			PlaceApplyDto placeApplyDto = new PlaceApplyDto();
			placeApplyDto.setPlaceApply(placeApply);
			int accountId = placeApply.getAccountId();
			Account account = accountService.queryById(accountId);
			placeApplyDto.setAccount(account);
			placeApplyDtoList.add(placeApplyDto);
		}
		return placeApplyDtoList;
	}
	
	/**
	 * 根据三个参数查询对应的数据
	 * 返回值是PlaceApplyDto集合
	 * @param campus 校区
	 * @param place 地点
	 * @param day 传入的时间
	 * @return
	 */
	public List<PlaceApplyDto> queryByAllCondition(String campus,String place,String day){
		List<PlaceApply> list = Collections.emptyList();
		List<PlaceApplyDto> placeApplyDtoList = new ArrayList<PlaceApplyDto>();
		try{
			Date dateDay = DateUtil.StringToDateYMD(day);
			List<Date> dateList = DateUtil.getWeek(dateDay, 1);
			String monday = DateUtil.formatDateTime2(dateList.get(0));
			String sunday = DateUtil.formatDateTime2(dateList.get(1));
			list = placeApplyDao.queryByAllCondition(campus, place, monday,sunday);
			for(PlaceApply placeApply : list){
				PlaceApplyDto placeApplyDto = new PlaceApplyDto();
				if(placeApply.getAccountId() != 0){
					Account account = accountService.queryById(placeApply.getAccountId());
					placeApplyDto.setAccount(account);
				}else{
					Account account = new Account();
					placeApplyDto.setAccount(account);
				}
				placeApplyDto.setPlaceApply(placeApply);
				placeApplyDtoList.add(placeApplyDto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return placeApplyDtoList;
	}
}
