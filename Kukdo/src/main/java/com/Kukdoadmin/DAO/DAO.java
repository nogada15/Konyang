package com.Kukdoadmin.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

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

@SuppressWarnings("deprecation")
@Repository
public class DAO{

	@Autowired
    SqlMapClientTemplate sqlMapClientTemplate;
	
	
	public void insertBener(Bener bener) {
		 sqlMapClientTemplate.update("bener.updateBener", bener);
	}
	
	public void popupInsert(Popup popup){
		sqlMapClientTemplate.insert("popup.popupInsert", popup);
	}

	@SuppressWarnings("unchecked")
	public List<Popup> popupList(Popup popup) {
		// TODO Auto-generated method stub
		return (List<Popup>)sqlMapClientTemplate.queryForList("popup.popupList", popup);
	}


	@SuppressWarnings("unchecked")
	public List<Etronotice> etronoticeList(Etronotice enotice) {
		// TODO Auto-generated method stub
		return (List<Etronotice>)sqlMapClientTemplate.queryForList("etronotice.etronoticeList", enotice);
	}

	public void etronoticeInsert(Etronotice enotice) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("etronotice.etronoticeInsert", enotice);
	}


	@SuppressWarnings("unchecked")
	public List<Manager> managerList(Manager manager) {
		// TODO Auto-generated method stub
		return (List<Manager>) sqlMapClientTemplate.queryForList("manager.managerList", manager);
	}

	public void managerInsert(Manager manager) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("manager.managerInsert", manager);
	}

	@SuppressWarnings("unchecked")
	public List<Langtest> langtestList(Langtest langtest) {
		// TODO Auto-generated method stub
		return (List<Langtest>) sqlMapClientTemplate.queryForList("langtest.langtestList", langtest);
	}

	public void langtestInsert(Langtest langtest) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("langtest.lnagtestInsert", langtest);
	}

	public void popupModify(Popup popup) {
		sqlMapClientTemplate.update("popup.popupModify", popup);
	}

	public void popupDelete(Popup popup) {
		sqlMapClientTemplate.delete("popup.popupDelete", popup);
		
	}

	public Popup popupListone(Popup popup) {
		// TODO Auto-generated method stub
		return (Popup)sqlMapClientTemplate.queryForObject("popup.popupListone", popup);
		
	}

	@SuppressWarnings("unchecked")
	public List<Hire> hireList(Hire hire) {
		// TODO Auto-generated method stub
		return (List<Hire>) sqlMapClientTemplate.queryForList("hire.hireList", hire);
	}

	public void hireInsert(Hire hire) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("hire.hireInsert", hire);
	}

	public void hireModify(Hire hire) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("hire.hireModify", hire);
	}
	
	public void hireDelete(Hire hire) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("hire.hireDelete", hire);
	}

	public Hire hireListone(Hire hire) {
		// TODO Auto-generated method stub
		return (Hire) sqlMapClientTemplate.queryForObject("hire.hireListone", hire);
	}

	public void hireFAQDelete(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("hireFAQ.hireFAQDelete", hireFAQ);
	}

	public void hireFAQModify(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("hireFAQ.hireFAQModify", hireFAQ);
	}

	public void hireFAQInsert(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("hireFAQ.hireFAQInsert", hireFAQ);
	}


	public HireFAQ hireFAQListone(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		return (HireFAQ) sqlMapClientTemplate.queryForObject("hireFAQ.hireFAQListone", hireFAQ);
	}

	@SuppressWarnings("unchecked")
	public List<HireFAQ> hireFAQList(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		return (List<HireFAQ>) sqlMapClientTemplate.queryForList("hireFAQ.hireFAQList", hireFAQ);
	}

	@SuppressWarnings("unchecked")
	public List<News> newsList(News news) {
		// TODO Auto-generated method stub
		return (List<News>) sqlMapClientTemplate.queryForList("news.newsList", news);
	}

	public News newsListone(News news) {
		// TODO Auto-generated method stub
		return (News) sqlMapClientTemplate.queryForObject("news.newsListone", news);
	}

	public void newsInsert(News news) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("news.newsInsert", news);
	}

	public void newsModify(News news) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("news.newsModify", news);
	}

	public void newsDelete(News news) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("news.newsDelete", news);
	}

	@SuppressWarnings("unchecked")
	public List<PR> prList(PR pr) {
		// TODO Auto-generated method stub
		return (List<PR>) sqlMapClientTemplate.queryForList("pr.prList", pr);
	}

	public PR prListone(PR pr) {
		// TODO Auto-generated method stub
		return (PR) sqlMapClientTemplate.queryForObject("pr.prListone", pr);
	}

	public void prInsert(PR pr) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("pr.prInsert", pr);
	}

	public void prModify(PR pr) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("pr.prModify", pr);
	}

	public void prDelete(PR pr) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("pr.prDelete", pr);
	}

	@SuppressWarnings("unchecked")
	public List<KdoInterview> kdointviewList(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		return (List<KdoInterview>) sqlMapClientTemplate.queryForList("kdointerview.kdointviewList", kdointview);
	}


	public KdoInterview kdointviewListone(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		return (KdoInterview) sqlMapClientTemplate.queryForObject("kdointerview.kdointviewListone", kdointview);
	}

	public void kdointviewInsert(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("kdointerview.kdointviewInsert", kdointview);
	}

	public void kdointviewModify(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("kdointerview.kdointviewModify", kdointview);
	}

	public void kdointviewDelete(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("kdointerview.kdointviewDelete", kdointview);
	}

	public Etronotice etronoticeListone(Etronotice enotice) {
		// TODO Auto-generated method stub
		return (Etronotice) sqlMapClientTemplate.queryForObject("etronotice.etronoticeListone", enotice);
	}

	public void etronoticeModify(Etronotice enotice) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("etronotice.etronoticeModify", enotice);
	}

	public void etronoticeDelete(Etronotice enotice) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("etronotice.etronoticeDelete", enotice);
	}

	public Manager ManagerListone(Manager manager) {
		// TODO Auto-generated method stub
		return (Manager) sqlMapClientTemplate.queryForObject("manager.managerListone", manager);
	}

	public void ManagerModify(Manager manager) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("manager.managerModify", manager);
	}

	public void ManagerDelete(Manager manager) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("manager.managerDelete", manager);
	}

	public void LangtestDelete(Langtest langtest) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("langtest.langtestDelete", langtest);
	}

	public void LangtestModify(Langtest langtest) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("langtest.lnagtestModify", langtest);
	}

	public Langtest LangtestListone(Langtest langtest) {
		// TODO Auto-generated method stub
		return (Langtest) sqlMapClientTemplate.queryForObject("langtest.langtestListone", langtest);
	}

	@SuppressWarnings("unchecked")
	public List<Popup> popupListserch(Popup popup) {
		
		popup.setKeyword(popup.getKeyword().trim());
		return (List<Popup>) sqlMapClientTemplate.queryForList("popup.popupListserch", popup);
	}

	public boolean loginProcess(Admin admin) {
		Object name = sqlMapClientTemplate.queryForObject("admin.adminCheck", admin);
		return (name == null) ? false : true;
	}

	@SuppressWarnings("unchecked")
	public List<Admin> adminList(Admin admin) {
		// TODO Auto-generated method stub
		return (List<Admin>) sqlMapClientTemplate.queryForList("admin.adminList", admin);
	}

	public Admin adminListone(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin) sqlMapClientTemplate.queryForObject("admin.adminListone", admin);
	}

	public void adminInsert(Admin admin) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("admin.adminInsert", admin);
	}

	public void adminModify(Admin admin) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("admin.adminModify", admin);
	}

	public void adminDelete(Admin admin) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("admin.adminDelete", admin);
	}

	public void evaluationDelete(Evaluation evaluation) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.delete("evaluation.evaluationDelete", evaluation);
	}

	public void evaluationModify(Evaluation evaluation) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("evaluation.evaluationModify", evaluation);
	}

	public void evaluationInsert(Evaluation evaluation) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.insert("evaluation.evaluationInsert", evaluation);
	}

	public Evaluation evaluationListone(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return (Evaluation) sqlMapClientTemplate.queryForObject("evaluation.evaluationListone", evaluation);
	}

	@SuppressWarnings("unchecked")
	public List<Evaluation> evaluationList(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return (List<Evaluation>) sqlMapClientTemplate.queryForList("evaluation.evaluationList", evaluation);
	}

	@SuppressWarnings("unchecked")
	public List<Etronotice> etronoticeListserch(Etronotice enotice) {
//		enotice.setKeyword(enotice.getKeyword().trim());
		return (List<Etronotice>) sqlMapClientTemplate.queryForList("etronotice.etronoticeListserch", enotice);
	}

	@SuppressWarnings("unchecked")
	public List<Manager> managerListserch(Manager manager) {
		return (List<Manager>) sqlMapClientTemplate.queryForList("manager.managerListserch", manager);
	}

	@SuppressWarnings("unchecked")
	public List<Langtest> langtestListserch(Langtest langtest) {
		langtest.setKeyword(langtest.getKeyword().trim());
		langtest.setSearchOption1(langtest.getSearchOption1().trim());
		
		if(langtest.getSearchOption1().equalsIgnoreCase("bLang")) {
			return (List<Langtest>) sqlMapClientTemplate.queryForList("langtest.langtestListserchLang", langtest);
		}else {
			return (List<Langtest>) sqlMapClientTemplate.queryForList("langtest.langtestListserchTestName", langtest);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Hire> hireListserch(Hire hire) {
		// TODO Auto-generated method stub
		return (List<Hire>) sqlMapClientTemplate.queryForList("hire.hireListserch", hire);
	}

	@SuppressWarnings("unchecked")
	public List<HireFAQ> hireFAQListserch(HireFAQ hireFAQ) {
		// TODO Auto-generated method stub
		return (List<HireFAQ>) sqlMapClientTemplate.queryForList("hireFAQ.hireFAQListserch", hireFAQ);
	}

	@SuppressWarnings("unchecked")
	public List<News> newsListserch(News news) {
		// TODO Auto-generated method stub
		return (List<News>) sqlMapClientTemplate.queryForList("news.newsListserch", news);
	}

	@SuppressWarnings("unchecked")
	public List<PR> prListserch(PR pr) {
		// TODO Auto-generated method stub
		return (List<PR>) sqlMapClientTemplate.queryForList("pr.prListserch", pr);
	}

	@SuppressWarnings("unchecked")
	public List<KdoInterview> kdointviewListserch(KdoInterview kdointview) {
		// TODO Auto-generated method stub
		return (List<KdoInterview>) sqlMapClientTemplate.queryForList("kdointerview.kdointviewListserch", kdointview);
	}

	@SuppressWarnings("unchecked")
	public List<Admin> adminListserch(Admin admin) {
		if(admin.getSearchOption().equalsIgnoreCase("buserId")) {
			return (List<Admin>) sqlMapClientTemplate.queryForList("admin.adminListserchId", admin);
		} else if(admin.getSearchOption().equalsIgnoreCase("bName")) {
			return (List<Admin>) sqlMapClientTemplate.queryForList("admin.adminListserchName", admin);
		} else {
			return (List<Admin>) sqlMapClientTemplate.queryForList("admin.adminListserchFeld", admin);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Evaluation> evaluationListserch(Evaluation evaluation) {
		if(evaluation.getSearchOption().equalsIgnoreCase("buserId")) {
			return (List<Evaluation>) sqlMapClientTemplate.queryForList("evaluation.evaluationListserchId", evaluation);
		} else if(evaluation.getSearchOption().equalsIgnoreCase("bName")) {
			return (List<Evaluation>) sqlMapClientTemplate.queryForList("evaluation.evaluationListserchName", evaluation);
		} else {
			return (List<Evaluation>) sqlMapClientTemplate.queryForList("evaluation.evaluationListserchFeld", evaluation);
		}
		
	}

	public Admin adminView(Admin admin) {
		// TODO Auto-generated method stub
		return (Admin) sqlMapClientTemplate.queryForObject("admin.adminCheck", admin);
	}
	
	public Admin adminViewWithCredential(Credential credential) {
		// TODO Auto-generated method stub
		return (Admin) sqlMapClientTemplate.queryForObject("admin.adminView", credential);
	}

	public Bener benerListone(Bener bener) {
		// TODO Auto-generated method stub
		return (Bener) sqlMapClientTemplate.queryForObject("bener.selectBener", bener);
	}

	public int evaluationDeprivation(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return sqlMapClientTemplate.update("evaluation.evaluationDeprivation", evaluation);
	}

	public int evaluationRecognition(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return sqlMapClientTemplate.update("evaluation.evaluationRecognition", evaluation);
	}

	public void deleteBener6(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener6", bener);
	}

	public void deleteBener5(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener5", bener);
	}

	public void deleteBener4(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener4", bener);
	}

	public void deleteBener3(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener3", bener);
	}

	public void deleteBener2(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener2", bener);
	}

	public void deleteBener1(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.deleteBener1", bener);
	}

	public void insertBener1(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener1", bener);
	}

	public void insertBener2(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener2", bener);
	}

	public void insertBener3(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener3", bener);
	}

	public void insertBener4(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener4", bener);
	}

	public void insertBener5(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener5", bener);
	}

	public void insertBener6(Bener bener) {
		// TODO Auto-generated method stub
		sqlMapClientTemplate.update("bener.updateBener6", bener);
	}

	
	

}
