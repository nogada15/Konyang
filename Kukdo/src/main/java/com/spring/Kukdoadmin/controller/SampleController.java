package com.spring.Kukdoadmin.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.Kukdoadmin.service.SampleService;

@Controller
public class SampleController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/openAdminMain.do")
	public ModelAndView openAdminMain() throws Exception{
		ModelAndView mv = new ModelAndView("/AdminMain");
		
		return mv;
	}
	
	@RequestMapping(value="/insertbener.do")
	public ModelAndView insertMainbeber(Map<String, Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/openbenerview.do");
		
		sampleService.insertBener(commandMap);
		
		return mv;
	}
	
	@RequestMapping(value="/openbenerview.do")
	public ModelAndView openMainbeberview() throws Exception{
		ModelAndView mv = new ModelAndView("/main_bener_view");
		return mv;
	}
	
	@RequestMapping(value="/openPopuplist.do")
	public ModelAndView openPopuplist(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/popuplist");
		
		List<Map<String, Object>> list = sampleService.popupList(commandMap);
		mv.addObject("list", list);
		return mv;
	}

}
