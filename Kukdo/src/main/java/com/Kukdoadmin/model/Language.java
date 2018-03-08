package com.Kukdoadmin.model;

public class Language {

	private String pk;
	private String language;
	private String testName;
	private String exposeYN;
	private String regDay;

	
	
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getExposeYN() {
		return exposeYN;
	}
	public void setExposeYN(String exposeYN) {
		this.exposeYN = exposeYN;
	}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getRegDay() {
		return regDay;
	}
	public void setRegDay(String regDay) {
		this.regDay = regDay;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
