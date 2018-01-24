package com.spring.Kukdoadmin.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.Kukdoadmin.logger.LoggingDAO;

@Repository("DAO")
public class DAO extends LoggingDAO{

	//������ ���� �̸��� �ش� ������ �ʿ��� �������� �Ű������� Mybatis�� ����Ʈ ��ȸ �޼��� ȣ��
	
	public Object insertBener(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		return insert("sample.insertbener", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> popupList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return (List<Map<String, Object>>)selectList("sample.popuplist", map);
	}

}
