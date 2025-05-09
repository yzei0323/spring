package com.acorn.day2.inject;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class CalenderService {

	public ArrayList<Calender> calender(){
		
		ArrayList<Calender> cal = new ArrayList<>();
		
		cal.add(new Calender("월요일", "산책하기"));
		cal.add(new Calender("화요일", "운동하기"));
		cal.add(new Calender("수요일", "게임하기"));
		cal.add(new Calender("목요일", "공부하기"));
		cal.add(new Calender("금요일", "놀기"));
		cal.add(new Calender("토요일", "외식하기"));
		cal.add(new Calender("일요일", "잠자기"));
		
		return cal;
		
	}
}
