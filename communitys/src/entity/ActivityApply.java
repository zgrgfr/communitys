package entity;

/**
 * 活动申请
 * @author guofengrui
 *
 */
public class ActivityApply {
	// 主键
	private int id; 
	
	// 活动名称
	private String name;
	
	// 活动发起者
	private String holder;
	
	// 活动内容
	private String content;
	
	// 活动时间
	private String time;
	
	// 活动开始时间
	private String timeStart;
	
	// 账号Id 
	private int accountId;
	
	// 审核状态
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

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
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
