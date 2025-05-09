package com.acorn.prac2.di;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {

	
	Program pro;

	public CalculatorController(Program pro) {
		super();
		this.pro = pro;
	}



	public void setPro(Program pro) {
		this.pro = pro;
	}



	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String printCalc(int su1, int su2, Model model) {
		model.addAttribute("su1",su1);
		model.addAttribute("su2",su2);
		model.addAttribute("add",pro.addNum(su1, su2));
		model.addAttribute("minus",pro.minusNum(su1, su2));
		model.addAttribute("multi",pro.multyNum(su1, su2));
		model.addAttribute("divide",pro.divid(su1, su2));
		
		
		return "calcView";
		
		
	}
	
	
}
