package com.Kukdoadmin.model;

import org.springframework.web.multipart.MultipartFile;

public class KdoInterview {
	private int bId;
	private String bTitle;
	private String bSimpContent;
	private MultipartFile bFile;
	private String bImage;
	private String bExposure;
	private String bContent;
	private String bDate;
	private String keyword;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbSimpContent() {
		return bSimpContent;
	}
	public void setbSimpContent(String bSimpContent) {
		this.bSimpContent = bSimpContent;
	}
	public String getbImage() {
		return bImage;
	}
	public void setbImage(String bImage) {
		this.bImage = bImage;
	}
	public String getbExposure() {
		return bExposure;
	}
	public void setbExposure(String bExposure) {
		this.bExposure = bExposure;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public MultipartFile getbFile() {
		return bFile;
	}
	public void setbFile(MultipartFile bFile) {
		this.bFile = bFile;
	}

}
