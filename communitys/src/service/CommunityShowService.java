package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.io.File;

import util.MybatisUtil;
import dao.CommunityShowDao;
import dto.CommunityShowDto;
import entity.Community;
import entity.CommunityShow;

public class CommunityShowService {
	
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	CommunityShowDao communityShowDao = sqlSession.getMapper(CommunityShowDao.class);
	
	private CommunityService communityService = new CommunityService();
	/**
	 * 增添一个社团展示
	 * @param communityShow
	 * @throws Exception
	 */
	public void addCommunityShow(CommunityShow communityShow) throws Exception {
			communityShowDao.addCommunityShow(communityShow);
	}
	
	/**
	 * 删除一个社团展示
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception {
		communityShowDao.deleteById(id);
	}
	
	/**
	 * 根据id查找一条社团展示
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityShow queryById(@Param("id") int id) throws Exception{
		return communityShowDao.queryById(id);
	}
	
	/**
	 * 根据审核情况查找对应的社团展示
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<CommunityShow> queryByType(@Param("type") String type) throws Exception {
		return communityShowDao.queryByType(type);
	}
	
	/**
	 * 根据审核情况查找对应的社团展示的Dto
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<CommunityShowDto> queryDtoByType(@Param("type") String type) throws Exception {
		sqlSession.clearCache();
		List<CommunityShowDto> communityShowDtoList = new ArrayList<CommunityShowDto>();
		List<CommunityShow> communityShowList = communityShowDao.queryByType(type);;
		for(CommunityShow communityShow : communityShowList){
			CommunityShowDto communityShowDto = new CommunityShowDto();
			if(communityShow.getCommunityId() != 0){
				if(communityService.queryById(communityShow.getCommunityId()) != null){
					Community community = communityService.queryById(communityShow.getCommunityId());
					communityShowDto.setCommunity(community);
					communityShowDto.setCommunityShow(communityShow);
				}
			}
			communityShowDtoList.add(communityShowDto);
		}
		return communityShowDtoList;
	}
	
	/**
	 * 根据id修改一个社团展示的审核情况
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id, @Param("type") String type) throws Exception {
		communityShowDao.updateTypeById(id, type);
	}
	
	/**
	 * 根据id修改一条社团展示
	 * @param communityShow
	 * @throws Exception
	 */
	public void updateById(CommunityShow communityShow) throws Exception {
			communityShowDao.updateById(communityShow);
	}
	
	/**
	 * 根据社团Id查找相应的社团展示
	 * 因为每个社团只能有一个社团展示，所以这里不用集合封装
	 * @param communityId
	 * @return
	 * @throws Exception
	 */
	public CommunityShow queryByCommunityId(int communityId) throws Exception{
		return communityShowDao.queryByCommunityId(communityId);
	}
	
	/**
	 * 根据路径删除文件
	 * @param delPath
	 */
	public void deleteFile(String delPath) {
		  File file = new File(delPath);
		  // 路径为文件且不为空则进行删除
		  if (file.isFile() && file.exists()) {
		    file.delete();
		  }
		}
	
	/**
	 * 根据所有的条件查找相应的社团展示的Dto
	 * @param campus
	 * @param grade
	 * @param communityType
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<CommunityShowDto> listByAllCondition(String campus, String grade, String communityType, String type)throws Exception{
		List<CommunityShowDto> communityShowDtoList = new ArrayList<CommunityShowDto>();
		List<CommunityShow> communityShowList = communityShowDao.listByAllCondition(campus, grade, communityType, type);
		for(CommunityShow communityShow : communityShowList){
			CommunityShowDto communityShowDto = new CommunityShowDto();
			if(communityShow.getCommunityId() != 0){
				if(communityService.queryById(communityShow.getCommunityId()) != null){
					Community community = communityService.queryById(communityShow.getCommunityId());
					communityShowDto.setCommunity(community);
					communityShowDto.setCommunityShow(communityShow);
				}
			}
			communityShowDtoList.add(communityShowDto);
		}
		return communityShowDtoList;
		
	}
	
	/**
	 * 根据Id更改等级
	 * @param id
	 * @param grade
	 * @throws Exception
	 */
	public void updateGradeById(@Param("id") int id, @Param("grade") String grade) throws Exception {
		communityShowDao.updateGradeById(id, grade);
	}
	
}
