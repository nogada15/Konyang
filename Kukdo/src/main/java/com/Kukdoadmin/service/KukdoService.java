package com.Kukdoadmin.service;

import java.sql.SQLException;
import java.util.List;

import com.Kukdoadmin.model.Admin;
import com.Kukdoadmin.model.Bener;
import com.Kukdoadmin.model.Credential;
import com.Kukdoadmin.model.Etronotice;
import com.Kukdoadmin.model.Evaluation;
import com.Kukdoadmin.model.Hire;
import com.Kukdoadmin.model.HireFAQ;
import com.Kukdoadmin.model.KdoInterview;
import com.Kukdoadmin.model.Langtest;
import com.Kukdoadmin.model.Manager;
import com.Kukdoadmin.model.News;
import com.Kukdoadmin.model.PR;
import com.Kukdoadmin.model.Popup;


//service 인터페이스 선언
public interface KukdoService {
	

	public Admin adminView(Admin admin) throws SQLException;
	
	public Admin adminViewWithCredential(Credential credential) throws SQLException;
	
	public void insertBener(Bener bener) throws SQLException;
	public Bener benerListone(Bener bener) throws SQLException;
	
	public List<Popup> popupList(Popup popup) throws SQLException;
	public void popupInsert(Popup popup) throws SQLException;
	public void popupModify(Popup popup) throws SQLException;
	public void popupDelete(Popup popup) throws SQLException;
	public Popup popupListone(Popup popup) throws SQLException;
	public List<Popup> popupListserch(Popup popup) throws SQLException;
	
	public List<Etronotice> etronoticelist(Etronotice enotice) throws SQLException;
	public void etronoticeinsert(Etronotice enotice) throws SQLException;
	public Etronotice etronoticeListone(Etronotice enotice) throws SQLException;
	public List<Etronotice> EtronoticeListserch(Etronotice enotice) throws SQLException;
	public void etronoticeModify(Etronotice enotice) throws SQLException;
	public void etronoticeDelete(Etronotice enotice) throws SQLException;
	
	public List<Manager> managerlist(Manager manager) throws SQLException;
	public void managerinsert(Manager manager) throws SQLException;
	public List<Manager> managerListserch(Manager manager) throws SQLException;
	public Manager ManagerListone(Manager manager) throws SQLException;
	public void ManagerModify(Manager manager) throws SQLException;
	public void ManagerDelete(Manager manager) throws SQLException;
	
	public List<Langtest> langtestselect(Langtest langtest) throws SQLException;
	public void langtestinsert(Langtest langtest) throws SQLException;
	public List<Langtest> langtestListserch(Langtest langtest) throws SQLException;
	public void LangtestDelete(Langtest langtest) throws SQLException;
	public void LangtestModify(Langtest langtest) throws SQLException;
	public Langtest LangtestListone(Langtest langtest) throws SQLException;
	
	public List<Hire> hireList(Hire hire)throws SQLException;
	public void hireInsert(Hire hire)throws SQLException;
	public List<Hire> hireListserch(Hire hire)throws SQLException;
	public Hire hireListone(Hire hire) throws SQLException;
	public void hireModify(Hire hire)throws SQLException;
	public void hireDelete(Hire hire)throws SQLException;

	public List<HireFAQ> hireFAQList(HireFAQ hireFAQ) throws SQLException;
	public HireFAQ hireFAQListone(HireFAQ hireFAQ) throws SQLException;
	public List<HireFAQ> hireFAQListserch(HireFAQ hireFAQ) throws SQLException;
	public void hireFAQInsert(HireFAQ hireFAQ) throws SQLException;
	public void hireFAQModify(HireFAQ hireFAQ) throws SQLException; 
	public void hireFAQDelete(HireFAQ hireFAQ) throws SQLException;

	public List<News> newsList(News news) throws SQLException;
	public News newsListone(News news) throws SQLException;
	public List<News> NewsListserch(News news) throws SQLException;
	public void newsInsert(News news) throws SQLException;
	public void newsModify(News news) throws SQLException;
	public void newsDelete(News news) throws SQLException;

	public List<PR> prList(PR pr) throws SQLException;
	public PR prListone(PR pr) throws SQLException;
	public List<PR> PRListserch(PR pr) throws SQLException;
	public void prInsert(PR pr) throws SQLException;
	public void prModify(PR pr) throws SQLException;
	public void prDelete(PR pr) throws SQLException;

	public List<KdoInterview> kdointviewList(KdoInterview kdointview) throws SQLException;
	public KdoInterview kdointviewListone(KdoInterview kdointview) throws SQLException;
	public List<KdoInterview> kdointviewListserch(KdoInterview kdointview) throws SQLException;
	public void kdointviewInsert(KdoInterview kdointview) throws SQLException;
	public void kdointviewModify(KdoInterview kdointview) throws SQLException;
	public void kdointviewDelete(KdoInterview kdointview) throws SQLException;

	public List<Admin> adminList(Admin admin) throws SQLException;
	public List<Admin> adminListserch(Admin admin) throws SQLException;
	public Admin adminListone(Admin admin) throws SQLException;
	public void adminInsert(Admin admin) throws SQLException;
	public void adminModify(Admin admin) throws SQLException;
	public void adminDelete(Admin admin) throws SQLException;

	public List<Evaluation> evaluationList(Evaluation evaluation) throws SQLException;
	public List<Evaluation> evaluationListserch(Evaluation evaluation) throws SQLException;
	public Evaluation evaluationListone(Evaluation evaluation) throws SQLException;
	public void evaluationInsert(Evaluation evaluation) throws SQLException;
	public void evaluationModify(Evaluation evaluation) throws SQLException;
	public void evaluationDelete(Evaluation evaluation) throws SQLException;

	public int evaluationDeprivation(Evaluation evaluation) throws SQLException;
	public int evaluationRecognition(Evaluation evaluation) throws SQLException;

	public void deleteBener6(Bener bener) throws SQLException;
	public void deleteBener5(Bener bener) throws SQLException;
	public void deleteBener4(Bener bener) throws SQLException;
	public void deleteBener3(Bener bener) throws SQLException;
	public void deleteBener2(Bener bener) throws SQLException;
	public void deleteBener1(Bener bener) throws SQLException;

	public void insertBener1(Bener bener) throws SQLException;
	public void insertBener2(Bener bener) throws SQLException;
	public void insertBener3(Bener bener) throws SQLException;
	public void insertBener4(Bener bener) throws SQLException;
	public void insertBener5(Bener bener) throws SQLException;
	public void insertBener6(Bener bener) throws SQLException;

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	



	
	

	

	

}
