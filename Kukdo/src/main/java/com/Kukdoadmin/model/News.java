package com.Kukdoadmin.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class News {
	private int bId;
	private String bSite;
	private String bDate;
	private String bTitle;
	private String bSimpContent;
	private String bFile1;
	private List<MultipartFile> file1;
	private String bFile2;
	private String bExposure;
	private String bContent;
	private String keyword;
	private String searchOption;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getSearchOption() {
		return searchOption;
	}
	public void setSearchOption(String searchOption) {
		this.searchOption = searchOption;
	}
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
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
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
	public List<MultipartFile> getFile1() {
		return file1;
	}
	public void setFile1(List<MultipartFile> file1) {
		this.file1 = file1;
	}
	public String getbFile1() {
		return bFile1;
	}
	public void setbFile1(String bFile1) {
		this.bFile1 = bFile1;
	}
	public String getbFile2() {
		return bFile2;
	}
	public void setbFile0(String bFile2) {
		this.bFile2 = bFile2;
	}

}
