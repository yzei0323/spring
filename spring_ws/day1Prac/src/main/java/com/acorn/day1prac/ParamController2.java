package com.acorn.day1prac;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController2 {

	@RequestMapping(value="/checkboxForm", method=RequestMethod.GET)
	public String view() {
		return "checkboxView";
	}
	
	@RequestMapping(value="/paramT1", method=RequestMethod.POST)
	public String checkbox(@RequestParam String[] fruit) {
		
		for (String item: fruit) {
			System.out.println(item);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/paramT2", method=RequestMethod.POST)
	public String checkbox2(HttpServletRequest request) {
		
		String[] list = request.getParameterValues("fruit");
		
		for(String item : list) {
			System.out.println(item);
		}
		
		return "redirect:/";
	}
}
