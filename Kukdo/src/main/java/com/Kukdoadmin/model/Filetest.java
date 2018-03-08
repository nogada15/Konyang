package com.Kukdoadmin.model;

import org.springframework.web.multipart.MultipartFile;

public class Filetest {
	private String bFilename;
	private MultipartFile uploadfile;
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getbFilename() {
		return bFilename;
	}
	public void setbFilename(String bFilename) {
		this.bFilename = bFilename;
	}

}
