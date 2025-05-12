package com.acon.prac4;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultiController {

	@RequestMapping(value="uploadFormMulti", method=RequestMethod.GET)
	public String uploadForm() {
		return "multiForm";
	}
	
	
	@RequestMapping(value="/uploadMulti", method=RequestMethod.POST)
	public String upload(@RequestParam String goodsName, MultipartFile[] a) throws IllegalStateException, IOException {
													// a => form 화면에서의 name이름이다
		String dir ="c:\\test\\upload\\";
		
		System.out.println(goodsName);
		for(MultipartFile file : a) {
		
			String fileName = file.getOriginalFilename();
			String fullPath = dir + fileName;
			file.transferTo(new File(fullPath));
			
		}
		
		return "multi-ok";
	}
	
	
}
