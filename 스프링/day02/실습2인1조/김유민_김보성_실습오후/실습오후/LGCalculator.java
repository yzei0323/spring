package com.acorn.day2.실습오후;

import org.springframework.stereotype.Component;

//@Component
public class LGCalculator implements Calculator{

	@Override
	public int minus(int su1, int su2) {
		System.out.println("LG 계산기입니다");
		
		return ((su1>su2)?su1:su2) - ((su1<su2)?su1:su2);
	}
	
	
}
