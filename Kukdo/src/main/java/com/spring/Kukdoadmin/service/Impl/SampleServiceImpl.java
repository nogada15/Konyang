package com.spring.Kukdoadmin.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.spring.Kukdoadmin.DAO.DAO;
import com.spring.Kukdoadmin.service.SampleService;

//service �������̽����� ��ӹ޾� service�� ���� ��� ����
//spring�� IoC/DI ����� �̿��� Bean���� ��� ���
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
