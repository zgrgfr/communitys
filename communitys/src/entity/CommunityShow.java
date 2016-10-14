package entity;

public class CommunityShow {
	// 主键
	private int id;
	
	// 校区
	private String campus;
	
	// 等级
	private String grade;
	
	// 社团类型
	private String communityType;
	
	// 社团logo
	private String logo;
	
	// 社团id
	private int communityId;
	
	// 审核情况
	private String type;
	

	public int getCommunityId() {
		return communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCommunityType() {
		return communityType;
	}

	public void setCommunityType(String communityType) {
		this.communityType = communityType;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CommunityShow() {
		super();
	}

	public CommunityShow(String campus, String grade, String communityType,
			String logo, int communityId, String type) {
		super();
		this.campus = campus;
		this.grade = grade;
		this.communityType = communityType;
		this.logo = logo;
		this.communityId = communityId;
		this.type = type;
	}

	public CommunityShow(int id, String campus, String grade,
			String communityType, String logo, int communityId, String type) {
		super();
		this.id = id;
		this.campus = campus;
		this.grade = grade;
		this.communityType = communityType;
		this.logo = logo;
		this.communityId = communityId;
		this.type = type;
	}
	
	
}
