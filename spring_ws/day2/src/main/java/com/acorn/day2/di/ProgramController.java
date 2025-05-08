package com.acorn.day2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProgramController {
	
	@Autowired
	Program p;
	
	//
	@RequestMapping(value="/acornCal", method=RequestMethod.GET)
	public String addNumber(int su1, int su2) {
		p.addNumber(su1, su2);
		return "view1";
	}
}
