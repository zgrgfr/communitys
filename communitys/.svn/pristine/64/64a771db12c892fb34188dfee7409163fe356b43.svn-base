package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import util.MybatisUtil;
import dao.AccountDao;
import dao.CommunityCorporatorDao;
import dto.CommunityCorporatorDto;
import entity.Account;
import entity.Community;
import entity.CommunityCorporator;
/**
 * 社团用户的Service
 * @author guofengrui
 *
 */
public class CommunityCorporatorService {
	SqlSession sqlSession = MybatisUtil.getSqlSession(true);
	CommunityCorporatorDao cocDao = sqlSession.getMapper(CommunityCorporatorDao.class);
	
	private AccountService accountService = new AccountService();
	private CommunityService communityService = new CommunityService();
	/**
	 * 添加一条社团成员
	 * @param account
	 * @throws Exception
	 */
	public void addCommunityCorporator(CommunityCorporator communityCorporator) throws Exception{
		cocDao.addCommunityCorporator(communityCorporator);
	}

	/**
	 * 根据id删除一条社团成员
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception{
		cocDao.deleteById(id);
	}
	
	/**
	 * 根据Id查找到社团成员
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityCorporator queryById(@Param("id") int id) throws Exception{
		return cocDao.queryById(id);
	}
	
	/**
	 * 根据Type查找到相应的社团成员
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<CommunityCorporator> queryByType(@Param("type") String type) throws Exception{
		return cocDao.queryByType(type);
	}
	
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception{
		cocDao.updateTypeById(id, type);
	}
	
	
	/**
	 * 根据社团Id查找所有的社团成员
	 * 返回的是CommunityCorporatorDto集合
	 * @return
	 * @throws Exception
	 */
	public List<CommunityCorporatorDto> selectAllByCommunityId(@Param("communityId") int communityId) throws Exception{
		List<CommunityCorporatorDto> communityCorporatorDtoList = new ArrayList<CommunityCorporatorDto>();
		List<CommunityCorporator> communityCorporatorList =	cocDao.selectAllByCommunityId(communityId);
		for(CommunityCorporator communityCorporator : communityCorporatorList){
			CommunityCorporatorDto communityCorporatorDto = new CommunityCorporatorDto();
			Account account = accountService.queryById(communityCorporator.getAccountId());
			Community community = communityService.queryById(communityCorporator.getCommunityId());
			communityCorporatorDto.setId(communityCorporator.getId());
			communityCorporatorDto.setAccount(account);
			communityCorporatorDto.setCommunity(community);
			communityCorporatorDto.setType(communityCorporator.getType());
			communityCorporatorDtoList.add(communityCorporatorDto);
		}
		return communityCorporatorDtoList;
	}
	
	
	/**
	 * 根据账号Id和社团Id查找到社团成员
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public CommunityCorporator queryByAccountIdAndCommunityId(@Param("accountId") int accountId,@Param("communityId") int communityId) throws Exception{
		return cocDao.queryByAccountIdAndCommunityId(accountId, communityId);
	}
	
}
