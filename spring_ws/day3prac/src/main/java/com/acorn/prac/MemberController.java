package com.acorn.prac;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MemberController {

	@Autowired
	MemberRepository repository;
	
	//전체조회
	@RequestMapping(value="/members", method=RequestMethod.GET)
	public String getMembers() {
		
		List<Member> list = repository.selectAll();
		System.out.println(list);
		
		return "memberList";
	}
	
	//전체조회2
	@RequestMapping(value="/members2", method=RequestMethod.GET)
	public String getMembers2() {
			
		List<Map<String, Object> > list = repository.selectAll2();
		System.out.println(list);
			
		return "memberList";
	}
	
	
	//한개조회
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String getMember() {
		
		Member member = repository.selectOne("t9");
		System.out.println(member);
		
		return "memberList";
	}
	
	
	//등록
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insert(@ModelAttribute Member member) {
		
		int result = repository.insert(member);
		System.out.println(result);
		
		return "memberList";
	}
	
	
	//수정
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(@ModelAttribute Member member) {
		
		int result = repository.update(member);
		System.out.println(result);
		
		return "memberList";
	}
	
	
	//한개삭제
	@RequestMapping(value="/deleteOne", method=RequestMethod.GET)
	public String delete(@RequestParam String id) {
		
		int result = repository.deleteOne(id);
		System.out.println(result);
		
		return "memberList";
	}
	
	//전체삭제
	@RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
	public String delete() {

		int result = repository.deleteAll();
		System.out.println(result);

		return "memberList";
	}
	
}
