package com.acorn.day2.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Setter;

@Controller
public class BookController5 {
	
	
	@Setter(onMethod_ = @Autowired)
	BookService service;

	/*
	  @Autowired
	  public setService(BookService service) {
	  	this.service = service; }
	 */

	@RequestMapping(value="/book5", method=RequestMethod.GET)
	public String getBook(Model model) {
		
		String book = service.getBook2();
		model.addAttribute("book", book);
		
		return "bookView";
	}

	
}
