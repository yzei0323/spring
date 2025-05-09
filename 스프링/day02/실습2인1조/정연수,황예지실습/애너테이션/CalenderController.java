package com.acorn.day2.inject;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalenderController {
	
	
	
	@Autowired
	CalenderService service;
	
	@RequestMapping(value="/calender", method=RequestMethod.GET)
	public String calenderForm() {
		return "calender";
		
	}
	
	@RequestMapping(value="/calender", method=RequestMethod.POST)
	public String calender(Model model, @RequestParam(required = false) String order) {
		System.out.println(order);
		
		ArrayList<Calender> list = service.calender();
		// while(true) 무한 루프를 제거합니다.
		if (order.equals("월요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("월요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("화요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("화요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("수요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("수요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("목요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("목요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("금요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("금요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("토요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("토요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else if (order.equals("일요일")) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).date.equals("일요일")) {
		            model.addAttribute("result", list.get(i));
		            break;
		        }
		    }
		} else {
		    System.out.println("오류발생");
		    System.out.println(model);
		    System.out.println(order);
		}

		return "calender";
		
		
			
		
		//return "calender";
		
	}
	

}
