package entity;

public class ResourceShare {
	// 主键
	private int id;
	
	// 标题
	private String title;
	
	// 社团名称
	private String communityName;
	
	// 共享内容
	private String content;
	
	// 社团Id
	private int CommunityId;
	
	// 审核情况
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getCommunityId() {
		return CommunityId;
	}

	public void setCommunityId(int communityId) {
		CommunityId = communityId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
