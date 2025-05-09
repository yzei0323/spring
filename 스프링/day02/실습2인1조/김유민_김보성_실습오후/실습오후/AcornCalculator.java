package com.acorn.day2.실습오후;

public class AcornCalculator implements Calculator {

	@Override
	public int minus(int su1, int su2) {
		System.out.println("에이콘 계산기입니다");
		return ((su1 > su2) ? su1 : su2) - ((su1 < su2) ? su1 : su2);
	}

}
