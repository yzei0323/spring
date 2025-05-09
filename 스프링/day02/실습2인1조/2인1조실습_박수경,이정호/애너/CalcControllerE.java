package com.acorn.prac2.애너;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcControllerE {
	CalcServiceE service;
	
	@Autowired
	public CalcControllerE(CalcServiceE service) {
		this.service = service;
	}

	@RequestMapping(value = "/viewCalcE", method = RequestMethod.GET)
	public String viewCalc() {
		return "calcE";
	}
	
	@RequestMapping(value = "/calcE", method = RequestMethod.POST)
	public String resultCalc(int num1, int num2, String oper, Model model) {
		int result = service.calc(num1, num2, oper);
		model.addAttribute("result", result);
		return "calcE";
	}
}
