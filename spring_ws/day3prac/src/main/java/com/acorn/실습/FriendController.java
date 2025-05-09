package com.acorn.실습;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class FriendController {

	@Autowired
	FriendRepository repository;
	
	//전체조회
	@RequestMapping(value="/friends", method=RequestMethod.GET)
	public String getFriends() {
		
		List<Friend> list = repository.selectAll();
		System.out.println(list);
		
		return "friendList";
	}
}
