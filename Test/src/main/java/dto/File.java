package dto;

import java.sql.Date;

public class File {
	private Integer num;
	private String directory;
	private String name;
	private Long size;
	private String contenttype;
	private Date uploaddate;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getContenttype() {
		return contenttype;
	}
	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}
	public Date getUploaddate() {
		return uploaddate;
	}
	public void setUploaddate(Date uploaddate) {
		this.uploaddate = uploaddate;
	}
}
