package com.Kukdoadmin.model;

import org.springframework.web.multipart.MultipartFile;

public class Etronotice {
	private int bId;
	private String bSite;
	private String bTitle;
	private MultipartFile bFile;
	private String bFileName;
	private String bDate;
	private String bExposure;
	private String keyword;
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbSite() {
		return bSite;
	}
	public void setbSite(String bSite) {
		this.bSite = bSite;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public MultipartFile getbFile() {
		return bFile;
	}
	
	public void setbFile(MultipartFile bFile) {
		this.bFile = bFile;
	}
	public String getbExposure() {
		return bExposure;
	}
	public void setbExposure(String bExposure) {
		this.bExposure = bExposure;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getbFileName() {
		return bFileName;
	}
	public void setbFileName(String bFileName) {
		this.bFileName = bFileName;
	}
	
	
	
}
