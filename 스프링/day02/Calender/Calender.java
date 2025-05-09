package com.acorn.day2.inject;

public class Calender {

	String date;
	String work;
	public Calender(String date, String work) {
		super();
		this.date = date;
		this.work = work;
	}
	
	@Override
	public String toString() {
		return "Calender [date=" + date + ", work=" + work + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
}
