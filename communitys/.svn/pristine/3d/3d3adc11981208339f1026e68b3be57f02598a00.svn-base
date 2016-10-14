package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.ArticleLend;



public interface ArticleLendDao {

	/**
	 * 添加一条物品借用申请
	 * @param articleLend
	 * @throws Exception
	 */
	public void addArticleLend(ArticleLend articleLend) throws Exception;
	
	/**
	 * 删除一条物品借用申请
	 * @param id
	 * @throws Exception
	 */
	public void deleteById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据id查找一条物品借用申请
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ArticleLend queryById(@Param("id") int id) throws Exception;
	
	/**
	 * 根据审核类型找到相应的物品借用申请
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public List<ArticleLend> queryByType(@Param("type") String type) throws Exception;
	
	/**
	 * 根据Id修改相应的审核状态
	 * @param id
	 * @param type
	 * @throws Exception
	 */
	public void updateTypeById(@Param("id") int id,@Param("type")String type) throws Exception;
	
	/**
	 * 根据id修改一条物品借用申请
	 * @param id
	 * @param articleLend
	 * @throws Exception
	 */
	public void updateById(ArticleLend articleLend) throws Exception;
	
	/**
	 * 查找所有的数据
	 * @return
	 * @throws Exception
	 */
	public List<ArticleLend> selectAll() throws Exception;
	
}
