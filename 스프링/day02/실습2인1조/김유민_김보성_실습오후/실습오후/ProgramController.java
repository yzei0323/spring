package com.acorn.day2.실습오후;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProgramController {
	
	@Autowired
	Program p;
	
	@RequestMapping(value="/minusCal", method=RequestMethod.GET)
	public String minusNumber(int su1, int su2) {
		p.minusNumber(su1, su2);
		return "minusView";
	}
}
