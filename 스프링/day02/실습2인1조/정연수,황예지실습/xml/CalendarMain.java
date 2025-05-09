package com.acorn.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalendarMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/prac/setting.xml");
	
		CalendarController c = ac.getBean(CalendarController.class);

		c.printInfo();
	}

}
