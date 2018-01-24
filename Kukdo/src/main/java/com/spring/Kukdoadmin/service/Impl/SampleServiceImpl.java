package com.spring.Kukdoadmin.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.spring.Kukdoadmin.DAO.DAO;
import com.spring.Kukdoadmin.service.SampleService;

//service 인터페이스에서 상속받아 service의 실제 기능 구현
//spring의 IoC/DI 기능을 이용한 Bean관리 기능 사용
@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="DAO")
	private DAO dao;

	@Override
	public Object insertBener(Map<String, Object> map) throws Exception {
		return dao.insertBener(map);
	}

	@Override
	public List<Map<String, Object>> popupList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return dao.popupList(map);
	}

	
}
