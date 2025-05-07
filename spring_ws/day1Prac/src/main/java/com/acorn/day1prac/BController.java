package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//Bcontrikller 애너테이션 추가(Controller)\
//메서드단위의 매핑을 지원함

@Controller
public class BController {
	
	//mvc
	//view:매핑의 이름
	//model: Model 객체를 제공함
	@RequestMapping(value="/hi1", method=RequestMethod.GET)
	public void hi1(Model model) {
		model.addAttribute("data", "hi1~~");
	}
	
	//mvc
	//view:반환하는 문자열의 이름
	@RequestMapping(value="/hi2", method=RequestMethod.GET)
	public String hi2(Model model) {
		model.addAttribute("data", "hi2~~");
		return "hi2";
	}
	
	//mvc
	//ModelAndView 객체반환
	@RequestMapping(value="/hi3", method=RequestMethod.GET)
	public ModelAndView hi3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hi3");
		mv.addObject("data", "hi3~~");
		
		return mv;
	}
}
