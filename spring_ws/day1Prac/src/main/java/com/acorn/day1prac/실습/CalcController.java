package com.acorn.day1prac.실습;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

	//1. 두 수를 사용자로부터 입력받아 사칙연산해서 제공하기
	
	//두 수 입력받기? ㅜ
	@RequestMapping(value="/calcForm", method=RequestMethod.GET)
	public String calcForm() {
		return "calc";
	}
	
	@RequestMapping(value="/calc", method=RequestMethod.POST)
	public String calc(
			@RequestParam (required = false) int su1,
			@RequestParam (required = false) int su2){
		
		return "calcResult";
		
	}
	
	
}
