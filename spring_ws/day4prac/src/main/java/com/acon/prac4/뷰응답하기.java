package com.acon.prac4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class 뷰응답하기 {

	// 1) String 반환
	@RequestMapping(value="/view1", method=RequestMethod.GET)
	public String view1(Model model) {
		System.out.println("view1");
		model.addAttribute("data", "data~~~~!!!");
		return "viewName";	// => view이름
	}

	
	//
	@RequestMapping(value="/view2", method=RequestMethod.GET)
	public ModelAndView view2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewName2");
		mv.addObject("data", "data~~~~~~~~^^");  //모델정보
		return mv;
	}
	
	
	//
	@RequestMapping(value="/view3", method=RequestMethod.GET)
	public void view3(Model model) {	//매핑이름을 view로 사용함
		model.addAttribute("data", "data~~~~******");
	}
	
	
	
}
