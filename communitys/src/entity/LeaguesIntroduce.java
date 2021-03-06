package entity;

/**
 * 校社联的概况介绍
 * @author Administrator
 *
 */
public class LeaguesIntroduce {
	// 主键
	private int id;
	
	// 内容介绍
	private String content;
	
	// 显示状态
	private String showType;
	
	// 审核状态
	private String type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public String getShowType() {
		return showType;
	}

	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
