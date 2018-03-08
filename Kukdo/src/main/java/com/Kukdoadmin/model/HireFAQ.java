package com.Kukdoadmin.model;


public class HireFAQ {
	private int bId;
	private String bTitle;
	private String bDate;
	private String bContent;
	private String bExposure;
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
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbExposure() {
		return bExposure;
	}
	public void setbExposure(String bExposure) {
		this.bExposure = bExposure;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		
		this.bDate = bDate;
	}

}
