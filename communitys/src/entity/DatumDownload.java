package entity;

/**
 * 资料下载的实体类
 * @author shanjizhong
 *
 */
public class DatumDownload {
	// 主键
	private int id;
	
	// 标题
	private String title;
	
	// 上传者姓名
	private String uploadName;
	
	// 资料上传的路径
	private String path;

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

	public String getUploadName() {
		return uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
