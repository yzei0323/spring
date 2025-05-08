package com.acorn.day2.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = "누가 내 머리에 똥 쌌어?";
		model.addAttribute("book", book);
		return "bookView";
	}
}
