package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(Model model) {
		
		//모델
		String data ="이것이 spring mvc 이다!!";
		
		//모델 저장
		model.addAttribute("data",data);
		
		//뷰 응답
		
		return "hello";//응답문자열이 뷰 이름으로 인식(뷰 이동)
		//WEB-INF/views/hello.jsp => 설정정보에 있음
		
		
	}

}
