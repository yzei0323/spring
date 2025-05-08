package com.acorn.day2.food;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoodController {
	
	//매서드단위
	@RequestMapping(value="/food", method = RequestMethod.GET)
	public String getFood(Model model) {
		
		//추천음식가져오기
		
		//M 이게 지금 M이ㅔㅇ요 모델
		String food = "라면"; // =>서비스객체로 만들기
		
		model.addAttribute("food", food );
		
		return "foodView";
	}

}
