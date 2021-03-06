package entity;

// 社团简介
/**
 * @author guofengrui
 *
 */
public class Community {
	// 主键
	private int id;
	
	// 社团的姓名
	private String name;
	
	// 社团负责人姓名
	private String nameHead;
	
	//负责人的学号
	private String studentIdNumber;
	
	// 负责人的手机号
	private String phone;
	
	// 社团运营内容
	private String content;
	
	// 申请人的Id
	private int applyId;
	
	//社团注册的状态
	private String type;
	
	// 是否为十佳社团
	private int topTen;

	// 是否删除
	private int status;
	
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

	public String getNameHead() {
		return nameHead;
	}

	public void setNameHead(String nameHead) {
		this.nameHead = nameHead;
	}

	public String getStudentIdNumber() {
		return studentIdNumber;
	}

	public void setStudentIdNumber(String studentIdNumber) {
		this.studentIdNumber = studentIdNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getApplyId() {
		return applyId;
	}

	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTopTen() {
		return topTen;
	}

	public void setTopTen(int topTen) {
		this.topTen = topTen;
	}

	
}
