package com.acon.prac4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 데이터응답하기 {

	@RequestMapping(value="/data1", method=RequestMethod.GET)
	public void data1(HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/plain;charset=utf-8"); 
		String data = "data1 서버가 보낸 데이터";
		resp.setHeader("Content-Length", String.valueOf(data.getBytes().length));
		resp.getWriter().println(data);
		
	}
	
	
	@ResponseBody	//데이터 응답하기
	@RequestMapping(value="/data2", method=RequestMethod.GET, produces="text/plain;charset=utf-8")
	public String data2() {
		String data2 = "data2 서버가 보내는 데이터";
		return data2;
	}
	
//	@ResponseBody
//	ResponseEntity<T>
	@RequestMapping(value="/data22", method=RequestMethod.GET)
	public ResponseEntity<String> data22(){
		String data2 = "data22 서버가 보내는 데이터 response Entity";
		return ResponseEntity.ok()
				.header("Content-Type", "text/plain;charset=utf-8")
				.header("Content-Length", String.valueOf(data2.getBytes().length))
				.body(data2);
	}
	
	
	
	// json 형태 데이터 응답하기
	// java객체, 리스트 => json변환해서 응답하기
	
	
	//고객정보 1개 json 데이터 응답
	@ResponseBody
	@RequestMapping(value="/data3", method=RequestMethod.GET)
	public Member data3() {
		
		Member member = new Member();
		member.setId("acorn01");
		member.setPw("0000");
		member.setName("kim");
		
		
		//java -> json 변환 => 스프링이 대신 해줌
		return member;
	}
	
	
	//고객정보 여러개 json 데이터 응답
	@ResponseBody
	@RequestMapping(value="/data4", method=RequestMethod.GET)
	public List<Member> data4(){
		
		List<Member> list = new ArrayList<>();
		list.add(new Member("acorn02", "1234", "lee"));
		list.add(new Member("acorn03", "1234", "kim"));
		list.add(new Member("acorn04", "1234", "choi"));
		
		return list; 
	}
	
}
