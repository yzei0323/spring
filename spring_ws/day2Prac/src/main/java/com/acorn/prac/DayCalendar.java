package com.acorn.prac;

public class DayCalendar {

	String day;
	String todo;
	
	public DayCalendar() {
		// TODO Auto-generated constructor stub
	}

	public DayCalendar(String day, String todo) {
		super();
		this.day = day;
		this.todo = todo;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDay() {
		return day;
	}

	public String getTodo() {
		return todo;
	}
	
	
}
