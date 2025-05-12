package com.acon.prac4;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController {

	//사용자 입력화면
	@RequestMapping(value="/uploadForm", method=RequestMethod.GET)
	public String uploadForm() {
		return "form";
	}
	
/*
	//사용자 입력처리, 파일업로드 진행
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(@RequestParam String goodsName, @ModelAttribute MultipartFile file) throws IllegalStateException, IOException {
		
		String fileDir = "c:\\test\\upload\\";
		
		System.out.println(goodsName);
		String fileName = file.getOriginalFilename();
		String fullPath = fileDir + fileName;
		file.transferTo(new File(fullPath));
		
		
		return "uploadok";
	}
*/
	
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(@RequestParam String goodsName, @ModelAttribute MultipartFile file) throws IllegalStateException, IOException {
		
		String fileDir = "c:\\test\\upload\\";
		
		System.out.println(goodsName);
		String fileName = file.getOriginalFilename();
		
		//저장할 이름만들기 (겹치지 않는 이름이 필요함)
		String saveName = UUID.randomUUID().toString();
		
		
		//확장자 
		System.out.println(fileName);
		
		int index = fileName.lastIndexOf(".");
		String ext = fileName.substring(index+1);
		System.out.println("확장자:" + ext);
		
		saveName = saveName + "." +ext;
		
		//귀여운이미지.jpg  (원본파일의 이름)
		//jhfdlskehjdksfj.jpg (저장이름)

		String fullPath = fileDir + saveName;
		file.transferTo(new File(fullPath));
		
		
		return "uploadok";
	}
	
	
	
}
