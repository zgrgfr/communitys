package entity;

/**
 * 课程的实体类
 * @author shanjizhong
 *
 */
public class Class {
	// 主键
	private int id;
	
	// 精品课程的名字
	private String name;
	
	// 学校
	private String school;
	
	// 
	private String author;
	
	// 课程的类别
	private String classType;
	
	// 简介
	private String introduce;
	
	// 内容
	private String content;
	
	// 课程开始时间
	private String startTime;
	
	// 课程结束时间
	private String endTime;
	
	// 社团Id
	private int CommunityId;
	
	// 类型
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", school=" + school
				+ ", author=" + author + ", classType=" + classType
				+ ", introduce=" + introduce + ", content=" + content
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", CommunityId=" + CommunityId + ", type=" + type + "]";
	}

	
	
}
