package com.Kukdoadmin.service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kukdoadmin.DAO.HomeDAO;
import com.Kukdoadmin.model.Academic;
import com.Kukdoadmin.model.Address;
import com.Kukdoadmin.model.CareerPartModel;
import com.Kukdoadmin.model.EmployModel;
import com.Kukdoadmin.model.Family;
import com.Kukdoadmin.model.Hire;
import com.Kukdoadmin.model.LanguageTest;
import com.Kukdoadmin.model.LiecenseModel;
import com.Kukdoadmin.model.Military;
import com.Kukdoadmin.model.OverSea;
import com.Kukdoadmin.model.Question;
import com.Kukdoadmin.model.RegMakeModel;
import com.Kukdoadmin.model.RegMakeModel2;
import com.Kukdoadmin.model.School;
import com.Kukdoadmin.model.Self;
import com.Kukdoadmin.service.KukdoHomeService;


@Service
public class KukdoHomeServiceImpl implements KukdoHomeService{

	@Autowired
	private HomeDAO dao;

	@Override
	public void insertRegMake(RegMakeModel regmake) throws SQLException {
		dao.insertRegMake(regmake);
	}

	@Override
	public ArrayList<RegMakeModel> getAllRegMake() {
		return (ArrayList<RegMakeModel>) dao.getAllRegMake();
	}

	@Override
	public RegMakeModel getRegMake(RegMakeModel regmm) {
		return dao.getRegMake(regmm);
	}

	@Override
	public int updateRegMake(RegMakeModel regmake) throws SQLException {

		return dao.updateRegMake(regmake);
	}
	
	@Override
	public int RegMakeModelDel(RegMakeModel regmake) throws SQLException {
		return dao.RegMakeModelDel(regmake);
	}

	@Override
	public EmployModel getEmploy(EmployModel empmd) {
		return (EmployModel) dao.getEmploy(empmd);
	}

	@Override
	public void insertRegMake2(RegMakeModel2 regmake2) {
		dao.insertRegMake2(regmake2);
	}

	@Override
	public ArrayList<RegMakeModel2> getAllRegMake2() {
		return (ArrayList<RegMakeModel2>) dao.getAllRegMake2();
	}

	@Override
	public RegMakeModel2 getRegMake2(RegMakeModel2 regmm2) {
		return (RegMakeModel2) dao.getRegMake2(regmm2);
	}
	
	@Override
	public int updateRegMake2(RegMakeModel2 regmake2) throws SQLException {
		return dao.updateRegMake2(regmake2);
	}
	
	@Override
	public int RegMakeModel2Del(RegMakeModel2 regmake2) throws SQLException {
		return dao.RegMakeModel2Del(regmake2);
	}

	@Override
	public void insertCareerPart(CareerPartModel cpm) {
		dao.insertCareerPart(cpm);
	}

	@Override
	public ArrayList<CareerPartModel> getAllCareerPart() {
		return (ArrayList<CareerPartModel>) dao.getAllCareerPart();
	}

	@Override
	public CareerPartModel getCareerPart(CareerPartModel cpm) {
		return dao.getCareerPart(cpm);
	}
	
	@Override
	public int updateCareerPart(CareerPartModel cpm) throws SQLException {
		return dao.updateCareerPart(cpm);
	}
	
	@Override
	public int CareerPartDel(CareerPartModel cpm) throws SQLException {
		return dao.CareerPartDel(cpm);
	}

	@Override
	public void insertFamily(Family fm) {
		dao.insertFamily(fm);
	}

	@Override
	public ArrayList<Family> getAllFamily() {
		return (ArrayList<Family>) dao.getAllFamily();
	}

	@Override
	public Family getFamily(Family fm) {
		return (Family) dao.getFamily(fm);
	}
	
	@Override
	public int updateFamily(Family family) throws SQLException {
		return dao.updateFamily(family);
	}
	
	@Override
	public int FamilyDel(Family family) throws SQLException {
		return dao.FamilyDel(family);
	}

	@Override
	public void insertLanguageTest(LanguageTest lf) {
		dao.insertLanguageTest(lf);
	}

	@Override
	public ArrayList<LanguageTest> getAllLanguageTest() {
		return (ArrayList<LanguageTest>) dao.getAllLanguageTest();
	}

	@Override
	public LanguageTest getLanguageTest(LanguageTest langt) {
		return (LanguageTest) dao.getLanguageTest(langt);
	}
	
	@Override
	public int updateLanguageTest(LanguageTest langt) throws SQLException {
		return dao.updateLanguageTest(langt);
	}
	
	@Override
	public int LanguageTestDel(LanguageTest langt) throws SQLException {
		return dao.LanguageTestDel(langt);
	}

	@Override
	public void insertLiecense(LiecenseModel lm) {
		dao.insertLiecense(lm);
	}

	@Override
	public ArrayList<LiecenseModel> getAllLiecense() {
		return (ArrayList<LiecenseModel>) dao.getAllLiecense();
	}

	@Override
	public LiecenseModel getLiecense(LiecenseModel lm) {
		return (LiecenseModel) dao.getLiecense(lm);
	}
	
	@Override
	public int updateLiecense(LiecenseModel lm) throws SQLException {
		return dao.updateLiecense(lm);
	}
	
	@Override
	public int LiecenseDel(LiecenseModel lm) throws SQLException {
		return dao.LiecenseDel(lm);
	}

	@Override
	public void insertMilitary(Military mm) {
		dao.insertMilitary(mm);
	}

	@Override
	public ArrayList<Military> getAllMilitary() {
		return (ArrayList<Military>) dao.getAllMilitary();
	}

	@Override
	public Military getMilitary(Military mm) {
		return (Military) dao.getMilitary(mm);
	}
	
	@Override
	public int updateMilitary(Military mm) throws SQLException {
		return dao.updateMilitary(mm);
	}
	
	@Override
	public int MilitaryDel(Military mm) throws SQLException {
		return dao.MilitaryDel(mm);
	}

	@Override
	public void insertOverSea(OverSea ovs) {
		dao.insertOverSea(ovs);
	}

	@Override
	public ArrayList<OverSea> getAllOverSea() {
		return (ArrayList<OverSea>) dao.getAllOverSea();
	}

	@Override
	public OverSea getOverSea(OverSea ovs) {
		return (OverSea) dao.getOverSea(ovs);
	}

	@Override
	public int updateOverSea(OverSea ovs) throws SQLException {
		return dao.updateOverSea(ovs);
	}
	
	@Override
	public int OverSeaDel(OverSea ovs) throws SQLException {
		return dao.OverSeaDel(ovs);
	}
	
	@Override
	public void insertAcademic(Academic aca) {
		dao.insertAcademic(aca);
	}

	@Override
	public ArrayList<Academic> getAllAcademic() {
		return (ArrayList<Academic>) dao.getAllAcademic();
	}

	@Override
	public Academic getAcademic(Academic aca) {
		return (Academic) dao.getAcademic(aca);
	}
	
	@Override
	public int updateAcademic(Academic aca) throws SQLException {
		return dao.updateAcademic(aca);
	}
	
	@Override
	public int AcademicDel(Academic aca) throws SQLException {
		return dao.AcademicDel(aca);
	}

	@Override
	public void insertSelf(Self self) {
		dao.insertSelf(self);
	}

	@Override
	public ArrayList<Self> getAllSelf() {
		return (ArrayList<Self>) dao.getAllSelf();
	}

	@Override
	public Self getSelf(Self self) {
		return (Self) dao.getSelf(self);
	}
	
	@Override
	public int updateSelf(Self self) throws SQLException {
		return dao.updateSelf(self);
	}
	
	@Override
	public int SelfDel(Self self) throws SQLException {
		return dao.SelfDel(self);
	}

	@Override
	public RegMakeModel getPk() {
		return (RegMakeModel) dao.getPk();
	}

	@Override
	public void insertAddress(Address regmake) {
		dao.insertAddress(regmake);
	}

	@Override
	public ArrayList<Address> getAllAddress() {
		return (ArrayList<Address>) dao.getAllAddress();
	}
	
	@Override
	public ArrayList<Address> AddSearch(Address address) {
		return (ArrayList<Address>) dao.AddSearch(address);
	}
	
	@Override
	public void insertSchool(School school) {
		dao.insertSchool(school);
	}

	@Override
	public ArrayList<School> getAllSchool() {
		return (ArrayList<School>) dao.getAllSchool();
	}
	
	@Override
	public ArrayList<School> SchoolSearch(School school) {
		return (ArrayList<School>) dao.SchoolSearch(school);
	}

	/*@Override
	public void insertForeign(Foreign foreign) throws SQLException {
		dao.insertForeign(foreign);
	}*/

/*	@Override
	public ArrayList<Foreign> getAllForeign() {
		return (ArrayList<Foreign>) dao.getAllForeign();
	}*/
	
	@Override
	public void insertQuestion(Question question) throws SQLException {
		dao.insertQuestion(question);
	}

	@Override
	public ArrayList<Question> getAllQuestion() {
		return (ArrayList<Question>) dao.getAllQuestion();
	}

	@Override
	public List<Hire> HhireList(Hire hire) throws SQLException {
		// TODO Auto-generated method stub
		return dao.hireList(hire);
	}

	
}
