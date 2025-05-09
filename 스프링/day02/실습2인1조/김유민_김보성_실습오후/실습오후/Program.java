package com.acorn.day2.실습오후;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Program {
	
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
//	@Autowired
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Program() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void minusNumber( int su1 , int su2) {
		int result = calculator.minus(su1, su2);
		System.out.println("두 수의 차는 "+result + "입니다");
		
	}
	
}
