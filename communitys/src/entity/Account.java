package entity;

/**
 * 账号的实体类
 * @author guofengrui
 *
 */
public class Account {
	// 主键
	private int id;
	
	// 账号
	private String account;
	
	// 密码
	private String password;
	
	// 学生姓名
	private	String name;
	
	// 学院名称
	private String academy;
	
	// 学号
	private String idNumber;
	
	// 电话
	private String phone;
	
	// 身份 “一般学生，社团管理员，社联管理员”
	private String role;
	
	// 审核状态
	private String type;
	
	// 场地申请的权限
	private String placeRole;
	
	// 是否删除 0-已删除，1-未删除
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlaceRole() {
		return placeRole;
	}

	public void setPlaceRole(String placeRole) {
		this.placeRole = placeRole;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", account=" + account + ", password="
				+ password + ", name=" + name + ", academy=" + academy
				+ ", idNumber=" + idNumber + ", phone=" + phone + ", role="
				+ role + ", type=" + type + ", placeRole=" + placeRole
				+ ", status=" + status + "]";
	}

	
}
