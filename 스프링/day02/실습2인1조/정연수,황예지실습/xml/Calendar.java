package com.acorn.prac;

import java.util.ArrayList;

public class Calendar {

	private ArrayList<DayCalendar> dayCalendar;

	
	public Calendar(ArrayList<DayCalendar> dayCalendar) {
		super();
		this.dayCalendar = dayCalendar;
	}

	public Calendar() {
		// TODO Auto-generated constructor stub
	}

	
	public void setDayCalendar(ArrayList<DayCalendar> dayCalendar) {
		this.dayCalendar = dayCalendar;
	}

	public ArrayList<DayCalendar> getDayCalendar() {
		return dayCalendar;
	}

	
	
}
