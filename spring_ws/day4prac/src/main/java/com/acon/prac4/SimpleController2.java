package com.acon.prac4;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class SimpleController2 {

	String fileDir="c:\\test\\upload\\";
	
	
	//입력폼 보여주기
	@RequestMapping(value="uploadForm2", method=RequestMethod.GET)
	public String uploadForm() {
		return "upload2";
	}
	
	
	//실제 파일 업로드하기
	@RequestMapping(value="/upload2", method=RequestMethod.POST)
	public String upload(String goodsName, MultipartFile file, Model model) throws IllegalStateException, IOException {
	
		System.out.println(goodsName);
		String fileName = file.getOriginalFilename();
		String fullPath = fileDir + fileName;
		file.transferTo(new File(fullPath));
		
		model.addAttribute("img", fileName);
		
		return "upload2-ok";
	}
	
	// c:\\test\\upload => 파일 업로드
	// aws - s3 버킷 => 파일 업로드
	
	
	
	// 저장된 이미지 보여주기 (서버의 특정자원을 응답하기)
	// images/aaa.jpg  => Path variable 방식
	
	@ResponseBody //이건 view가 아니라 데이터로.. 뭐 뭔소리야? 아무튼 그걸 의미합니다
										 // .* -> . 뒤에 모든 문자열을 의미? 그래서 확장자도 가져와짐
	@RequestMapping(value="/images/{fileName:.*}", method=RequestMethod.GET)
	public Resource image(@PathVariable String fileName) throws MalformedURLException {
		 
		System.out.println(fileName);
		return new UrlResource("file:c:\\test\\upload\\" + fileName);
		
	}
	
	
}
