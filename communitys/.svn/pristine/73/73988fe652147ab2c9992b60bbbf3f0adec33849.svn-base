package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.SocialPrograms;


public interface SocialProgramsDao {
	/**
	 * 添加一条社会项目
	 * @param socialPrograms
	 * @throws Exception
	 */
	public void addSocialPrograms(SocialPrograms socialPrograms) throws Exception;
	
	/**
	 * 根据id删除一条用户
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据ID查找项目
	 * @param id
	 * @return socialProgram
	 * @throws Exception
	 */
	public SocialPrograms queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据审核状态查找项目
	 * @param type
	 * @return list
	 * @throws Exception
	 */
	public List<SocialPrograms> queryByType(@Param("type") String type) throws Exception;

	/**
	 * 查找所有项目
	 * @return list
	 * @throws Exception
	 */
	public List<SocialPrograms> selectAll() throws Exception;
	
	/**
	 * 根据ID修改相应审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;
	
	/**
	 * 根据ID修改项目
	 * @param socialPrograms
	 * @throws Exception
	 */
	public void updateById(SocialPrograms socialPrograms) throws Exception;
}
