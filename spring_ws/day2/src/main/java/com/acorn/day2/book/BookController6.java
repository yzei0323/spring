package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Controller
public class BookController6 {
	
	
	final BookService service;
	

	@RequestMapping(value="/book6", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook2();
		model.addAttribute("book", book);
		
		return "bookView";
	}

	
}


//주입
//생성자주입 (가장 많이 쓰임)
//세터주입
//필드주입