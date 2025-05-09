package com.acorn.prac2.xml;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcControllerX {
	CalcServiceX service;
	
	public CalcControllerX(CalcServiceX service) {
		this.service = service;
	}

	@RequestMapping(value = "/viewCalcX", method = RequestMethod.GET)
	public String viewCalc() {
		return "calcX";
	}
	
	@RequestMapping(value = "/calcX", method = RequestMethod.POST)
	public String resultCalc(int num1, int num2, String oper, Model model) {
		int result = service.calc(num1, num2, oper);
		model.addAttribute("result", result);
		return "calcX";
	}
}
