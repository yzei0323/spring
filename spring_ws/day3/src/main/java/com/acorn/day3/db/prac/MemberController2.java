package com.acorn.day3.db.prac;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController2 {

	@Autowired
	MemberRepository3 repository;
	
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String register( Member member ) {
//					Member 앞에 @RepositoryModel?? 뭐 그런거 생략되어있음 
		int rowCnt = repository.insert(member);
		System.out.println(rowCnt);
		
		return "ok"; //view는 없는게 마즘 걍 쿼리스트링으로
	}
}
