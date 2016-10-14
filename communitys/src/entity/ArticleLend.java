package entity;

/**
 * 物品借用实体类
 * @author 董丝纶
 *
 */
public class ArticleLend {
	// 主键
	private int id;
	
	// 物品名称
	private String articleName;
	
	// 社团名称
	private String communityName;
	
	// 负责人姓名
	private String header;
	
	// 负责人电话
	private String phone;
	
	// 物品使用内容
	private String articleUse;
	
	// 物品借用日期
	private String lendTime;
	
	// 借用人的账户Id
	private int accountId;
	
	// 审核情况
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getArticleUse() {
		return articleUse;
	}
	public void setArticleUse(String articleUse) {
		this.articleUse = articleUse;
	}
	public String getLendTime() {
		return lendTime;
	}
	public void setLendTime(String lendTime) {
		this.lendTime = lendTime;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
