package com.Kukdoadmin.common;

import java.io.File;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

@Component("fileUtils")
public class FileUtils {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	String reg[] = {".exe",".jsp",".asp",".py", ".php", ".shell", ".java", ".perl", ".html"};
	String regimage[] = {".jpg",".gif",".jpeg",".png"};
	
	public String uploadFile(String originalFilename, byte[] bytes) throws Exception{
		
		if(originalFilename != null) {
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString() + "_" + originalFilename;
		File target = new File(uploadPath + File.pathSeparator + savedName);
		FileCopyUtils.copy(bytes, target);
		return savedName;
		} else {
			return originalFilename;
		}
		
	}

}