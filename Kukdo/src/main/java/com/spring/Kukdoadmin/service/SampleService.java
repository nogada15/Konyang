package com.spring.Kukdoadmin.service;

import java.util.List;
import java.util.Map;


//service �������̽� ����
public interface SampleService {

	Object insertBener(Map<String, Object> map) throws Exception;

	List<Map<String, Object>> popupList(Map<String, Object> map) throws Exception;

}
