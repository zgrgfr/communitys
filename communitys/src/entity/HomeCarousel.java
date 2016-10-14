package entity;

public class HomeCarousel {
	// 主键
	private int id;
	// 图片的标题
	private String title;
	// 图片的路径
	private String path;
	// 是否标记为首页显示
	private String showType;
	
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
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	
}
