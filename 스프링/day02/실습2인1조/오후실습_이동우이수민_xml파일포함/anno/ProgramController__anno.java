package com.acorn.prac2.calculator.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProgramController__anno {
	
	@Autowired
	Program__anno p;
	
	//
	@RequestMapping(value="/acornCal_annotation", method =RequestMethod.GET)
	public String addNumber(
			@RequestParam (required = false, defaultValue = "0") int su1, 
			@RequestParam (required = false, defaultValue = "0") int su2, 
			Model model) {
		//p.addNumber(su1, su2);
		model.addAttribute("su1",su1);
		model.addAttribute("su2",su2);
		model.addAttribute("add",p.addNumber(su1, su2));
		model.addAttribute("minus",p.minusNumber(su1, su2));
		model.addAttribute("multi",p.multiNumber(su1, su2));
		model.addAttribute("divide",p.divideNumber(su1, su2));
		
		return "view1";
	}
	
	
}
