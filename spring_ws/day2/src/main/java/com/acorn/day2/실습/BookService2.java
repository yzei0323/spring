package com.acorn.day2.실습;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

//책정보 제공
@Component
public class BookService2 {

	public ArrayList<String> getBook(){
		ArrayList<String> book = new ArrayList<String>();
		
		book.add("이거뭔데");
		book.add("이거뭔데");
		book.add("이거뭔데");
		book.add("이거뭔데");
		book.add("이거뭔데");
		book.add("이거뭔데");
		
		return book;
	}
	
}
