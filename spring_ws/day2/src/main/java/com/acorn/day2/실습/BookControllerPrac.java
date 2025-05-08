package com.acorn.day2.실습;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookControllerPrac {
	
	@Autowired
	BookService2 service;

	@RequestMapping(value="/bookPrac", method=RequestMethod.GET)
	public String showBook(Model model) {
		ArrayList<String> book = service.getBook();
		model.addAttribute("book", book);
		
		return "book";
	}
}
