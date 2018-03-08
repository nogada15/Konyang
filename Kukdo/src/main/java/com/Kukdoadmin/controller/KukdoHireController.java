package com.Kukdoadmin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kukdoadmin.common.FileUtils;
import com.Kukdoadmin.model.ApplyCareer;
import com.Kukdoadmin.model.ApplyIntern;
import com.Kukdoadmin.model.ApplyModel;
import com.Kukdoadmin.model.ApplyNewComer;
import com.Kukdoadmin.model.EmployModel;
import com.Kukdoadmin.service.KukdoHireService;

@Controller
public class KukdoHireController {
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private KukdoHireService service;

	@Resource(name = "uploadPath")
	private String uploadPath;

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;
	
	/*@RequestMapping(value = "regmake/reg_1")
	public String reg_1(HttpServletRequest req, Model model) {
		System.out.println("reg_1()");
		
		
		String title = (String) model.asMap().get("title");
		String apk = (String) model.asMap(). get("pk");
		
		
		System.out.println(title);
		System.out.println(apk);
		
		return "/Admin/regmake/reg_1";
	}
	
	@RequestMapping(value = "regmake/reg_2")
	public String reg_2(HttpServletRequest req, Model model) throws SQLException {
		System.out.println("/Admin/reg_2()");
		

		int num=0;
		String apk;
		String title;
		String email;
		title = req.getParameter("title");
		apk = req.getParameter("pk");
		email = req.getParameter("email1")+"@"+req.getParameter("email2");
		
		num=Integer.parseInt(apk);
		
		System.out.println(title);
		System.out.println(apk);
		System.out.println(num);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("title",title);
		map.put("apk",apk);
		
		
		RegMakeModel regmm = new RegMakeModel();
		RegMakeModel2 regmm2 = new RegMakeModel2();
		
		regmm.setName(req.getParameter("name"));
		regmm2.setBirthyear(req.getParameter("birthyear"));
		regmm2.setBirthmonth(req.getParameter("birthmonth"));
		regmm2.setBirthday(req.getParameter("birthday"));
		regmm.setEmail(email);
		regmm.setApk(num); 
		regmm2.setApk(num);
		
		map.put("name", req.getParameter("name"));
		map.put("birthyear", req.getParameter("birthyear"));
		map.put("birthmonth", req.getParameter("birthmonth"));
		map.put("birthday", req.getParameter("birthday"));
		map.put("email", email);
		
		RegMakeModel regpk1 = new RegMakeModel();
		regpk1 = service.getPk();
		RegMakeModel regchck = new RegMakeModel();
		regchck = service.getRegMake(regpk1);
		
		String checkname = req.getParameter("name");
		
		System.out.println(regchck.getName());
		System.out.println(checkname);
		
		if(checkname.equals(regchck.getName())) {
			service.updateRegMake(regmm);
		}
		else {
			service.insertRegMake(regmm);
		}
		
		
		RegMakeModel regpk = new RegMakeModel();
		regpk = service.getPk();
		
		int pk = regpk.getPk();
		
		System.out.println(pk);
		
		regmm2.setPk(pk);
		map.put("pk", pk);
		
		
		if(checkname.equals(regchck.getName())) {
			service.updateRegMake2(regmm2);
		}
		else {
			service.insertRegMake2(regmm2);
		}
		
		model.addAttribute("pk",map);
		model.addAttribute("name",map);
		model.addAttribute("birthyear",map);
		model.addAttribute("birthmonth",map);
		model.addAttribute("birthday",map);
		model.addAttribute("email",map);
		model.addAttribute("title",map);
		model.addAttribute("apk",map);
		
		return "/Admin/regmake/reg_2";
	}

	@RequestMapping(value = "/Admin/regmake/reg_3")
	public String reg_3(HttpServletRequest req, Model model, MultipartFile pic) throws  Exception {
		
		
		
		Map<String, Object> map = new HashMap<String,Object>();
		String apkfk = req.getParameter("apk");
		String pkfk = req.getParameter("pk");
		map.put("apk",apkfk);
		map.put("pk", pkfk);
		
		int apk = Integer.parseInt(apkfk);
		int pk	= Integer.parseInt(pkfk);
		RegMakeModel regmm = new RegMakeModel();
		if (pic.getOriginalFilename() != "") {
			FileUtils ut = new FileUtils();
			String fileName = ut.uploadFile(pic.getOriginalFilename(), pic.getBytes());
			regmm.setPic(fileName);
			System.out.println("fileName : " + fileName);
		}
		
		
		regmm.setPk(pk);
		regmm.setChina(req.getParameter("china"));
		regmm.setEng(req.getParameter("eng"));
		regmm.setBohunYN(req.getParameter("bohunYN"));
		regmm.setBohunnum(req.getParameter("bohunnum"));
		regmm.setDisableYN(req.getParameter("disableYN"));
		regmm.setDisablenum(req.getParameter("disablenum"));
		regmm.setMarry(req.getParameter("marry"));
		regmm.setHp(req.getParameter("hp"));
		regmm.setPhone(req.getParameter("phone"));
		regmm.setAddress(req.getParameter("address"));
		regmm.setAddressnum(req.getParameter("addressnum"));
		regmm.setRestaddress(req.getParameter("restaddress"));
//		regmm.setPic(req.getParameter("pic"));
		
		
		
		service.updateRegMake(regmm);
		
		RegMakeModel2 regmm2 = new RegMakeModel2();
		regmm2.setBirthdetail(req.getParameter("birthdetail"));
		regmm2.setHobby(req.getParameter("hobby"));
		regmm2.setFaith(req.getParameter("faith"));
		regmm2.setHopework(req.getParameter("hopework"));
		regmm2.setHopeincome(req.getParameter("hopeincome"));
		regmm2.setHeight(req.getParameter("height"));
		regmm2.setWeight(req.getParameter("weight"));
		regmm2.setNowaddress(req.getParameter("nowaddress"));
		regmm2.setNowaddressnum(req.getParameter("nowaddressnum"));
		regmm2.setNowrestaddress(req.getParameter("nowrestaddress"));
		regmm2.setPk(pk);
		service.updateRegMake2(regmm2);
		
		
		
		CareerPartModel cpm = new CareerPartModel();
		cpm.setCompany1(req.getParameter("company1"));
		cpm.setDepart1(req.getParameter("depart1"));
		cpm.setWork1(req.getParameter("work1"));
		cpm.setLevel1(req.getParameter("level1"));
		cpm.setJoinyear1(req.getParameter("joinyear1"));
		cpm.setJoinmonth1(req.getParameter("joinmonth1"));
		cpm.setResignyear1(req.getParameter("resignyear1"));
		cpm.setResignmonth1(req.getParameter("resignmonth1"));
		cpm.setIncome1(req.getParameter("incom1"));
		cpm.setCompany2(req.getParameter("company2"));
		cpm.setDepart2(req.getParameter("depart2"));
		cpm.setWork2(req.getParameter("work2"));
		cpm.setLevel2(req.getParameter("level2"));
		cpm.setJoinyear2(req.getParameter("joinyear2"));
		cpm.setJoinmonth2(req.getParameter("joinmonth2"));
		cpm.setResignyear2(req.getParameter("resignyear2"));
		cpm.setResignmonth2(req.getParameter("resignmonth2"));
		cpm.setIncome2(req.getParameter("incom2"));
		cpm.setApk(apk);
		cpm.setPk(pk);
		
		if(service.getCareerPart(cpm) == null) {
			service.insertCareerPart(cpm);
		}
		else {
			service.updateCareerPart(cpm);
		}
		
		
		Family fm = new Family();
		fm.setFamily1(req.getParameter("family1"));
		fm.setName1(req.getParameter("name1"));
		fm.setAge1(req.getParameter("age1"));
		fm.setEducation1(req.getParameter("education1"));
		fm.setJob1(req.getParameter("job1"));
		fm.setLive1(req.getParameter("level1"));
		fm.setFamily2(req.getParameter("family2"));
		fm.setName2(req.getParameter("name2"));
		fm.setAge2(req.getParameter("age2"));
		fm.setEducation2(req.getParameter("education2"));
		fm.setJob2(req.getParameter("job2"));
		fm.setLive2(req.getParameter("level2"));
		fm.setFamily3(req.getParameter("family3"));
		fm.setName3(req.getParameter("name3"));
		fm.setAge3(req.getParameter("age3"));
		fm.setEducation3(req.getParameter("education3"));
		fm.setJob3(req.getParameter("job3"));
		fm.setLive3(req.getParameter("level3"));
		fm.setFamily4(req.getParameter("family4"));
		fm.setName4(req.getParameter("name4"));
		fm.setAge4(req.getParameter("age4"));
		fm.setEducation4(req.getParameter("education4"));
		fm.setJob4(req.getParameter("job4"));
		fm.setLive4(req.getParameter("level4"));
		fm.setApk(apk);
		fm.setPk(pk);
		
		if(service.getFamily(fm) == null) {
			service.insertFamily(fm);
		}
		else {
			service.updateFamily(fm);
		}
		
		
		LanguageTest langt = new LanguageTest();
		langt.setLanguage1(req.getParameter("language1"));
		langt.setTestname1(req.getParameter("testname1"));
		langt.setTestyear1(req.getParameter("testyear1"));
		langt.setTestmonth1(req.getParameter("testmonth1"));
		langt.setTestday1(req.getParameter("testday1"));
		langt.setTestbbyear1(req.getParameter("testbbyear1"));
		langt.setTestbbmonth1(req.getParameter("testbbmonth1"));
		langt.setTestbbday1(req.getParameter("testbbday1"));
		langt.setLevel1(req.getParameter("level1"));
		langt.setLanguage2(req.getParameter("language2"));
		langt.setTestname2(req.getParameter("testname2"));
		langt.setTestyear2(req.getParameter("testyear2"));
		langt.setTestmonth2(req.getParameter("testmonth2"));
		langt.setTestday2(req.getParameter("testday2"));
		langt.setTestbbyear2(req.getParameter("testbbyear2"));
		langt.setTestbbmonth2(req.getParameter("testbbmonth2"));
		langt.setTestbbday2(req.getParameter("testbbday2"));
		langt.setLevel2(req.getParameter("level2"));
		langt.setLanguage3(req.getParameter("language3"));
		langt.setTestname3(req.getParameter("testname3"));
		langt.setTestyear3(req.getParameter("testyear3"));
		langt.setTestmonth3(req.getParameter("testmonth3"));
		langt.setTestday3(req.getParameter("testday3"));
		langt.setTestbbyear3(req.getParameter("testbbyear3"));
		langt.setTestbbmonth3(req.getParameter("testbbmonth3"));
		langt.setTestbbday3(req.getParameter("testbbday3"));
		langt.setLevel3(req.getParameter("level3"));
		langt.setLanguage4(req.getParameter("language4"));
		langt.setTestname4(req.getParameter("testname4"));
		langt.setTestyear4(req.getParameter("testyear4"));
		langt.setTestmonth4(req.getParameter("testmonth4"));
		langt.setTestday4(req.getParameter("testday4"));
		langt.setTestbbyear4(req.getParameter("testbbyear4"));
		langt.setTestbbmonth4(req.getParameter("testbbmonth4"));
		langt.setTestbbday4(req.getParameter("testbbday4"));
		langt.setLevel4(req.getParameter("level4"));
		langt.setLanguage5(req.getParameter("language5"));
		langt.setTestname5(req.getParameter("testname5"));
		langt.setTestyear5(req.getParameter("testyear5"));
		langt.setTestmonth5(req.getParameter("testmonth5"));
		langt.setTestday5(req.getParameter("testday5"));
		langt.setTestbbyear5(req.getParameter("testbbyear5"));
		langt.setTestbbmonth5(req.getParameter("testbbmonth5"));
		langt.setTestbbday5(req.getParameter("testbbday5"));
		langt.setLevel5(req.getParameter("level5"));
		langt.setTestscore1(req.getParameter("testscore1"));
		langt.setTestscore2(req.getParameter("testscore2"));
		langt.setTestscore3(req.getParameter("testscore3"));
		langt.setTestscore4(req.getParameter("testscore4"));
		langt.setTestscore5(req.getParameter("testscore5"));
		langt.setApk(apk);
		langt.setPk(pk);
		
		if(service.getLanguageTest(langt) == null) {
			service.insertLanguageTest(langt);
		}
		else {
			service.updateLanguageTest(langt);
		}
		
		

		LiecenseModel lcm = new LiecenseModel();
		lcm.setLiecensename1(req.getParameter("liecensename1"));
		lcm.setLiecenseyear1(req.getParameter("liecenseyear1"));
		lcm.setLiecensemonth1(req.getParameter("liecensemonth1"));
		lcm.setLiecenseday1(req.getParameter("liecenseday1"));
		lcm.setLiecenseori1(req.getParameter("liecenseori1"));
		lcm.setLiecensecode1(req.getParameter("liecensecode1"));
		lcm.setLiecensename2(req.getParameter("liecensename2"));
		lcm.setLiecenseyear2(req.getParameter("liecenseyear2"));
		lcm.setLiecensemonth2(req.getParameter("liecensemonth2"));
		lcm.setLiecenseday2(req.getParameter("liecenseday2"));
		lcm.setLiecenseori2(req.getParameter("liecenseori2"));
		lcm.setLiecensecode2(req.getParameter("liecensecode2"));
		lcm.setLiecensename3(req.getParameter("liecensename3"));
		lcm.setLiecenseyear3(req.getParameter("liecenseyear3"));
		lcm.setLiecensemonth3(req.getParameter("liecensemonth3"));
		lcm.setLiecenseday3(req.getParameter("liecenseday3"));
		lcm.setLiecenseori3(req.getParameter("liecenseori3"));
		lcm.setLiecensecode3(req.getParameter("liecensecode3"));
		lcm.setLiecensename4(req.getParameter("liecensename4"));
		lcm.setLiecenseyear4(req.getParameter("liecenseyear4"));
		lcm.setLiecensemonth4(req.getParameter("liecensemonth4"));
		lcm.setLiecenseday4(req.getParameter("liecenseday4"));
		lcm.setLiecenseori4(req.getParameter("liecenseori4"));
		lcm.setLiecensecode4(req.getParameter("liecensecode4"));
		lcm.setLiecensename5(req.getParameter("liecensename5"));
		lcm.setLiecenseyear5(req.getParameter("liecenseyear5"));
		lcm.setLiecensemonth5(req.getParameter("liecensemonth5"));
		lcm.setLiecenseday5(req.getParameter("liecenseday5"));
		lcm.setLiecenseori5(req.getParameter("liecenseori5"));
		lcm.setLiecensecode5(req.getParameter("liecensecode5"));
		lcm.setApk(apk);
		lcm.setPk(pk);
		
		if(service.getLiecense(lcm) == null) {
			service.insertLiecense(lcm);
		}
		else {
			service.updateLiecense(lcm);
		}
		
		
		
		Military mm = new Military();
		mm.setMilitary(req.getParameter("military"));
		mm.setMilitarypart(req.getParameter("militarypart"));
		mm.setMilitaryver(req.getParameter("militaryver"));
		mm.setMilitarylevel(req.getParameter("militarylevel"));
		mm.setStartyearm(req.getParameter("startyearm"));
		mm.setStartmonthm(req.getParameter("startmonthm"));
		mm.setStartdaym(req.getParameter("startdaym"));
		mm.setEndyearm(req.getParameter("enddaym"));
		mm.setEndmonthm(req.getParameter("endmonthm"));
		mm.setEnddaym(req.getParameter("enddaym"));
		mm.setReason(req.getParameter("reason"));
		mm.setApk(apk);
		mm.setPk(pk);
		
		if(service.getMilitary(mm) == null) {
			service.insertMilitary(mm);
		}
		else {
			service.updateMilitary(mm);
		}
		
		
		
		OverSea os = new OverSea();
		os.setNation1(req.getParameter("nation1"));
		os.setAgency1(req.getParameter("agency1"));
		os.setStartyear1(req.getParameter("startyear1"));
		os.setStartmonth1(req.getParameter("startmonth1"));
		os.setStartday1(req.getParameter("startday1"));
		os.setContents1(req.getParameter("contents1"));
		os.setNation2(req.getParameter("nation2"));
		os.setAgency2(req.getParameter("agency2"));
		os.setStartyear2(req.getParameter("startyear2"));
		os.setStartmonth2(req.getParameter("startmonth2"));
		os.setStartday2(req.getParameter("startday2"));
		os.setContents2(req.getParameter("contents2"));
		os.setNation3(req.getParameter("nation3"));
		os.setAgency3(req.getParameter("agency3"));
		os.setStartyear3(req.getParameter("startyear3"));
		os.setStartmonth3(req.getParameter("startmonth3"));
		os.setStartday3(req.getParameter("startday3"));
		os.setContents3(req.getParameter("contents3"));
		os.setApk(apk);
		os.setPk(pk);
		
		if(service.getOverSea(os) == null) {
			service.insertOverSea(os);
		}
		else {
			service.updateOverSea(os);
		}
		
		
		
		Academic aca = new Academic();
		aca.setHighyear(req.getParameter("highyear"));
		aca.setHighmonth(req.getParameter("highmonth"));
		aca.setHighschool(req.getParameter("highschool"));
		aca.setHigharea(req.getParameter("higharea"));
		aca.setCollegeyear(req.getParameter("collegeyear"));
		aca.setCollegemonth(req.getParameter("collegemonth"));
		aca.setCollegegraduateYN(req.getParameter("collegegraduateYN"));
		aca.setCollegecode(req.getParameter("collegecode"));
		aca.setCollegename(req.getParameter("collegename"));
		aca.setCollegedepartcode(req.getParameter("collegedepartcode"));
		aca.setCollegedepartname(req.getParameter("collegedepartname"));
		aca.setCollegedepart(req.getParameter("collegedepar"));
		aca.setCollegedaynight(req.getParameter("collegedaynight"));
		aca.setCollegearea(req.getParameter("collegearea"));
		aca.setCollegescore(req.getParameter("collegescore"));
		aca.setCollegescorevalue(req.getParameter("collegescorevalue"));
		aca.setUnivyear(req.getParameter("univyear"));
		aca.setUnivmonth(req.getParameter("univmonth"));
		aca.setUnivgraduateyear(req.getParameter("univergraduateyear"));
		aca.setUnivgraduatemonth(req.getParameter("univgraduatemonth"));
		aca.setUnivgraduateYN(req.getParameter("univgraduateYN"));
		aca.setUnivname(req.getParameter("univname"));
		aca.setUnivdepartname(req.getParameter("univdepartname"));
		aca.setUnivdaynight(req.getParameter("univdaynight"));
		aca.setUnivscore(req.getParameter("univscore"));
		aca.setUnivscorevalue(req.getParameter("univscorevalue"));
		aca.setTransyear(req.getParameter("transyear"));
		aca.setTransmonth(req.getParameter("transmonth"));
		aca.setTransgraduateyear(req.getParameter("transergraduateyear"));
		aca.setTransgraduatemonth(req.getParameter("transgraduatemonth"));
		aca.setTransgraduateYN(req.getParameter("transgraduateYN"));
		aca.setTransname(req.getParameter("transname"));
		aca.setTransdepartname(req.getParameter("transdepartname"));
		aca.setTransdaynight(req.getParameter("transdaynight"));
		aca.setTransscore(req.getParameter("transscore"));
		aca.setTransscorevalue(req.getParameter("transscorevalue"));
		aca.setMasteryear(req.getParameter("masteryear"));
		aca.setMastermonth(req.getParameter("mastermonth"));
		aca.setMastergraduateyear(req.getParameter("masterergraduateyear"));
		aca.setMastergraduatemonth(req.getParameter("mastergraduatemonth"));
		aca.setMastergraduateYN(req.getParameter("mastergraduateYN"));
		aca.setMastername(req.getParameter("mastername"));
		aca.setMasterdepartname(req.getParameter("masterdepartname"));
		aca.setMasterdaynight(req.getParameter("masterdaynight"));
		aca.setMasterscore(req.getParameter("masterscore"));
		aca.setMasterscorevalue(req.getParameter("masterscorevalue"));
		aca.setDoctoryear(req.getParameter("doctoryear"));
		aca.setDoctormonth(req.getParameter("doctormonth"));
		aca.setDoctorgraduateyear(req.getParameter("doctorergraduateyear"));
		aca.setDoctorgraduatemonth(req.getParameter("doctorgraduatemonth"));
		aca.setDoctorgraduateYN(req.getParameter("doctorgraduateYN"));
		aca.setDoctorname(req.getParameter("doctorname"));
		aca.setDoctordepartname(req.getParameter("doctordepartname"));
		aca.setDoctordaynight(req.getParameter("doctordaynight"));
		aca.setDoctorscore(req.getParameter("doctorscore"));
		aca.setDoctorscorevalue(req.getParameter("doctorscorevalue"));
		aca.setApk(apk);
		aca.setPk(pk);
		
		if(service.getAcademic(aca) == null) {
			service.insertAcademic(aca);
		}
		else {
			service.updateAcademic(aca);
		}
		
		
		model.addAttribute("apk",map);
		model.addAttribute("pk",map);
		
		
		return "/Admin/regmake/reg_3";
	}
	
	@RequestMapping(value = "/Admin/regmake/reg_confirm")
	public String reg_confirm(HttpServletRequest req, Model model, MultipartFile self7) throws Exception {
		
		String apkfk = req.getParameter("apk");
		String pkfk = req.getParameter("pk");
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("pk", pkfk);
		
		System.out.println(apkfk);
		System.out.println(pkfk);
		
		int apk = Integer.parseInt(apkfk);
		int pk = Integer.parseInt(pkfk);
		
		Self self= new Self();
		if (self7.getOriginalFilename() != "") {
			FileUtils ut = new FileUtils();
			String fileName = ut.uploadFile(self7.getOriginalFilename(), self7.getBytes());
			self.setSelf7(fileName);
			System.out.println("fileName : " + fileName);
		}
		self.setSelf1(req.getParameter("self1"));
		self.setSelf2(req.getParameter("self2"));
		self.setSelf3(req.getParameter("self3"));
		self.setSelf4(req.getParameter("self4"));
		self.setSelf5(req.getParameter("self5"));
		self.setSelf6(req.getParameter("self6"));
		self.setApk(apk);
		self.setPk(pk);
		
		if(service.getSelf(self) == null) {
			service.insertSelf(self);
		}
		else {
			service.updateSelf(self);
		}
		
		
	
		Academic acam = new Academic();
		acam.setPk(pk);
		Academic acam2 = service.getAcademic(acam);
		CareerPartModel cp = new CareerPartModel();
		cp.setPk(pk);
		CareerPartModel cp2 = service.getCareerPart(cp);	
		Family fm = new Family();
		fm.setPk(pk);
		Family fm2 = service.getFamily(fm);
		LanguageTest langt = new LanguageTest();
		langt.setPk(pk);
		LanguageTest langt2 = service.getLanguageTest(langt);
		LiecenseModel lm = new LiecenseModel();
		lm.setPk(pk);
		LiecenseModel lm2 = service.getLiecense(lm);
		Military mm = new Military();
		mm.setPk(pk);
		Military mm2 = service.getMilitary(mm);
		OverSea ovs = new OverSea();
		ovs.setPk(pk);
		OverSea ovs2 = service.getOverSea(ovs);
		RegMakeModel regmm = new RegMakeModel();
		regmm.setPk(pk);
		RegMakeModel regmm_2 = service.getRegMake(regmm);
		RegMakeModel2 regmm2 = new RegMakeModel2();
		regmm2.setPk(pk);
		RegMakeModel2 regmm2_2 = service.getRegMake2(regmm2);
		Self self1= new Self();
		self1 = service.getSelf(self);
		
		model.addAttribute("pk",map);
		model.addAttribute("acam", acam2);
		model.addAttribute("cp", cp2);		
		model.addAttribute("fm", fm2);
		model.addAttribute("langt", langt2);
		model.addAttribute("lm", lm2);
		model.addAttribute("mm", mm2);
		model.addAttribute("ovs", ovs2);
		model.addAttribute("self1", self1);
		model.addAttribute("regmm", regmm_2);
		model.addAttribute("regmm2", regmm2_2);
		
	//	System.out.println(acam.getPk());
		
		
		return "/Admin/regmake/reg_confirm";
	}
	
	@RequestMapping(value = "/Admin/regmake/save2")
	public String save2(HttpServletRequest req, Model model, MultipartFile self7) throws Exception {
		
		String apkfk = req.getParameter("apk");
		String pkfk = req.getParameter("pk");
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("pk", pkfk);
		map.put("apk", apkfk);
		
		System.out.println(apkfk);
		System.out.println(pkfk);
		
		int apk = Integer.parseInt(apkfk);
		int pk = Integer.parseInt(pkfk);
		
		Self self= new Self();
		if (self7.getOriginalFilename() != "") {
			FileUtils ut = new FileUtils();
			String fileName = ut.uploadFile(self7.getOriginalFilename(), self7.getBytes());
			self.setSelf7(fileName);
			System.out.println("fileName : " + fileName);
		}
		self.setSelf1(req.getParameter("self1"));
		self.setSelf2(req.getParameter("self2"));
		self.setSelf3(req.getParameter("self3"));
		self.setSelf4(req.getParameter("self4"));
		self.setSelf5(req.getParameter("self5"));
		self.setSelf6(req.getParameter("self6"));
		self.setApk(apk);
		self.setPk(pk);
		
		if(service.getSelf(self) == null) {
			service.insertSelf(self);
		}
		else {
			service.updateSelf(self);
		}
		
		model.addAttribute("pk",map);
		model.addAttribute("apk",map);
		model.addAttribute("self", self);
		
		return "/Admin/regmake/reg_3";
	}
	
	@RequestMapping(value = "/Admin/regmake/addsearch")
	public String addsearch(HttpServletRequest req, Model model) {
		
		ArrayList<Address> add = (ArrayList<Address>)service.getAllAddress();
		model.addAttribute("list", add);
		
		return "/regmake/addsearch";
	}
	
	@RequestMapping(value = "regmake/thank")
	public String thank(HttpServletRequest req, Model model) {
		
		return "/Admin//regmake/thank";
	}
	
	@RequestMapping(value = "/Admin/regmake/modify")
	public String modify(HttpServletRequest req, Model model ) {
		int pk =Integer.parseInt(req.getParameter("pk"));
		int apk =Integer.parseInt(req.getParameter("apk"));
		
		RegMakeModel regmm_s = new RegMakeModel();
		RegMakeModel2 regmm2_s = new RegMakeModel2();
		RegMakeModel regmm = new RegMakeModel();
		RegMakeModel2 regmm2 = new RegMakeModel2();
		EmployModel empmd = new EmployModel();
		empmd.setPk(apk);
		
		regmm_s.setPk(pk);
		regmm2_s.setPk(pk);
		regmm = service.getRegMake(regmm_s);
		regmm2 = service.getRegMake2(regmm2_s);
		
		EmployModel em = service.getEmploy(empmd);
		String title = em.getTitle();
		String name = regmm.getName();
		String birthyear = regmm2.getBirthyear();
		String birthmonth = regmm2.getBirthmonth();
		String birthday = regmm2.getBirthday();
		String email =regmm.getEmail();
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("title",title);
		map.put("apk",apk);
		map.put("name", name);
		map.put("birthyear", birthyear);
		map.put("birthmonth", birthmonth);
		map.put("birthday", birthday);
		map.put("email", email);
		map.put("pk", pk);
		
		model.addAttribute("pk",map);
		model.addAttribute("name",map);
		model.addAttribute("birthyear",map);
		model.addAttribute("birthmonth",map);
		model.addAttribute("birthday",map);
		model.addAttribute("email",map);
		model.addAttribute("title",map);
		model.addAttribute("apk",map);
		
		return "/Admin/regmake/reg_2";
	}
	
	@RequestMapping(value = "/Admin/regmake/search")
	public String serch(HttpServletRequest req, Model model) {
		
		String search = req.getParameter("addsearch");
		Address address = new Address();
		address.setsearch(search);
		
		ArrayList<Address> addsearch = (ArrayList<Address>)service.AddSearch(address);
		model.addAttribute("list", addsearch);
		
		return "/Admin/regmake/addsearch";
	}
	
	@RequestMapping(value = "/Admin/regmake/schoolsearch")
	public String schoolsearch(HttpServletRequest req, Model model) {
		
		ArrayList<School> school = (ArrayList<School>)service.getAllSchool();
		model.addAttribute("school", school);
		
		return "/Admin/regmake/school";
	}
	
	@RequestMapping(value = "/Admin/regmake/searchschool")
	public String serchschool(HttpServletRequest req, Model model) {
		
		String search = req.getParameter("schoolsearch");
		School school = new School();
		school.setSchoolsearch(search);
		
		ArrayList<School> schoolsearch = (ArrayList<School>)service.SchoolSearch(school);
		model.addAttribute("school", schoolsearch);
		
		return "/Admin/regmake/school";
	}
	
	@RequestMapping(value = "/Admin/regmake/delall")
	public String delall(HttpServletRequest req, Model model) throws SQLException {

		String fkpk = req.getParameter("pk");
		int pk = Integer.parseInt(fkpk);
		
		System.out.println(pk);
		
		RegMakeModel regmm = new RegMakeModel();
		RegMakeModel2 regmm2 = new RegMakeModel2();
		
		regmm.setPk(pk);
		regmm2.setPk(pk);
		service.RegMakeModelDel(regmm);
		service.RegMakeModel2Del(regmm2);
		
		return "/Admin/regmake/close";
	}
	
	@RequestMapping(value = "/Admin/regmake/delall2")
	public String delall2(HttpServletRequest req, Model model) throws SQLException {

		String fkpk = req.getParameter("pk");
		int pk = Integer.parseInt(fkpk);
		
		System.out.println(pk);
		
		RegMakeModel regmm = new RegMakeModel();
		RegMakeModel2 regmm2 = new RegMakeModel2();
		Academic aca = new Academic();
		CareerPartModel cpm = new CareerPartModel();
		Family fm = new Family();
		LanguageTest langt = new LanguageTest();
		LiecenseModel lm = new LiecenseModel();
		Military mm = new Military();
		OverSea ovs = new OverSea();
		
		
		regmm.setPk(pk);
		regmm2.setPk(pk);
		aca.setPk(pk);
		cpm.setPk(pk);
		fm.setPk(pk);
		langt.setPk(pk);
		lm.setPk(pk);
		mm.setPk(pk);
		ovs.setPk(pk);
		service.RegMakeModelDel(regmm);
		service.RegMakeModel2Del(regmm2);
		service.AcademicDel(aca);
		service.CareerPartDel(cpm);
		service.FamilyDel(fm);
		service.LanguageTestDel(langt);
		service.LiecenseDel(lm);
		service.MilitaryDel(mm);
		service.OverSeaDel(ovs);
		
		return "/Admin/regmake/close";
	}

	@RequestMapping(value = "/Admin/regmake/save")
	public String save(HttpServletRequest req, Model model, MultipartFile pic) throws Exception {
		Map<String, Object> map = new HashMap<String,Object>();
		String apkfk = req.getParameter("apk");
		String pkfk = req.getParameter("pk");
		map.put("apk",apkfk);
		map.put("pk", pkfk);
		
		int apk = Integer.parseInt(apkfk);
		int pk	= Integer.parseInt(pkfk);
		
		System.out.println(req.getParameter("china"));
		
		
		RegMakeModel regmm = new RegMakeModel();
		
		if (pic.getOriginalFilename() != "") {
			FileUtils ut = new FileUtils();
			String fileName = ut.uploadFile(pic.getOriginalFilename(), pic.getBytes());
			regmm.setPic(fileName);
			System.out.println("fileName : " + fileName);
		}
		
		
		regmm.setPk(pk);
		regmm.setChina(req.getParameter("china"));
		regmm.setEng(req.getParameter("eng"));
		regmm.setBohunYN(req.getParameter("bohunYN"));
		regmm.setBohunnum(req.getParameter("bohunnum"));
		regmm.setDisableYN(req.getParameter("disableYN"));
		regmm.setDisablenum(req.getParameter("disablenum"));
		regmm.setMarry(req.getParameter("marry"));
		regmm.setHp(req.getParameter("hp"));
		regmm.setPhone(req.getParameter("phone"));
		regmm.setAddress(req.getParameter("address"));
		regmm.setAddressnum(req.getParameter("addressnum"));
		regmm.setRestaddress(req.getParameter("restaddress"));
	//	regmm.setPic(req.getParameter("pic"));
		service.updateRegMake(regmm);
		
		RegMakeModel2 regmm2 = new RegMakeModel2();
		regmm2.setBirthdetail(req.getParameter("birthdetail"));
		regmm2.setHobby(req.getParameter("hobby"));
		regmm2.setFaith(req.getParameter("faith"));
		regmm2.setHopework(req.getParameter("hopework"));
		regmm2.setHopeincome(req.getParameter("hopeincome"));
		regmm2.setHeight(req.getParameter("height"));
		regmm2.setWeight(req.getParameter("weight"));
		regmm2.setNowaddress(req.getParameter("nowaddress"));
		regmm2.setNowaddressnum(req.getParameter("nowaddressnum"));
		regmm2.setNowrestaddress(req.getParameter("nowrestaddress"));
		regmm2.setPk(pk);
		service.updateRegMake2(regmm2);
		
		
		
		CareerPartModel cpm = new CareerPartModel();
		cpm.setCompany1(req.getParameter("company1"));
		cpm.setDepart1(req.getParameter("depart1"));
		cpm.setWork1(req.getParameter("work1"));
		cpm.setLevel1(req.getParameter("level1"));
		cpm.setJoinyear1(req.getParameter("joinyear1"));
		cpm.setJoinmonth1(req.getParameter("joinmonth1"));
		cpm.setResignyear1(req.getParameter("resignyear1"));
		cpm.setResignmonth1(req.getParameter("resignmonth1"));
		cpm.setIncome1(req.getParameter("incom1"));
		cpm.setCompany2(req.getParameter("company2"));
		cpm.setDepart2(req.getParameter("depart2"));
		cpm.setWork2(req.getParameter("work2"));
		cpm.setLevel2(req.getParameter("level2"));
		cpm.setJoinyear2(req.getParameter("joinyear2"));
		cpm.setJoinmonth2(req.getParameter("joinmonth2"));
		cpm.setResignyear2(req.getParameter("resignyear2"));
		cpm.setResignmonth2(req.getParameter("resignmonth2"));
		cpm.setIncome2(req.getParameter("incom2"));
		cpm.setApk(apk);
		cpm.setPk(pk);
		
		if(service.getCareerPart(cpm) == null) {
			service.insertCareerPart(cpm);
		}
		else {
			service.updateCareerPart(cpm);
		}
		
		
		Family fm = new Family();
		fm.setFamily1(req.getParameter("family1"));
		fm.setName1(req.getParameter("name1"));
		fm.setAge1(req.getParameter("age1"));
		fm.setEducation1(req.getParameter("education1"));
		fm.setJob1(req.getParameter("job1"));
		fm.setLive1(req.getParameter("level1"));
		fm.setFamily2(req.getParameter("family2"));
		fm.setName2(req.getParameter("name2"));
		fm.setAge2(req.getParameter("age2"));
		fm.setEducation2(req.getParameter("education2"));
		fm.setJob2(req.getParameter("job2"));
		fm.setLive2(req.getParameter("level2"));
		fm.setFamily3(req.getParameter("family3"));
		fm.setName3(req.getParameter("name3"));
		fm.setAge3(req.getParameter("age3"));
		fm.setEducation3(req.getParameter("education3"));
		fm.setJob3(req.getParameter("job3"));
		fm.setLive3(req.getParameter("level3"));
		fm.setFamily4(req.getParameter("family4"));
		fm.setName4(req.getParameter("name4"));
		fm.setAge4(req.getParameter("age4"));
		fm.setEducation4(req.getParameter("education4"));
		fm.setJob4(req.getParameter("job4"));
		fm.setLive4(req.getParameter("level4"));
		fm.setApk(apk);
		fm.setPk(pk);
		
		if(service.getFamily(fm) == null) {
			service.insertFamily(fm);
		}
		else {
			service.updateFamily(fm);
		}
		
		
		LanguageTest langt = new LanguageTest();
		langt.setLanguage1(req.getParameter("language1"));
		langt.setTestname1(req.getParameter("testname1"));
		langt.setTestyear1(req.getParameter("testyear1"));
		langt.setTestmonth1(req.getParameter("testmonth1"));
		langt.setTestday1(req.getParameter("testday1"));
		langt.setTestbbyear1(req.getParameter("testbbyear1"));
		langt.setTestbbmonth1(req.getParameter("testbbmonth1"));
		langt.setTestbbday1(req.getParameter("testbbday1"));
		langt.setLevel1(req.getParameter("level1"));
		langt.setLanguage2(req.getParameter("language2"));
		langt.setTestname2(req.getParameter("testname2"));
		langt.setTestyear2(req.getParameter("testyear2"));
		langt.setTestmonth2(req.getParameter("testmonth2"));
		langt.setTestday2(req.getParameter("testday2"));
		langt.setTestbbyear2(req.getParameter("testbbyear2"));
		langt.setTestbbmonth2(req.getParameter("testbbmonth2"));
		langt.setTestbbday2(req.getParameter("testbbday2"));
		langt.setLevel2(req.getParameter("level2"));
		langt.setLanguage3(req.getParameter("language3"));
		langt.setTestname3(req.getParameter("testname3"));
		langt.setTestyear3(req.getParameter("testyear3"));
		langt.setTestmonth3(req.getParameter("testmonth3"));
		langt.setTestday3(req.getParameter("testday3"));
		langt.setTestbbyear3(req.getParameter("testbbyear3"));
		langt.setTestbbmonth3(req.getParameter("testbbmonth3"));
		langt.setTestbbday3(req.getParameter("testbbday3"));
		langt.setLevel3(req.getParameter("level3"));
		langt.setLanguage4(req.getParameter("language4"));
		langt.setTestname4(req.getParameter("testname4"));
		langt.setTestyear4(req.getParameter("testyear4"));
		langt.setTestmonth4(req.getParameter("testmonth4"));
		langt.setTestday4(req.getParameter("testday4"));
		langt.setTestbbyear4(req.getParameter("testbbyear4"));
		langt.setTestbbmonth4(req.getParameter("testbbmonth4"));
		langt.setTestbbday4(req.getParameter("testbbday4"));
		langt.setLevel4(req.getParameter("level4"));
		langt.setLanguage5(req.getParameter("language5"));
		langt.setTestname5(req.getParameter("testname5"));
		langt.setTestyear5(req.getParameter("testyear5"));
		langt.setTestmonth5(req.getParameter("testmonth5"));
		langt.setTestday5(req.getParameter("testday5"));
		langt.setTestbbyear5(req.getParameter("testbbyear5"));
		langt.setTestbbmonth5(req.getParameter("testbbmonth5"));
		langt.setTestbbday5(req.getParameter("testbbday5"));
		langt.setLevel5(req.getParameter("level5"));
		langt.setTestscore1(req.getParameter("testscore1"));
		langt.setTestscore2(req.getParameter("testscore2"));
		langt.setTestscore3(req.getParameter("testscore3"));
		langt.setTestscore4(req.getParameter("testscore4"));
		langt.setTestscore5(req.getParameter("testscore5"));
		langt.setApk(apk);
		langt.setPk(pk);
		
		if(service.getLanguageTest(langt) == null) {
			service.insertLanguageTest(langt);
		}
		else {
			service.updateLanguageTest(langt);
		}
		
		

		LiecenseModel lcm = new LiecenseModel();
		lcm.setLiecensename1(req.getParameter("liecensename1"));
		lcm.setLiecenseyear1(req.getParameter("liecenseyear1"));
		lcm.setLiecensemonth1(req.getParameter("liecensemonth1"));
		lcm.setLiecenseday1(req.getParameter("liecenseday1"));
		lcm.setLiecenseori1(req.getParameter("liecenseori1"));
		lcm.setLiecensecode1(req.getParameter("liecensecode1"));
		lcm.setLiecensename2(req.getParameter("liecensename2"));
		lcm.setLiecenseyear2(req.getParameter("liecenseyear2"));
		lcm.setLiecensemonth2(req.getParameter("liecensemonth2"));
		lcm.setLiecenseday2(req.getParameter("liecenseday2"));
		lcm.setLiecenseori2(req.getParameter("liecenseori2"));
		lcm.setLiecensecode2(req.getParameter("liecensecode2"));
		lcm.setLiecensename3(req.getParameter("liecensename3"));
		lcm.setLiecenseyear3(req.getParameter("liecenseyear3"));
		lcm.setLiecensemonth3(req.getParameter("liecensemonth3"));
		lcm.setLiecenseday3(req.getParameter("liecenseday3"));
		lcm.setLiecenseori3(req.getParameter("liecenseori3"));
		lcm.setLiecensecode3(req.getParameter("liecensecode3"));
		lcm.setLiecensename4(req.getParameter("liecensename4"));
		lcm.setLiecenseyear4(req.getParameter("liecenseyear4"));
		lcm.setLiecensemonth4(req.getParameter("liecensemonth4"));
		lcm.setLiecenseday4(req.getParameter("liecenseday4"));
		lcm.setLiecenseori4(req.getParameter("liecenseori4"));
		lcm.setLiecensecode4(req.getParameter("liecensecode4"));
		lcm.setLiecensename5(req.getParameter("liecensename5"));
		lcm.setLiecenseyear5(req.getParameter("liecenseyear5"));
		lcm.setLiecensemonth5(req.getParameter("liecensemonth5"));
		lcm.setLiecenseday5(req.getParameter("liecenseday5"));
		lcm.setLiecenseori5(req.getParameter("liecenseori5"));
		lcm.setLiecensecode5(req.getParameter("liecensecode5"));
		lcm.setApk(apk);
		lcm.setPk(pk);
		
		if(service.getLiecense(lcm) == null) {
			service.insertLiecense(lcm);
		}
		else {
			service.updateLiecense(lcm);
		}
		
		
		
		Military mm = new Military();
		mm.setMilitary(req.getParameter("military"));
		mm.setMilitarypart(req.getParameter("militarypart"));
		mm.setMilitaryver(req.getParameter("militaryver"));
		mm.setMilitarylevel(req.getParameter("militarylevel"));
		mm.setStartyearm(req.getParameter("startyearm"));
		mm.setStartmonthm(req.getParameter("startmonthm"));
		mm.setStartdaym(req.getParameter("startdaym"));
		mm.setEndyearm(req.getParameter("enddaym"));
		mm.setEndmonthm(req.getParameter("endmonthm"));
		mm.setEnddaym(req.getParameter("enddaym"));
		mm.setReason(req.getParameter("reason"));
		mm.setApk(apk);
		mm.setPk(pk);
		
		if(service.getMilitary(mm) == null) {
			service.insertMilitary(mm);
		}
		else {
			service.updateMilitary(mm);
		}
		
		
		
		OverSea os = new OverSea();
		os.setNation1(req.getParameter("nation1"));
		os.setAgency1(req.getParameter("agency1"));
		os.setStartyear1(req.getParameter("startyear1"));
		os.setStartmonth1(req.getParameter("startmonth1"));
		os.setStartday1(req.getParameter("startday1"));
		os.setContents1(req.getParameter("contents1"));
		os.setNation2(req.getParameter("nation2"));
		os.setAgency2(req.getParameter("agency2"));
		os.setStartyear2(req.getParameter("startyear2"));
		os.setStartmonth2(req.getParameter("startmonth2"));
		os.setStartday2(req.getParameter("startday2"));
		os.setContents2(req.getParameter("contents2"));
		os.setNation3(req.getParameter("nation3"));
		os.setAgency3(req.getParameter("agency3"));
		os.setStartyear3(req.getParameter("startyear3"));
		os.setStartmonth3(req.getParameter("startmonth3"));
		os.setStartday3(req.getParameter("startday3"));
		os.setContents3(req.getParameter("contents3"));
		os.setApk(apk);
		os.setPk(pk);
		
		if(service.getOverSea(os) == null) {
			service.insertOverSea(os);
		}
		else {
			service.updateOverSea(os);
		}
		
		
		
		Academic aca = new Academic();
		aca.setHighyear(req.getParameter("highyear"));
		aca.setHighmonth(req.getParameter("highmonth"));
		aca.setHighschool(req.getParameter("highschool"));
		aca.setHigharea(req.getParameter("higharea"));
		aca.setCollegeyear(req.getParameter("collegeyear"));
		aca.setCollegemonth(req.getParameter("collegemonth"));
		aca.setCollegegraduateYN(req.getParameter("collegegraduateYN"));
		aca.setCollegecode(req.getParameter("collegecode"));
		aca.setCollegename(req.getParameter("collegename"));
		aca.setCollegedepartcode(req.getParameter("collegedepartcode"));
		aca.setCollegedepartname(req.getParameter("collegedepartname"));
		aca.setCollegedepart(req.getParameter("collegedepar"));
		aca.setCollegedaynight(req.getParameter("collegedaynight"));
		aca.setCollegearea(req.getParameter("collegearea"));
		aca.setCollegescore(req.getParameter("collegescore"));
		aca.setCollegescorevalue(req.getParameter("collegescorevalue"));
		aca.setUnivyear(req.getParameter("univyear"));
		aca.setUnivmonth(req.getParameter("univmonth"));
		aca.setUnivgraduateyear(req.getParameter("univergraduateyear"));
		aca.setUnivgraduatemonth(req.getParameter("univgraduatemonth"));
		aca.setUnivgraduateYN(req.getParameter("univgraduateYN"));
		aca.setUnivname(req.getParameter("univname"));
		aca.setUnivdepartname(req.getParameter("univdepartname"));
		aca.setUnivdaynight(req.getParameter("univdaynight"));
		aca.setUnivscore(req.getParameter("univscore"));
		aca.setUnivscorevalue(req.getParameter("univscorevalue"));
		aca.setTransyear(req.getParameter("transyear"));
		aca.setTransmonth(req.getParameter("transmonth"));
		aca.setTransgraduateyear(req.getParameter("transergraduateyear"));
		aca.setTransgraduatemonth(req.getParameter("transgraduatemonth"));
		aca.setTransgraduateYN(req.getParameter("transgraduateYN"));
		aca.setTransname(req.getParameter("transname"));
		aca.setTransdepartname(req.getParameter("transdepartname"));
		aca.setTransdaynight(req.getParameter("transdaynight"));
		aca.setTransscore(req.getParameter("transscore"));
		aca.setTransscorevalue(req.getParameter("transscorevalue"));
		aca.setMasteryear(req.getParameter("masteryear"));
		aca.setMastermonth(req.getParameter("mastermonth"));
		aca.setMastergraduateyear(req.getParameter("masterergraduateyear"));
		aca.setMastergraduatemonth(req.getParameter("mastergraduatemonth"));
		aca.setMastergraduateYN(req.getParameter("mastergraduateYN"));
		aca.setMastername(req.getParameter("mastername"));
		aca.setMasterdepartname(req.getParameter("masterdepartname"));
		aca.setMasterdaynight(req.getParameter("masterdaynight"));
		aca.setMasterscore(req.getParameter("masterscore"));
		aca.setMasterscorevalue(req.getParameter("masterscorevalue"));
		aca.setDoctoryear(req.getParameter("doctoryear"));
		aca.setDoctormonth(req.getParameter("doctormonth"));
		aca.setDoctorgraduateyear(req.getParameter("doctorergraduateyear"));
		aca.setDoctorgraduatemonth(req.getParameter("doctorgraduatemonth"));
		aca.setDoctorgraduateYN(req.getParameter("doctorgraduateYN"));
		aca.setDoctorname(req.getParameter("doctorname"));
		aca.setDoctordepartname(req.getParameter("doctordepartname"));
		aca.setDoctordaynight(req.getParameter("doctordaynight"));
		aca.setDoctorscore(req.getParameter("doctorscore"));
		aca.setDoctorscorevalue(req.getParameter("doctorscorevalue"));
		aca.setApk(apk);
		aca.setPk(pk);
		
		if(service.getAcademic(aca) == null) {
			service.insertAcademic(aca);
		}
		else {
			service.updateAcademic(aca);
		}
		
		
		
		map.put("name", req.getParameter("name"));
		map.put("birthyear", req.getParameter("birthyear"));
		map.put("birthmonth", req.getParameter("birthmonth"));
		map.put("birthday", req.getParameter("birthday"));
		map.put("email", req.getParameter("email"));
		map.put("title", req.getParameter("title"));
		
		
		model.addAttribute("apk",map);
		model.addAttribute("pk",map);
		model.addAttribute("name",map);
		model.addAttribute("birthyear",map);
		model.addAttribute("birthmonth",map);
		model.addAttribute("birthday",map);
		model.addAttribute("email",map);
		model.addAttribute("title",map);
	
		
		return "/Admin/regmake/reg_2";
	}
	
	@RequestMapping(value = "/Admin/regmake/passercheck")
	public String passercheck() {
	
		return "/Admin/regmake/passercheck";
	}
	
	@RequestMapping(value = "/Admin/foreign/list")
	public String list1(Model model) {
	
		ArrayList<Foreign> foreign= (ArrayList<Foreign>) service.getAllForeign();
		
		model.addAttribute("list", foreign);
		return "/Admin/foreign/list";
	}*/

	@RequestMapping(value = "/Admin/employ/applylist")
	public String list2(Model model) {
		System.out.println("list()");

		ArrayList<ApplyCareer> careers = (ArrayList<ApplyCareer>) service.getAllApplycareer();
		model.addAttribute("careerList", careers);

		ArrayList<ApplyNewComer> newComers = (ArrayList<ApplyNewComer>) service.getAllApplynewcomer();
		model.addAttribute("newComerList", newComers);

		ArrayList<ApplyIntern> interns = (ArrayList<ApplyIntern>) service.getAllApplyintern();
		model.addAttribute("internList", interns);

		return "/Admin/employ/applylist";
	}

	@RequestMapping("/Admin/employ/applyinsert")
	public String list3(HttpServletRequest req, Model model) {
		System.out.println("insert()");

		String name = req.getParameter("apply");
		String name2 = req.getParameter("applycontents");

		System.out.println("name="+name);
		System.out.println(name2);

		ApplyModel apmd = new ApplyModel();

		if (name.equals("career")) {
			apmd.setCareer(req.getParameter("applycontents"));
			service.insertApplycareer(apmd);
		} else if (name.equals("newcomer")) {
			apmd.setNewcomer(req.getParameter("applycontents"));
			service.insertApplynewcomer(apmd);
		} else {
			apmd.setIntern(req.getParameter("applycontents"));
			service.insertApplyintern(apmd);
		}

		ArrayList<ApplyCareer> careers = (ArrayList<ApplyCareer>) service.getAllApplycareer();
		model.addAttribute("careerList", careers);

		ArrayList<ApplyNewComer> newComers = (ArrayList<ApplyNewComer>) service.getAllApplynewcomer();
		model.addAttribute("newComerList", newComers);

		ArrayList<ApplyIntern> interns = (ArrayList<ApplyIntern>) service.getAllApplyintern();
		model.addAttribute("internList", interns);

		return "redirect:/Admin/employ/applylist";
	}
	
	@RequestMapping("/Admin/apply/select")
	public String select(HttpServletRequest req, Model model, RedirectAttributes redirectAttr) {
		
		String applycareer = req.getParameter("career");
		String applyintern = req.getParameter("intern");
		String applynewcomer = req.getParameter("newcomer");

		model.addAttribute("applycareer", applycareer);
		model.addAttribute("applyintern", applyintern);
		model.addAttribute("applynewcomer", applynewcomer);
		
		System.out.println(applycareer);
		System.out.println(applyintern);
		System.out.println(applynewcomer);
		
		Map<String, Object> map = new HashMap<String,Object>(); 
		map.put("career", applycareer); map.put("intern", applyintern);
		map.put("newcomer", applynewcomer); 
		redirectAttr.addFlashAttribute("area", map);

		return "redirect:/Admin/employ/write";
	}
	

	@RequestMapping(value = "/Admin/employ/list")
	public String list12(Model model) {
		System.out.println("list()");

		ArrayList<EmployModel> employs = (ArrayList<EmployModel>) service.getAllEmploy();

		model.addAttribute("list", employs);
		return "/Admin/employ/list";
	}

	@RequestMapping(value = "/Admin/employ/write")
	public String write1(Model model) {
		System.out.println("write()");

		return "/Admin/employ/write_view";
	}

	@RequestMapping("/Admin/employ/insert")
	public String list4(HttpServletRequest req, Model model) {
		System.out.println("insert()");

		EmployModel empmd = new EmployModel();
		empmd.setTitle(req.getParameter("title"));
		empmd.setState(req.getParameter("state"));
		empmd.setExposeYN(req.getParameter("exposeYN"));
		empmd.setPriorityexpose(req.getParameter("priorityexpose"));
		empmd.setStartterm(req.getParameter("startterm"));
		empmd.setEndterm(req.getParameter("endterm"));
		empmd.setApplycareer(req.getParameter("applycareer"));
		empmd.setApplynewcomer(req.getParameter("applynewcomer"));
		empmd.setApplyintern(req.getParameter("applyintern"));
		empmd.setJudgemen(req.getParameter("judgemen"));
		empmd.setContents(req.getParameter("contents"));
		empmd.setPaperpasser(req.getParameter("paperpasser"));
		empmd.setInterviewpasser(req.getParameter("interviewpasser"));
		empmd.setFinalpasser(req.getParameter("finalpsser"));

		service.insertEmploy(empmd);

		ArrayList<EmployModel> employs = (ArrayList<EmployModel>) service.getAllEmploy();

		model.addAttribute("list", employs);
		return "/Admin/employ/list";
	}

	@RequestMapping("/Admin/employ/content_view/{pk}")
	public String content1(@PathVariable int pk, HttpServletRequest req, Model model, RedirectAttributes redirectAttr) {

		ArrayList<EmployModel> emd = (ArrayList<EmployModel>) service.getAllEmploy();
		
		String title = emd.get(pk-1).getTitle();
		String state = emd.get(pk-1).getState();
		String startterm = emd.get(pk-1).getStartterm();
		String endterm = emd.get(pk-1).getEndterm();
		String contents = emd.get(pk-1).getContents();
		
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("title", title);map.put("state", state);
		map.put("startterm", startterm);map.put("endterm", endterm);
		map.put("contents", contents);map.put("pk", pk);
		model.addAttribute("area",map);
		
		System.out.println(title);
		
		return "/Admin/employ/content_view";
	}
	
	@RequestMapping("/Admin/employ/content_view/reg_apply")
	public String reg_apply(HttpServletRequest req, Model model, RedirectAttributes redirectAttr) {
		
		String title = req.getParameter("title");
		String pk = req.getParameter("pk");
		
		System.out.println(title);
		System.out.println(pk);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("pk", pk);
		map.put("title",title);
		redirectAttr.addFlashAttribute("area",map);
		redirectAttr.addFlashAttribute("title", title);
		redirectAttr.addFlashAttribute("pk", pk);
		
		return "redirect:/Admin/regmake/reg_1";
	}
}
