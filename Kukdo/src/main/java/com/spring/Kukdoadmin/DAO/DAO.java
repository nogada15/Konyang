package com.spring.Kukdoadmin.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.Kukdoadmin.logger.LoggingDAO;

@Repository("DAO")
public class DAO extends LoggingDAO{

	//실행할 쿼리 이름과 해당 쿼리에 필요한 변수들을 매개변수로 Mybatis의 리스트 조회 메서드 호출
	
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
