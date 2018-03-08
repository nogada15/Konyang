package com.Kukdoadmin.service.Impl;


import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kukdoadmin.DAO.DAO;
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
import com.Kukdoadmin.service.KukdoService;


@Service
public class KukdoServiceImpl implements KukdoService {
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	DAO dao;

	


	@Override
	public List<Popup> popupList(Popup popup) throws SQLException {
		// TODO Auto-generated method stub
		return dao.popupList(popup);
	}


	@Override
	public void popupInsert(Popup popup) throws SQLException {
		// TODO Auto-generated method stub
		dao.popupInsert(popup);
	}


	@Override
	public List<Etronotice> etronoticelist(Etronotice enotice) throws SQLException {
		// TODO Auto-generated method stub
		return dao.etronoticeList(enotice);
	}


	@Override
	public void etronoticeinsert(Etronotice enotice) throws SQLException{

		dao.etronoticeInsert(enotice);
	}


	@Override
	public List<Manager> managerlist(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		return dao.managerList(manager);
	}


	@Override
	public void managerinsert(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		dao.managerInsert(manager);
	}


	@Override
	public List<Langtest> langtestselect(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		return dao.langtestList(langtest);
	}


	@Override
	public void langtestinsert(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		dao.langtestInsert(langtest);
	}

	@Override
	
	public void popupModify(Popup popup) throws SQLException {
		
		dao.popupModify(popup);
	}


	@Override
	public void popupDelete(Popup popup) throws SQLException {
		// TODO Auto-generated method stub
		
		dao.popupDelete(popup);
		
	}


	@Override
	public Popup popupListone(Popup popup) throws SQLException {
		// TODO Auto-generated method stub
		
		return dao.popupListone(popup);
	}


	@Override
	public void insertBener(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener(bener);
	}


	@Override
	public List<Hire> hireList(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireList(hire);
	}


	@Override
	public void hireInsert(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireInsert(hire);
	}


	@Override
	public void hireModify(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireModify(hire);
	}


	@Override
	public void hireDelete(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireDelete(hire);
	}


	@Override
	public Hire hireListone(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireListone(hire);
	}


	@Override
	public List<HireFAQ> hireFAQList(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireFAQList(hireFAQ);
	}


	@Override
	public HireFAQ hireFAQListone(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireFAQListone(hireFAQ);
	}


	@Override
	public void hireFAQInsert(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireFAQInsert(hireFAQ);
	}


	@Override
	public void hireFAQModify(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireFAQModify(hireFAQ);
	}


	@Override
	public void hireFAQDelete(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		dao.hireFAQDelete(hireFAQ);
	}


	@Override
	public List<News> newsList(News news) throws SQLException {
		// TODO Auto-generated method stub
		return dao.newsList(news);
	}


	@Override
	public News newsListone(News news) throws SQLException {
		// TODO Auto-generated method stub
		return dao.newsListone(news);
	}


	@Override
	public void newsInsert(News news) throws SQLException {
		
		dao.newsInsert(news);
	}


	@Override
	public void newsModify(News news) throws SQLException {
		// TODO Auto-generated method stub
		dao.newsModify(news);
	}


	@Override
	public void newsDelete(News news) throws SQLException {
		// TODO Auto-generated method stub
		dao.newsDelete(news);
	}


	@Override
	public List<PR> prList(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		return dao.prList(pr);
	}


	@Override
	public PR prListone(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		return dao.prListone(pr);
	}


	@Override
	public void prInsert(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		dao.prInsert(pr);
	}


	@Override
	public void prModify(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		dao.prModify(pr);
	}


	@Override
	public void prDelete(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		dao.prDelete(pr);
	}


	@Override
	public List<KdoInterview> kdointviewList(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		return dao.kdointviewList(kdointview);
	}


	@Override
	public KdoInterview kdointviewListone(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		return dao.kdointviewListone(kdointview);
	}


	@Override
	public void kdointviewInsert(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		dao.kdointviewInsert(kdointview);
	}


	@Override
	public void kdointviewModify(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		dao.kdointviewModify(kdointview);
	}


	@Override
	public void kdointviewDelete(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		dao.kdointviewDelete(kdointview);
	}


	@Override
	public Etronotice etronoticeListone(Etronotice enotice) throws SQLException {
		// TODO Auto-generated method stub
		return dao.etronoticeListone(enotice);
	}


	@Override
	public void etronoticeModify(Etronotice enotice) throws SQLException {
		// TODO Auto-generated method stub
		dao.etronoticeModify(enotice);
	}


	@Override
	public void etronoticeDelete(Etronotice enotice) throws SQLException {
		
		dao.etronoticeDelete(enotice);
	}


	@Override
	public Manager ManagerListone(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		return dao.ManagerListone(manager);
	}


	@Override
	public void ManagerModify(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		dao.ManagerModify(manager);
	}


	@Override
	public void ManagerDelete(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		dao.ManagerDelete(manager);
	}


	@Override
	public void LangtestDelete(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		dao.LangtestDelete(langtest);
	}


	@Override
	public void LangtestModify(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		dao.LangtestModify(langtest);
	}


	@Override
	public Langtest LangtestListone(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		return dao.LangtestListone(langtest);
	}


	@Override
	public List<Popup> popupListserch(Popup popup) throws SQLException {
		// TODO Auto-generated method stub
		return dao.popupListserch(popup);
	}


	@Override
	public List<Admin> adminList(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		return dao.adminList(admin);
	}


	@Override
	public Admin adminListone(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		return dao.adminListone(admin);
	}


	@Override
	public void adminInsert(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		dao.adminInsert(admin);
	}


	@Override
	public void adminModify(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		dao.adminModify(admin);
	}


	@Override
	public void adminDelete(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		dao.adminDelete(admin);
	}


	@Override
	public List<Evaluation> evaluationList(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		return dao.evaluationList(evaluation);
	}


	@Override
	public Evaluation evaluationListone(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		return dao.evaluationListone(evaluation);
	}


	@Override
	public void evaluationInsert(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		dao.evaluationInsert(evaluation);
	}


	@Override
	public void evaluationModify(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		dao.evaluationModify(evaluation);
	}


	@Override
	public void evaluationDelete(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		dao.evaluationDelete(evaluation);
	}


	@Override
	public List<Etronotice> EtronoticeListserch(Etronotice enotice) throws SQLException {
		// TODO Auto-generated method stub
		return dao.etronoticeListserch(enotice);
	}


	@Override
	public List<Manager> managerListserch(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		return dao.managerListserch(manager);
	}


	@Override
	public List<Langtest> langtestListserch(Langtest langtest) throws SQLException {
		// TODO Auto-generated method stub
		return dao.langtestListserch(langtest);
	}


	@Override
	public List<Hire> hireListserch(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireListserch(hire);
	}


	@Override
	public List<HireFAQ> hireFAQListserch(HireFAQ hireFAQ) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireFAQListserch(hireFAQ);
	}


	@Override
	public List<News> NewsListserch(News news) throws SQLException {
		// TODO Auto-generated method stub
		return dao.newsListserch(news);
	}


	@Override
	public List<PR> PRListserch(PR pr) throws SQLException {
		// TODO Auto-generated method stub
		return dao.prListserch(pr);
	}


	@Override
	public List<KdoInterview> kdointviewListserch(KdoInterview kdointview) throws SQLException {
		// TODO Auto-generated method stub
		return dao.kdointviewListserch(kdointview);
	}


	@Override
	public List<Admin> adminListserch(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		return dao.adminListserch(admin);
	}


	@Override
	public List<Evaluation> evaluationListserch(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		return dao.evaluationListserch(evaluation);
	}


	@Override
	public Admin adminView(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		return dao.adminView(admin);
	}
	
	@Override
	public Admin adminViewWithCredential(Credential credential) throws SQLException {
		// TODO Auto-generated method stub
		return dao.adminViewWithCredential(credential);
	}


	@Override
	public Bener benerListone(Bener bener) throws SQLException {
		
		if(bener == null || bener.getbSite() == null || bener.getbSite().equalsIgnoreCase("") || bener.getbSite().isEmpty()) {
			String site = "PC국문";
			bener.setbSite(site);
		}
		
		Bener baner1 = dao.benerListone(bener);
		
		System.out.println("banner1 : " + baner1.getbSite());
		return baner1;
	}


	@Override
	public int evaluationDeprivation(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		return dao.evaluationDeprivation(evaluation);
	}


	@Override
	public int evaluationRecognition(Evaluation evaluation) throws SQLException {
		// TODO Auto-generated method stub
		return dao.evaluationRecognition(evaluation);
	}


	@Override
	public void deleteBener6(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener6(bener);
	}


	@Override
	public void deleteBener5(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener5(bener);
	}


	@Override
	public void deleteBener4(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener4(bener);
	}


	@Override
	public void deleteBener3(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener3(bener);
	}


	@Override
	public void deleteBener2(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener2(bener);
	}


	@Override
	public void deleteBener1(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteBener1(bener);
	}


	@Override
	public void insertBener1(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener1(bener);
	}


	@Override
	public void insertBener2(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener2(bener);
	}


	@Override
	public void insertBener3(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener3(bener);
	}


	@Override
	public void insertBener4(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener4(bener);
	}


	@Override
	public void insertBener5(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener5(bener);
	}


	@Override
	public void insertBener6(Bener bener) throws SQLException {
		// TODO Auto-generated method stub
		dao.insertBener6(bener);
	}

}
