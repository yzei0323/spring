package com.acorn.day1prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CuteImgController {

	//매서드 매핑
	
	@RequestMapping(value ="/cuteImg", method=RequestMethod.GET)
	public String getCuteImg(Model model) {
		String data="aaa.jpg";
		
		model.addAttribute("data", data);
		return "cuteView";
	}
}
