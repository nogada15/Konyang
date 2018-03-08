package com.Kukdoadmin.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

public interface KukdoHomeService {
	
	public void insertRegMake(RegMakeModel regmake)throws SQLException;
	public ArrayList<RegMakeModel> getAllRegMake();
	public RegMakeModel getRegMake(RegMakeModel regmm);
	public int updateRegMake(RegMakeModel regmake) throws SQLException;
	public int RegMakeModelDel(RegMakeModel regmake) throws SQLException;
	public EmployModel getEmploy(EmployModel empmd);
	
	
	public void insertRegMake2(RegMakeModel2 regmake2);
	public ArrayList<RegMakeModel2> getAllRegMake2();
	public RegMakeModel2 getRegMake2(RegMakeModel2 regmm2);
	public int updateRegMake2(RegMakeModel2 regmake2) throws SQLException;
	public int RegMakeModel2Del(RegMakeModel2 regmake2) throws SQLException;
	
	public void insertCareerPart(CareerPartModel cpm);
	public ArrayList<CareerPartModel> getAllCareerPart();
	public CareerPartModel getCareerPart(CareerPartModel cpm);
	public int updateCareerPart(CareerPartModel cpm) throws SQLException;
	public int CareerPartDel(CareerPartModel cpm) throws SQLException;
	
	public void insertFamily(Family fm);
	public ArrayList<Family> getAllFamily();
	public Family getFamily(Family fm);
	public int updateFamily(Family fm) throws SQLException;
	public int FamilyDel(Family fm) throws SQLException;
	
	public void insertLanguageTest(LanguageTest lt);
	public ArrayList<LanguageTest> getAllLanguageTest();	
	public LanguageTest getLanguageTest(LanguageTest langt);	
	public int updateLanguageTest(LanguageTest langt) throws SQLException;
	public int LanguageTestDel(LanguageTest langt) throws SQLException;
	
	public void insertLiecense(LiecenseModel lm);
	public ArrayList<LiecenseModel> getAllLiecense();
	public LiecenseModel getLiecense(LiecenseModel lm);
	public int updateLiecense(LiecenseModel lm) throws SQLException;
	public int LiecenseDel(LiecenseModel lm) throws SQLException;
	
	public void insertMilitary(Military mm);
	public ArrayList<Military> getAllMilitary();
	public Military getMilitary(Military mm);
	public int updateMilitary(Military mm) throws SQLException;
	public int MilitaryDel(Military mm) throws SQLException;
	
	public void insertOverSea(OverSea ovs);
	public ArrayList<OverSea> getAllOverSea();
	public OverSea getOverSea(OverSea ovs);
	public int updateOverSea(OverSea ovs) throws SQLException;
	public int OverSeaDel(OverSea ovs) throws SQLException;
	
	public void insertAcademic(Academic aca);
	public ArrayList<Academic> getAllAcademic();
	public Academic getAcademic(Academic aca);
	public int updateAcademic(Academic aca) throws SQLException;
	public int AcademicDel(Academic aca) throws SQLException;
	
	public void insertSelf(Self self);
	public ArrayList<Self> getAllSelf();
	public Self getSelf(Self self);
	public int updateSelf(Self self) throws SQLException;
	public int SelfDel(Self self) throws SQLException;
	
	public RegMakeModel getPk();
	
	public void insertAddress(Address self);
	public ArrayList<Address> getAllAddress();
	public ArrayList<Address> AddSearch(Address address);
	
	public void insertSchool(School school);
	public ArrayList<School> getAllSchool();
	public ArrayList<School> SchoolSearch(School school);
	
	/*public void insertForeign(Foreign foreign)throws SQLException;
	public ArrayList<Foreign> getAllForeign();*/

	public void insertQuestion(Question question)throws SQLException;
	public ArrayList<Question> getAllQuestion();
	
	public List<Hire> HhireList(Hire hire)throws SQLException;
}
