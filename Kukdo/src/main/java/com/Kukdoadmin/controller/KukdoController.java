package com.Kukdoadmin.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Kukdoadmin.common.FileUtils;
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

@Controller
public class KukdoController {
	Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private KukdoService kukdoService;

	@Resource(name = "uploadPath")
	private String uploadPath;

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;
	

	
	/*@RequestMapping(value = "/fileuploadfail")
	public String fail(HttpServletRequest request, RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("okList", "AA BB CC");

		String referer = request.getHeader("Referer");
		return "redirect:"+ referer;
	}*/
	
	@RequestMapping(value = "/Admin/logoutprocess")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	// 메인
	@RequestMapping(value = "/Admin/openAdminMain")
	public ModelAndView openAdminMain(@ModelAttribute Admin admin, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/AdminMain");

		String userID = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();

		Credential credential = new Credential();
		credential.setUserName(userID);

		Admin ad = kukdoService.adminViewWithCredential(credential);

		session.setAttribute("admin", ad);
		mv.addObject("admin", ad);
		return mv;
	}

	// 메인 베너 관리
	@RequestMapping(value = "/Admin/openbenerview")
	public ModelAndView openMainbeberview(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Main_bener/main_bener_view");

		if (bener.getbSite() == null) {
			Bener tmpBener = (Bener) redirect.getFlashAttributes().get("bener");
			if (tmpBener != null) {
				bener =tmpBener;
			}
		}
		mv.addObject("bener", kukdoService.benerListone(bener));

		return mv;
	}

	@RequestMapping(value = "/Admin/openinsertbener")
	public ModelAndView insertMainbeber(Bener bener, MultipartHttpServletRequest uploadfile,
			RedirectAttributes redirect, HttpServletRequest httpServletRequest) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		List<MultipartFile> multifile = uploadfile.getFiles("uploadfile");
		
		System.out.println("num of file :" + multifile.size());
			for (int i = 0; i < multifile.size(); i++) {
				String genId = UUID.randomUUID().toString();
				String originalfileName = multifile.get(i).getOriginalFilename();
				String saveFileName = genId + "_" + originalfileName;		
				Bener bener1 = kukdoService.benerListone(bener);
				
				if(originalfileName != null && !originalfileName.isEmpty()	&& !originalfileName.equalsIgnoreCase("")) {
					String fileString = originalfileName.substring(originalfileName.lastIndexOf("."));
					
					if (!(fileString.equalsIgnoreCase(".jpg") || 
						fileString.equalsIgnoreCase(".gif") || 
						fileString.equalsIgnoreCase(".jpeg") ||
						fileString.equalsIgnoreCase(".png"))) {
						mv.addObject("uploadfail");
						return mv;
					}
					if(i == 0) {
						String filePath0 = uploadPath + ";" + bener1.getbImage1(); 
						File file = new File(filePath0);
						  if(file.exists() == true) file.delete();
						bener.setbImage1(saveFileName);
						bener.setbImageo1(originalfileName);
						kukdoService.insertBener1(bener);
					}
					if(i == 1) {
						String filePath1 = uploadPath + ";" + bener1.getbImage2(); 
						File file = new File(filePath1);
						  if(file.exists() == true) file.delete();
						bener.setbImage2(saveFileName);
						bener.setbImageo2(originalfileName);
						kukdoService.insertBener2(bener);
					}
					if(i == 2) {
						String filePath2 = uploadPath + ";" + bener1.getbImage3(); 
						File file = new File(filePath2);
						  if(file.exists() == true) file.delete();
						bener.setbImage3(saveFileName);
						bener.setbImageo3(originalfileName);
						kukdoService.insertBener3(bener);
					}
					if(i == 3) {
						String filePath3 = uploadPath + ";" + bener1.getbImage4(); 
						File file = new File(filePath3);
						  if(file.exists() == true) file.delete();
						bener.setbImage4(saveFileName);
						bener.setbImageo4(originalfileName);
						kukdoService.insertBener4(bener);
					}
					if(i == 4) {
						String filePath4 = uploadPath + ";" + bener1.getbImage5(); 
						File file = new File(filePath4);
						  if(file.exists() == true) file.delete();
						bener.setbImage5(saveFileName);
						bener.setbImageo5(originalfileName);
						kukdoService.insertBener5(bener);
					}
					if(i == 5) {
						String filePath5 = uploadPath + ";" + bener1.getbImage6(); 
						File file = new File(filePath5);
						  if(file.exists() == true) file.delete();
						bener.setbImage6(saveFileName);
						bener.setbImageo6(originalfileName);
						kukdoService.insertBener6(bener);
					}
					multifile.get(i).transferTo(new File(uploadPath + File.pathSeparator + saveFileName));
				}

		}
			kukdoService.insertBener(bener);

		Bener bener1 = kukdoService.benerListone(bener);

		log.info("new bener " + bener1.getbSite());
		redirect.addFlashAttribute("bener", bener1);

		return mv;
	}
	
	@RequestMapping(value = "/Admin/openbenerdelete1")
	public ModelAndView openMainbeberdelete1(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);
		
		String filePath1 = uploadPath + ";" + bener1.getbImage1(); 
		System.out.println("1" + filePath1);

		File file = new File(filePath1);
		  if(file.exists() == true) file.delete();
		  kukdoService.deleteBener1(bener);
		  
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);
			
			

		return mv;
	}
	@RequestMapping(value = "/Admin/openbenerdelete2")
	public ModelAndView openMainbeberdelete2(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);

		String filePath2 = uploadPath + ";" + bener1.getbImage2(); 
		System.out.println("2" + filePath2);
		File file1 = new File(filePath2);
		  if(file1.exists() == true) file1.delete();
		  kukdoService.deleteBener2(bener);
		  
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);

		return mv;
	}
	@RequestMapping(value = "/Admin/openbenerdelete3")
	public ModelAndView openMainbeberdelete3(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);

		String filePath3 = uploadPath + ";" + bener1.getbImage3();
		System.out.println("3" + filePath3);
		  File file2 = new File(filePath3);
		  if(file2.exists() == true) file2.delete();
		  kukdoService.deleteBener3(bener);
		  
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);

		return mv;
	}
	@RequestMapping(value = "/Admin/openbenerdelete4")
	public ModelAndView openMainbeberdelete4(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);

		String filePath4 = uploadPath + ";" + bener1.getbImage4();
		System.out.println("4" + filePath4);
		  File file3 = new File(filePath4);
		  if(file3.exists() == true) file3.delete();
		  kukdoService.deleteBener4(bener);
		  
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);

		return mv;
	}
	@RequestMapping(value = "/Admin/openbenerdelete5")
	public ModelAndView openMainbeberdelete5(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);
		
		String filePath5 = uploadPath + ";" + bener1.getbImage5();
		System.out.println("5" + filePath5);
		  File file4 = new File(filePath5);
		  if(file4.exists() == true) file4.delete();
		  kukdoService.deleteBener5(bener);
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);
			
		return mv;
	}
	
	@RequestMapping(value = "/Admin/openbenerdelete6")
	public ModelAndView openMainbeberdelete6(Bener bener, RedirectAttributes redirect) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openbenerview");

		Bener bener1 = kukdoService.benerListone(bener);
		String filePath6 = uploadPath + ";" + bener1.getbImage6();
		System.out.println("6" + filePath6);
		  
		  File file5 = new File(filePath6);
		  if(file5.exists() == true) file5.delete();
		  kukdoService.deleteBener6(bener);
		  
		  log.info("new bener " + bener1.getbSite());
			redirect.addFlashAttribute("bener", bener1);

		return mv;
	}
	

	// 팝업 관리
	@RequestMapping(value = "/Admin/openPopuplist")
	public ModelAndView openPopuplist(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Popup/popuplist");

		List<Popup> list = kukdoService.popupList(popup);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPopupwrite")
	public ModelAndView openPopupWrite(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Popup/popup_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openPopupch")
	public ModelAndView openPopupch(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Popup/popup_modify");

		mv.addObject("popup", kukdoService.popupListone(popup));
		return mv;
	}

	@RequestMapping(value = "/Admin/openPopupinsert")
	public ModelAndView openPopupInsert(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPopuplist");

		kukdoService.popupInsert(popup);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPopupmodify")
	public ModelAndView openPopupModify(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPopuplist");

		kukdoService.popupModify(popup);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPopupdelete")
	public ModelAndView openPopupDelete(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPopuplist");

		kukdoService.popupDelete(popup);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPopuplistserch")
	public ModelAndView openPopuplistserch(Popup popup) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Popup/popuplist");

		List<Popup> list = kukdoService.popupListserch(popup);
		mv.addObject("list", list);
		return mv;
	}

	// 전자 공고 관리
	@RequestMapping(value = "/Admin/openEtronoticelist")
	public ModelAndView openEtronotice(Etronotice enotice) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Etronotice/etronotice_list");

		List<Etronotice> list = kukdoService.etronoticelist(enotice);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEtronoticewrite")
	public ModelAndView openEtronoticeview(Etronotice enotice) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Etronotice/etronotice_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openEtronoticech")
	public ModelAndView openEtronoticech(Etronotice enotice) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Etronotice/etronotice_modify");

		mv.addObject("etronotice", kukdoService.etronoticeListone(enotice));

		return mv;
	}

	@RequestMapping(value = "/Admin/openEtronoticeinsert")
	public ModelAndView openEtronoticeinsert(Etronotice enotice, MultipartFile uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEtronoticelist");

		if (uploadfile.getOriginalFilename() != null && !uploadfile.getOriginalFilename().isEmpty() && !uploadfile.getOriginalFilename().equalsIgnoreCase("")) {
			String fileString = uploadfile.getOriginalFilename().substring(uploadfile.getOriginalFilename().lastIndexOf("."));
			if (fileString.equalsIgnoreCase(".exe") || 
					fileString.equalsIgnoreCase(".jsp") || 
					fileString.equalsIgnoreCase(".sql") ||
					fileString.equalsIgnoreCase(".xml") ||
					fileString.equalsIgnoreCase(".html") ||
					fileString.equalsIgnoreCase(".perl") ||
					fileString.equalsIgnoreCase(".shell")) {
					mv.addObject("uploadfail");
//					mv.setViewName("FileUploadFail");
					return mv;
				}
			String fileName = fileUtils.uploadFile(uploadfile.getOriginalFilename(), uploadfile.getBytes());
			enotice.setbFileName(fileName);
			System.out.println("fileName : " + fileName);
		}
		kukdoService.etronoticeinsert(enotice);
		return mv;
	}


	@RequestMapping(value = "/Admin/openEtronoticemodify")
	public ModelAndView openEtronoticeModify(Etronotice enotice, MultipartFile uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEtronoticelist");
		
		Etronotice etronotice = kukdoService.etronoticeListone(enotice);
		String filePath = uploadPath + ";" + etronotice.getbFileName(); 
		System.out.println("filePath" + filePath);
		File file = new File(filePath);
		  
		  if(file.exists() == true) file.delete();

		if (uploadfile.getOriginalFilename() != "") {
			String fileString = uploadfile.getOriginalFilename().substring(uploadfile.getOriginalFilename().lastIndexOf("."));
			if (fileString.equalsIgnoreCase(".exe") || 
					fileString.equalsIgnoreCase(".jsp") || 
					fileString.equalsIgnoreCase(".sql") ||
					fileString.equalsIgnoreCase(".xml") ||
					fileString.equalsIgnoreCase(".html") ||
					fileString.equalsIgnoreCase(".perl") ||
					fileString.equalsIgnoreCase(".shell")) {
				mv.addObject("uploadfail");

				return mv;
				}
			String fileName = fileUtils.uploadFile(uploadfile.getOriginalFilename(), uploadfile.getBytes());
			enotice.setbFileName(fileName);
			System.out.println("fileName : " + fileName);

		}
		kukdoService.etronoticeModify(enotice);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEtronoticedelete")
	public ModelAndView openEtronoticeDelete(@ModelAttribute Etronotice enotice) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEtronoticelist");

		Etronotice etronotice = kukdoService.etronoticeListone(enotice);
		String filePath = uploadPath + ";" + etronotice.getbFileName(); 
		System.out.println("filePath" + filePath);
		File file = new File(filePath);
		  
		  if(file.exists() == true) file.delete();
		  kukdoService.etronoticeDelete(enotice);
		
		return mv;
	}

	@RequestMapping(value = "/Admin/openEtronoticelistserch")
	public ModelAndView openEtronoticelistserch(Etronotice enotice) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Etronotice/etronotice_list");

		List<Etronotice> list = kukdoService.EtronoticeListserch(enotice);
		mv.addObject("list", list);
		return mv;
	}

	// 사업영역 담당자 관리
	@RequestMapping(value = "/Admin/openManagerlist")
	public ModelAndView openmanager(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Manager/manager_list");

		List<Manager> list = kukdoService.managerlist(manager);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openManagerch")
	public ModelAndView openManagerch(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Manager/manager_modify");

		mv.addObject("manager", kukdoService.ManagerListone(manager));

		return mv;
	}

	@RequestMapping(value = "/Admin/openManagerwrite")
	public ModelAndView openManagerwrite(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Manager/manager_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openManagermodify")
	public ModelAndView openManagerModify(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openManagerlist");

		kukdoService.ManagerModify(manager);
		return mv;
	}

	@RequestMapping(value = "/Admin/openManagerdelete")
	public ModelAndView openManagerDelete(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openManagerlist");

		kukdoService.ManagerDelete(manager);
		return mv;
	}

	@RequestMapping(value = "/Admin/openManagerinsert")
	public ModelAndView openManagerinsert(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openManagerlist");

		kukdoService.managerinsert(manager);
		return mv;
	}

	@RequestMapping(value = "/Admin/openManagerlistserch")
	public ModelAndView openManagerlistserch(Manager manager) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Manager/manager_list");

		List<Manager> list = kukdoService.managerListserch(manager);
		mv.addObject("list", list);
		return mv;
	}

	// 외국어 시험 관리
	@RequestMapping(value = "/Admin/openLangtestlist")
	public ModelAndView openlangtest(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/LangTest/Langtest_list");

		List<Langtest> list = kukdoService.langtestselect(langtest);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestch")
	public ModelAndView openLangtestch(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/LangTest/Langtest_modify");

		mv.addObject("langtest", kukdoService.LangtestListone(langtest));

		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestwrite")
	public ModelAndView openlangtestwrite(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/LangTest/Langtest_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestinsert")
	public ModelAndView openlangtestinsert(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openLangtestlist");

		kukdoService.langtestinsert(langtest);
		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestmodify")
	public ModelAndView openLangtestModify(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openLangtestlist");

		kukdoService.LangtestModify(langtest);
		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestdelete")
	public ModelAndView openLangtestDelete(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openLangtestlist");

		kukdoService.LangtestDelete(langtest);
		return mv;
	}

	@RequestMapping(value = "/Admin/openLangtestlistserch")
	public ModelAndView openLangtestlistserch(Langtest langtest) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/LangTest/Langtest_list");

		List<Langtest> list = kukdoService.langtestListserch(langtest);
		mv.addObject("list", list);
		return mv;
	}

	// 모집분야 추가,선택
	@RequestMapping(value = "/Admin/openrecruitment")
	public ModelAndView openrecruitment() throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Recruitment");

		return mv;
	}

	// 자기소개서 항목 관리
	@RequestMapping(value = "/Admin/openselfcontrol")
	public ModelAndView openselfcontrol() throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/self_ctrol");

		return mv;
	}

	// 채용공고 관리
	@RequestMapping(value = "/Admin/openhirelist")
	public ModelAndView openHireList(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Hire/Hire_list");

		List<Hire> list = kukdoService.hireList(hire);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhirewrite")
	public ModelAndView openHireWrite(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Hire/Hire_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openhirech")
	public ModelAndView openHirech(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Hire/Hire_modify");

		mv.addObject("hire", kukdoService.hireListone(hire));
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireinsert")
	public ModelAndView openHireInsert(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhirelist");

		
		String career = hire.getApplycareer();
		String intern = hire.getApplyintern();
		String newcomer = hire.getApplynewcomer();
		if(career != "") {
			hire.setbField("경력");
		}
		if(intern != "") {
			hire.setbField("인턴");
		}
		if(newcomer != "") {
			hire.setbField("신입");
		}
		if(career != "" && intern != "") {
			hire.setbField("경력/인턴");
		}
		if(career != "" && newcomer != "") {
			hire.setbField("경력/신입");
		}
		if(intern != "" && newcomer != "") {
			hire.setbField("인턴/신입");
		}
		if(intern != "" && newcomer != "" && career != "") {
			hire.setbField("경력/인턴/신입");
		}
		
		kukdoService.hireInsert(hire);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhiremodify")
	public ModelAndView openHireModify(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhirelist");

		String career = hire.getApplycareer();
		String intern = hire.getApplyintern();
		String newcomer = hire.getApplynewcomer();
		if(career != "") {
			hire.setbField("경력");
		}
		if(intern != "") {
			hire.setbField("인턴");
		}
		if(newcomer != "") {
			hire.setbField("신입");
		}
		if(career != "" && intern != "") {
			hire.setbField("경력/인턴");
		}
		if(career != "" && newcomer != "") {
			hire.setbField("경력/신입");
		}
		if(intern != "" && newcomer != "") {
			hire.setbField("인턴/신입");
		}
		if(intern != "" && newcomer != "" && career != "") {
			hire.setbField("경력/인턴/신입");
		}
		kukdoService.hireModify(hire);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhiredelete")
	public ModelAndView openHireDelete(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhirelist");

		kukdoService.hireDelete(hire);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhirelistserch")
	public ModelAndView openhirelistserch(Hire hire) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Hire/Hire_list");

		List<Hire> list = kukdoService.hireListserch(hire);
		mv.addObject("list", list);
		return mv;
	}

	// 채용문의관리
	@RequestMapping(value = "/Admin/opencareersanswer")
	public ModelAndView openCareersWrite() throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Career/Careers_answer");

		return mv;
	}

	@RequestMapping(value = "/Admin/opencareerslist")
	public ModelAndView openCareersList() throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Career/Careers_list");

		return mv;
	}

	// 채용FAQ관리
	@RequestMapping(value = "/Admin/openhireFAQlist")
	public ModelAndView openHireFAQList(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/HireFAQ/HireFAQ_list");

		List<HireFAQ> list = kukdoService.hireFAQList(hireFAQ);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQwrite")
	public ModelAndView openHireFAQWrite(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/HireFAQ/HireFAQ_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQch")
	public ModelAndView openHireFAQch(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/HireFAQ/HireFAQ_modify");

		mv.addObject("hireFAQ", kukdoService.hireFAQListone(hireFAQ));
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQinsert")
	public ModelAndView openHireFAQInsert(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhireFAQlist");

		kukdoService.hireFAQInsert(hireFAQ);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQmodify")
	public ModelAndView openHireFAQModify(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhireFAQlist");

		kukdoService.hireFAQModify(hireFAQ);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQdelete")
	public ModelAndView openHireFAQDelete(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openhireFAQlist");

		kukdoService.hireFAQDelete(hireFAQ);
		return mv;
	}

	@RequestMapping(value = "/Admin/openhireFAQlistserch")
	public ModelAndView openhireFAQlistserch(HireFAQ hireFAQ) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/HireFAQ/HireFAQ_list");

		List<HireFAQ> list = kukdoService.hireFAQListserch(hireFAQ);
		mv.addObject("list", list);
		return mv;
	}

	// 뉴스센터 관리
	@RequestMapping(value = "/Admin/openNewslist")
	public ModelAndView openNewsList(News news) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/News/News_list");

		List<News> list = kukdoService.newsList(news);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openNewswrite")
	public ModelAndView openNewsWrite(News news) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/News/News_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openNewsch")
	public ModelAndView openNewsch(News news) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/News/News_modify");

		mv.addObject("news", kukdoService.newsListone(news));
		return mv;
	}

	@RequestMapping(value = "/Admin/openNewsinsert")
	public ModelAndView openNewsInsert(News news, MultipartHttpServletRequest uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openNewslist");
		List<MultipartFile> multifile = uploadfile.getFiles("uploadfile");
		if (multifile.size() == 1 || multifile.get(0).getOriginalFilename().equals("")
				|| multifile.get(0).getOriginalFilename().isEmpty()) {

		} else {
			
			for (int i = 0; i < multifile.size(); i++) {
				String genId = UUID.randomUUID().toString();
				String originalfileName = multifile.get(i).getOriginalFilename();
				String saveFileName = genId + "_" + originalfileName;
				String fileString = originalfileName.substring(originalfileName.lastIndexOf("."));
				if (i == 0) {
					if (!(fileString.equalsIgnoreCase(".jpg") || 
						fileString.equalsIgnoreCase(".gif") || 
						fileString.equalsIgnoreCase(".jpeg") ||
						fileString.equalsIgnoreCase(".png"))) {
							mv.addObject("uploadfail");
							return mv;
						} 
					else
						news.setbFile0(saveFileName);
				}
				if (i == 1) {
					if (fileString.equalsIgnoreCase(".exe") || 
						fileString.equalsIgnoreCase(".jsp") || 
						fileString.equalsIgnoreCase(".sql") ||
						fileString.equalsIgnoreCase(".xml") ||
						fileString.equalsIgnoreCase(".html") ||
						fileString.equalsIgnoreCase(".perl") ||
						fileString.equalsIgnoreCase(".shell")) {
							mv.addObject("uploadfail");
							return mv;
						}
				 else 
					news.setbFile1(saveFileName);			
				}
				multifile.get(i).transferTo(new File(uploadPath + File.pathSeparator + saveFileName));
			}
		}

		kukdoService.newsInsert(news);
		return mv;
	}

	@RequestMapping(value = "/Admin/openNewsmodify")
	public ModelAndView openNewsModify(News news, MultipartHttpServletRequest uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openNewslist");
		
		News etronotice = kukdoService.newsListone(news);
		String filePath1 = uploadPath + ";" + etronotice.getbFile1(); 
		String filePath2 = uploadPath + ";" + etronotice.getbFile2(); 
		
		File file = new File(filePath1);
		  if(file.exists() == true) file.delete();
		  
		File file1 = new File(filePath2);
		  if(file1.exists() == true) file1.delete();

		List<MultipartFile> multifile = uploadfile.getFiles("uploadfile");
		if (multifile.size() == 1 || multifile.get(0).getOriginalFilename().equals("")
				|| multifile.get(0).getOriginalFilename().isEmpty()) {

		} else {
			for (int i = 0; i < multifile.size(); i++) {
				String genId = UUID.randomUUID().toString();
				String originalfileName = multifile.get(i).getOriginalFilename();
				String saveFileName = genId + "_" + originalfileName;
				String fileString = originalfileName.substring(originalfileName.lastIndexOf("."));
				if (i == 0) {
					if (!(fileString.equalsIgnoreCase(".jpg") || 
						fileString.equalsIgnoreCase(".gif") || 
						fileString.equalsIgnoreCase(".jpeg") ||
						fileString.equalsIgnoreCase(".png"))) {
							mv.addObject("uploadfail");
							return mv;
						} 
					else
						news.setbFile0(saveFileName);
				}
				if (i == 1) {
					if (fileString.equalsIgnoreCase(".exe") || 
						fileString.equalsIgnoreCase(".jsp") || 
						fileString.equalsIgnoreCase(".sql") ||
						fileString.equalsIgnoreCase(".xml") ||
						fileString.equalsIgnoreCase(".html") ||
						fileString.equalsIgnoreCase(".perl") ||
						fileString.equalsIgnoreCase(".shell")) {
							mv.addObject("uploadfail");
							return mv;
						}
				 else 
					news.setbFile1(saveFileName);			
				}
				multifile.get(i).transferTo(new File(uploadPath + File.pathSeparator + saveFileName));
			}
		}

		kukdoService.newsModify(news);
		return mv;
	}

	@RequestMapping(value = "/Admin/openNewsdelete")
	public ModelAndView openNewsDelete(News news) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openNewslist");
		
		News etronotice = kukdoService.newsListone(news);
		String filePath1 = uploadPath + ";" + etronotice.getbFile1(); 
		String filePath2 = uploadPath + ";" + etronotice.getbFile2(); 
		
		File file = new File(filePath1);
		  if(file.exists() == true) file.delete();
		  
		File file1 = new File(filePath2);
		  if(file1.exists() == true) file1.delete();

		kukdoService.newsDelete(news);
		return mv;
	}

	@RequestMapping(value = "/Admin/openNewslistserch")
	public ModelAndView openNewslistserch(News news) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/News/News_list");

		List<News> list = kukdoService.NewsListserch(news);
		mv.addObject("list", list);
		return mv;
	}

	// 홍보물 관리
	@RequestMapping(value = "/Admin/openPRlist")
	public ModelAndView openPRList(PR pr) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/PR/PR_list");

		List<PR> list = kukdoService.prList(pr);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPRwrite")
	public ModelAndView openPRWrite(PR pr) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/PR/PR_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openPRch")
	public ModelAndView openPRch(PR pr) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/PR/PR_modify");

		mv.addObject("pr", kukdoService.prListone(pr));
		return mv;
	}

	@RequestMapping(value = "/Admin/openPRinsert")
	public ModelAndView openPRInsert(PR pr, MultipartHttpServletRequest uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPRlist");

		List<MultipartFile> multifile = uploadfile.getFiles("uploadfile");
		if (multifile.size() == 1 || multifile.get(0).getOriginalFilename().equals("")
				|| multifile.get(0).getOriginalFilename().isEmpty()) {

		} else {
			for (int i = 0; i < multifile.size(); i++) {
				String genId = UUID.randomUUID().toString();
				String originalfileName = multifile.get(i).getOriginalFilename();
				String saveFileName = genId + "_" + originalfileName;
				String fileString = originalfileName.substring(originalfileName.lastIndexOf("."));
				if (i == 0) {
					if (!(fileString.equalsIgnoreCase(".jpg") || 
						fileString.equalsIgnoreCase(".gif") || 
						fileString.equalsIgnoreCase(".jpeg") ||
						fileString.equalsIgnoreCase(".png"))) {
							mv.addObject("uploadfail");
							return mv;
						} 
					else
						pr.setbImage(saveFileName);
				}
				if (i == 1) {
					if (fileString.equalsIgnoreCase(".exe") || 
						fileString.equalsIgnoreCase(".jsp") || 
						fileString.equalsIgnoreCase(".sql") ||
						fileString.equalsIgnoreCase(".xml") ||
						fileString.equalsIgnoreCase(".html") ||
						fileString.equalsIgnoreCase(".perl") ||
						fileString.equalsIgnoreCase(".shell")) {
							mv.addObject("uploadfail");
							return mv;
						}
				 else 
					pr.setbFile(saveFileName);			
				}
				multifile.get(i).transferTo(new File(uploadPath + File.pathSeparator + saveFileName));
			}
		}

		kukdoService.prInsert(pr);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPRmodify")
	public ModelAndView openPRModify(PR pr, MultipartHttpServletRequest uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPRlist");
		
		kukdoService.prListone(pr);
		String filePath1 = uploadPath + ";" + pr.getbImage(); 
		String filePath2 = uploadPath + ";" + pr.getbFile(); 

		File file = new File(filePath1);
		  if(file.exists() == true) file.delete();
		  
		File file1 = new File(filePath2);
		  if(file1.exists() == true) file1.delete();

		List<MultipartFile> multifile = uploadfile.getFiles("uploadfile");
		if (multifile.size() == 1 || multifile.get(0).getOriginalFilename().equals("")
				|| multifile.get(0).getOriginalFilename().isEmpty()) {

		} else {
			for (int i = 0; i < multifile.size(); i++) {
				String genId = UUID.randomUUID().toString();
				String originalfileName = multifile.get(i).getOriginalFilename();
				String saveFileName = genId + "_" + originalfileName;
				String fileString = originalfileName.substring(originalfileName.lastIndexOf("."));
				if (i == 0) {
					if (!(fileString.equalsIgnoreCase(".jpg") || 
						fileString.equalsIgnoreCase(".gif") || 
						fileString.equalsIgnoreCase(".jpeg") ||
						fileString.equalsIgnoreCase(".png"))) {
							mv.addObject("uploadfail");
							return mv;
						} 
					else
						pr.setbImage(saveFileName);
				}
				if (i == 1) {
					if (fileString.equalsIgnoreCase(".exe") || 
						fileString.equalsIgnoreCase(".jsp") || 
						fileString.equalsIgnoreCase(".sql") ||
						fileString.equalsIgnoreCase(".xml") ||
						fileString.equalsIgnoreCase(".html") ||
						fileString.equalsIgnoreCase(".perl") ||
						fileString.equalsIgnoreCase(".shell")) {
							mv.addObject("uploadfail");
							return mv;
						}
				 else 
					pr.setbFile(saveFileName);			
				}
				multifile.get(i).transferTo(new File(uploadPath + File.pathSeparator + saveFileName));
			}
		}

		kukdoService.prModify(pr);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPRdelete")
	public ModelAndView openPRDelete(PR pr) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openPRlist");

		kukdoService.prListone(pr);
		String filePath1 = uploadPath + ";" + pr.getbImage(); 
		String filePath2 = uploadPath + ";" + pr.getbFile(); 

		File file = new File(filePath1);
		  if(file.exists() == true) file.delete();
		  
		File file1 = new File(filePath2);
		  if(file1.exists() == true) file1.delete();
		  
		kukdoService.prDelete(pr);
		return mv;
	}

	@RequestMapping(value = "/Admin/openPRlistserch")
	public ModelAndView openPRlistserch(PR pr) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/PR/PR_list");

		List<PR> list = kukdoService.PRListserch(pr);
		mv.addObject("list", list);
		return mv;
	}

	// 국도인터뷰 관리
	@RequestMapping(value = "/Admin/openKdointerviewlist")
	public ModelAndView openKdointerviewList(KdoInterview kdointview) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/KdoInterview/KdoInterview_list");

		List<KdoInterview> list = kukdoService.kdointviewList(kdointview);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewwrite")
	public ModelAndView openKdointerviewWrite(KdoInterview kdointview) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/KdoInterview/KdoInterview_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewch")
	public ModelAndView openKdointerviewch(KdoInterview kdointview) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/KdoInterview/KdoInterview_modify");

		mv.addObject("kdointerview", kukdoService.kdointviewListone(kdointview));
		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewinsert")
	public ModelAndView openKdointerviewInsert(KdoInterview kdointview, MultipartFile uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openKdointerviewlist");

		if (uploadfile.getOriginalFilename() != "") {
			String fileString = uploadfile.getOriginalFilename().substring(uploadfile.getOriginalFilename().lastIndexOf("."));

			if (!(fileString.equalsIgnoreCase(".jpg") || 
					fileString.equalsIgnoreCase(".gif") || 
					fileString.equalsIgnoreCase(".jpeg") ||
					fileString.equalsIgnoreCase(".png"))) {
					mv.addObject("uploadfail");
					return mv;
				}
			String fileName = fileUtils.uploadFile(uploadfile.getOriginalFilename(), uploadfile.getBytes());
			kdointview.setbImage(fileName);
			System.out.println("fileName : " + fileName);
		}

		kukdoService.kdointviewInsert(kdointview);
		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewmodify")
	public ModelAndView openKdointerviewModify(KdoInterview kdointview, MultipartFile uploadfile) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openKdointerviewlist");

		if (uploadfile.getOriginalFilename() != "") {
			String fileString = uploadfile.getOriginalFilename().substring(uploadfile.getOriginalFilename().lastIndexOf("."));

			if (!(fileString.equalsIgnoreCase(".jpg") || 
					fileString.equalsIgnoreCase(".gif") || 
					fileString.equalsIgnoreCase(".jpeg") ||
					fileString.equalsIgnoreCase(".png"))) {
					mv.addObject("uploadfail");
					return mv;
				}			String fileName = fileUtils.uploadFile(uploadfile.getOriginalFilename(), uploadfile.getBytes());
			kdointview.setbImage(fileName);
			System.out.println("fileName : " + fileName);
		}

		kukdoService.kdointviewModify(kdointview);
		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewdelete")
	public ModelAndView openKdointerviewDelete(KdoInterview kdointview) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openKdointerviewlist");

		kukdoService.kdointviewDelete(kdointview);
		return mv;
	}

	@RequestMapping(value = "/Admin/openKdointerviewlistserch")
	public ModelAndView openKdointerviewlistserch(KdoInterview kdointview) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/KdoInterview/KdoInterview_list");

		List<KdoInterview> list = kukdoService.kdointviewListserch(kdointview);
		mv.addObject("list", list);
		return mv;
	}

	// 관리자 관리
	@RequestMapping(value = "/Admin/openAdminlist")
	public ModelAndView openAdminList(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/AdminUser/Admin_list");

		List<Admin> list = kukdoService.adminList(admin);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openAdminwrite")
	public ModelAndView openAdminWrite(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/AdminUser/Admin_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openAdminch")
	public ModelAndView openAdminch(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/AdminUser/Admin_modify");

		mv.addObject("admin", kukdoService.adminListone(admin));
		return mv;
	}

	@RequestMapping(value = "/Admin/openAdminlistinsert")
	public ModelAndView openAdminInsert(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openAdminlist");

		kukdoService.adminInsert(admin);
		return mv;
	}

	@RequestMapping(value = "/Admin/openAdminmodify")
	public ModelAndView openAdminModify(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openAdminlist");

		kukdoService.adminModify(admin);
		return mv;
	}

	@RequestMapping(value = "/Admin/openAdmindelete")
	public ModelAndView openAdminDelete(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openAdminlist");

		kukdoService.adminDelete(admin);
		return mv;
	}

	@RequestMapping(value = "/Admin/openAdminlistserch")
	public ModelAndView openAdminlistserch(Admin admin) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/AdminUser/Admin_list");

		List<Admin> list = kukdoService.adminListserch(admin);
		mv.addObject("list", list);
		return mv;
	}

	// 평가위원 관리
	@RequestMapping(value = "/Admin/openEvaluationlist")
	public ModelAndView openEvaluationList(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Evaluation/Evaluation_list");

		List<Evaluation> list = kukdoService.evaluationList(evaluation);
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEvaluationauthority")
	public ModelAndView openEvaluationauthority(@ModelAttribute Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEvaluationlist");

		System.out.println("enable : " + evaluation.getENABLED());
		System.out.println("id : " + evaluation.getbId());

		if (evaluation.getENABLED() == 0) {
			kukdoService.evaluationRecognition(evaluation);

		} else {
			kukdoService.evaluationDeprivation(evaluation);
		}

		return mv;
	}

	@RequestMapping(value = "/Admin/Evaluationwrite")
	public ModelAndView openEvaluationWrite(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Evaluation/Evaluation_write");

		return mv;
	}

	@RequestMapping(value = "/Admin/openEvaluationch")
	public ModelAndView openEvaluationch(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Evaluation/Evaluation_modify");

		mv.addObject("evaluation", kukdoService.evaluationListone(evaluation));
		return mv;
	}

	@RequestMapping(value = "/Admin/Evaluationinsert")
	public ModelAndView openEvaluationInsert(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/");

		kukdoService.evaluationInsert(evaluation);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEvaluationmodify")
	public ModelAndView openEvaluationModify(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEvaluationlist");

		kukdoService.evaluationModify(evaluation);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEvaluationdelete")
	public ModelAndView openEvaluationDelete(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/Admin/openEvaluationlist");

		kukdoService.evaluationDelete(evaluation);
		return mv;
	}

	@RequestMapping(value = "/Admin/openEvaluationlistserch")
	public ModelAndView openEvaluationlistserch(Evaluation evaluation) throws Exception {
		ModelAndView mv = new ModelAndView("/Admin/Evaluation/Evaluation_list");

		List<Evaluation> list = kukdoService.evaluationListserch(evaluation);
		mv.addObject("list", list);
		return mv;
	}
}
