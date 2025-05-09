package com.acorn.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalendarController {

	private Calendar calendar;
	
	
	@Autowired
	public CalendarController(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public CalendarController() {
		// TODO Auto-generated constructor stub
	}
	
//	//세터주입
//	public void setCalendar(Calendar calendar) {
//		this.calendar = calendar;
//	}
	
	public void printInfo() {
		for(DayCalendar d : calendar.getDayCalendar()) {
			System.out.println(d.getDay()+ "요일: "+d.getTodo());
		}
	}
	
	
	
	
}
