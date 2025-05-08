package com.acorn.day2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/day2/di/setting.xml");
		Program p = ac.getBean(Program.class);
		
		p.addNumber(3, 2);
	}

}
