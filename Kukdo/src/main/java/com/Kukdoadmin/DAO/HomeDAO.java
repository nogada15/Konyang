package com.Kukdoadmin.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.Kukdoadmin.model.Academic;
import com.Kukdoadmin.model.Address;
import com.Kukdoadmin.model.CareerPartModel;
import com.Kukdoadmin.model.EmployModel;
import com.Kukdoadmin.model.Family;
import com.Kukdoadmin.model.Foreign;
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

	@SuppressWarnings("deprecation")
	@Repository
	public class HomeDAO {

		@Autowired
		private SqlMapClientTemplate template;
		
		public void insertRegMake(RegMakeModel regmake) {
			template.insert("regmake.insertRegMake", regmake);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<RegMakeModel> getAllRegMake(){
			return (ArrayList<RegMakeModel>) template.queryForList("regmake.getAllRegMakes");
		}
		
		public RegMakeModel getRegMake(RegMakeModel regmm){
			return (RegMakeModel) template.queryForObject("regmake.getRegMake", regmm);
		}
		
		public int updateRegMake(RegMakeModel regmake) {
			// TODO Auto-generated method stub
			return template.update("regmake.updateRegMake", regmake);
		}
		
		public int RegMakeModelDel(RegMakeModel regmm) {
			return template.delete("regmake.RegMakeModelDel", regmm);
			
		}
		
		public EmployModel getEmploy(EmployModel empmd){
			return (EmployModel) template.queryForObject("employ.getEmploys", empmd);
		}
		
		public void insertRegMake2(RegMakeModel2 regmake2) {
			template.insert("regmake2.insertRegMake2", regmake2);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<RegMakeModel2> getAllRegMake2(){
			return (ArrayList<RegMakeModel2>) template.queryForList("regmake2.getAllRegMake2s");
		}
		
		public RegMakeModel2 getRegMake2(RegMakeModel2 regmm2){
			return (RegMakeModel2) template.queryForObject("regmake2.getRegMake2", regmm2);
		}
		
		public int updateRegMake2(RegMakeModel2 regmake2) {
			// TODO Auto-generated method stub
			return template.update("regmake2.updateRegMake2", regmake2);
		}
		
		public int RegMakeModel2Del(RegMakeModel2 regmm2) {
			return template.delete("regmake2.RegMakeModel2Del", regmm2);
			
		}
		
		public void insertCareerPart(CareerPartModel cpm) {
			template.insert("cp.insertCareerPart", cpm);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<CareerPartModel> getAllCareerPart(){
			return (ArrayList<CareerPartModel>) template.queryForList("cp.getAllCareerParts");
		}
		
		public int updateCareerPart(CareerPartModel cpm) {
			// TODO Auto-generated method stub
			return template.update("cp.updateCareerPart", cpm);
		}
		
		public int CareerPartDel(CareerPartModel cpm) {
			return template.delete("cp.CareerPartDel", cpm);
			
		}
		
		public void insertFamily(Family fm) {
			template.insert("fm.insertFamily", fm);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Family> getAllFamily(){
			return (ArrayList<Family>) template.queryForList("fm.getAllFamilys");
		}
		
		public Family getFamily(Family fm){
			return (Family) template.queryForObject("fm.getFamily", fm);
		}
		
		public int updateFamily(Family family) {
			// TODO Auto-generated method stub
			return template.update("fm.updateFamily", family);
		}
		
		public int FamilyDel(Family family) {
			return template.delete("fm.FamilyDel", family);
			
		}
		
		public void insertLanguageTest(LanguageTest lf) {
			template.insert("lt.insertLanguageTest", lf);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<LanguageTest> getAllLanguageTest(){
			return (ArrayList<LanguageTest>) template.queryForList("lt.getAllLanguageTests");
		}
		
		public LanguageTest getLanguageTest(LanguageTest langt){
			return (LanguageTest) template.queryForObject("lt.getLanguageTest", langt);
		}
		
		public int updateLanguageTest(LanguageTest langt) {
			// TODO Auto-generated method stub
			return template.update("lt.updateLanguageTest", langt);
		}
		
		public int LanguageTestDel(LanguageTest langt) {
			return template.delete("lt.LanguageTestDel", langt);
			
		}
		
		public void insertLiecense(LiecenseModel lm) {
			template.insert("liecense.insertLiecense", lm);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<LiecenseModel> getAllLiecense(){
			return (ArrayList<LiecenseModel>) template.queryForList("liecense.getAllLiecenses");
		}
		
		public LiecenseModel getLiecense(LiecenseModel lm){
			return (LiecenseModel) template.queryForObject("liecense.getLiecense", lm);
		}
		
		public int updateLiecense(LiecenseModel lm) {
			// TODO Auto-generated method stub
			return template.update("liecense.updateLiecense", lm);
		}
		
		public int LiecenseDel(LiecenseModel lm) {
			return template.delete("liecense.LiecenseDel", lm);
			
		}
		
		public void insertMilitary(Military mm) {
			template.insert("mm.insertMilitary", mm);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Military> getAllMilitary(){
			return (ArrayList<Military>) template.queryForList("mm.getAllMilitarys");
		}
		
		public Military getMilitary(Military mm){
			return (Military) template.queryForObject("mm.getMilitary", mm);
		}
		
		public int updateMilitary(Military mm) {
			// TODO Auto-generated method stub
			return template.update("mm.updateMilitary", mm);
		}
		
		public int MilitaryDel(Military mm) {
			return template.delete("mm.MilitaryDel", mm);
			
		}
		
		public void insertOverSea(OverSea ovs) {
			template.insert("ovs.insertOverSea", ovs);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<OverSea> getAllOverSea(){
			return (ArrayList<OverSea>) template.queryForList("ovs.getAllOverSeas");
		}
		
		public OverSea getOverSea(OverSea ovs){
			return (OverSea) template.queryForObject("ovs.getOverSea", ovs);
		}
		
		public int updateOverSea(OverSea ovs) {
			// TODO Auto-generated method stub
			return template.update("ovs.updateOverSea", ovs);
		}
		
		public int OverSeaDel(OverSea ovs) {
			return template.delete("ovs.OverSeaDel", ovs);
			
		}
		
		public void insertAcademic(Academic aca) {
			template.insert("academic.insertAcademic", aca);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Academic> getAllAcademic(){
			return (ArrayList<Academic>) template.queryForList("academic.getAllAcademics");
		}
		
		public int AcademicDel(Academic aca) {
			return template.delete("academic.AcademicDel", aca);
			
		}
		
		public void insertSelf(Self self) {
			template.insert("self.insertSelf", self);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Self> getAllSelf(){
			return (ArrayList<Self>) template.queryForList("self.getAllSelfs");
		}
		
		public Self getSelf(Self self){
			return (Self) template.queryForObject("self.getSelf", self);
		}
		
		public int updateSelf(Self self) {
			// TODO Auto-generated method stub
			return template.update("self.updateSelf", self);
		}
		
		public int SelfDel(Self self) {
			return template.delete("self.SelfDel", self);
			
		}
		
		public RegMakeModel getPk(){
			return (RegMakeModel) template.queryForObject("regmake.getPk");
		}
		
		public Academic getAcademic(Academic aca){
			return (Academic) template.queryForObject("academic.getAcademic", aca);
		}
		
		public int updateAcademic(Academic aca) {
			// TODO Auto-generated method stub
			return template.update("academic.updateAcademic", aca);
		}
		
		public CareerPartModel getCareerPart(CareerPartModel cpm){
			return (CareerPartModel) template.queryForObject("cp.getCareerPart", cpm);
		}
		
		public void insertAddress(Address address) {
			template.insert("address.insertAddress", address);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Address> getAllAddress(){
			return (ArrayList<Address>) template.queryForList("address.getAllAddress");
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Address> AddSearch(Address address) {
			// TODO Auto-generated method stub
			return (ArrayList<Address>) template.queryForList("address.AddSearch", address);
		}
		
		public void insertSchool(School school) {
			template.insert("school.insertSchool", school);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<School> getAllSchool(){
			return (ArrayList<School>) template.queryForList("school.getAllSchool");
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<School> SchoolSearch(School school) {
			// TODO Auto-generated method stub
			return (ArrayList<School>) template.queryForList("school.SchoolSearch", school);
		}
		
		public void insertForeign(Foreign foreign) {
			template.insert("foreign.insertForeign", foreign);
		}
		
		/*@SuppressWarnings("unchecked")
		public ArrayList<Foreign> getAllForeign(){
			return (ArrayList<Foreign>) template.queryForList("foreign.getAllForeigns");
		}*/

		public void insertQuestion(Question question) {
			template.insert("qs.insertQuestion", question);
		}
		
		@SuppressWarnings("unchecked")
		public ArrayList<Question> getAllQuestion(){
			return (ArrayList<Question>) template.queryForList("qs.getAllQuestions");
		}

		@SuppressWarnings("unchecked")
		public List<Hire> hireList(Hire hire) {
			// TODO Auto-generated method stub
			return (List<Hire>) template.queryForList("hire.hireList", hire);
		}
		
	}
