package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.ResourceShareDao;
import dto.ResourceShareDto;
import entity.ResourceShare;
import service.CommunityService;

public class ResourceShareService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	ResourceShareDao resourceShareDao = sqlSession.getMapper(ResourceShareDao.class);
	
	CommunityService communityService = new CommunityService();
	/**
	 * 添加一个资源分享
	 * @param resourceShare
	 * @throws Exception
	 */
	public void addResourceShare(ResourceShare resourceShare) throws Exception {
		resourceShareDao.addResourceShare(resourceShare);
	}

	/**
	 * 根据id删除一个资源分享
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception {
		resourceShareDao.deleteById(id);
	}
	
	/**
	 * 根据id查找一个资源分享
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ResourceShare queryById(@Param("id") int id) throws Exception {
		return resourceShareDao.queryById(id);
	}
	
	/**
	 * 根据审核情况查找对应的资源分享
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> queryByType(@Param("type") String type) throws Exception {
		return resourceShareDao.queryByType(type);
	}
	
	/**
	 * 根据id修改审核情况
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id, @Param("type") String type) throws Exception {
		resourceShareDao.updateTypeById(id, type);
	}

	/**
	 * 根据id修改资源分享
	 * @param resourceShare
	 * @throws Exception
	 */
	public void updateById(ResourceShare resourceShare) throws Exception {
		resourceShareDao.updateById(resourceShare);
	}
	
	/**
	 * 根据社团Id查找相应的资源共享
	 * @param CommunityId
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> queryByCommunity(int CommunityId) throws Exception{
		return resourceShareDao.queryByCommunity(CommunityId);
	}
	
	/**
	 * 查找所有的资源共享
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShare> selectAll() throws Exception{
		return resourceShareDao.selectAll();
	}
	
	/**
	 * 根据审核状态查找资源共享Dto的集合
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ResourceShareDto> listResourceShareDtoByType(String type) throws Exception{
		List<ResourceShare> resourceShareList =  resourceShareDao.queryByType(type);
		List<ResourceShareDto> resourceShareDtoList = new ArrayList<ResourceShareDto>();
		for(ResourceShare resourceShare : resourceShareList){
			ResourceShareDto resourceShareDto = new ResourceShareDto();
			resourceShareDto.setResourceShare(resourceShare);
			resourceShareDto.setCommunity(communityService.queryById(resourceShare.getCommunityId()));
			resourceShareDtoList.add(resourceShareDto);
		}
		return resourceShareDtoList;
	}
}
