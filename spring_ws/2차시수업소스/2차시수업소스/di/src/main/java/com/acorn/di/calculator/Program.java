package com.acorn.di.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 
 
public class Program {	
	//dependency  : 의존성 
	
 
 
	Calculator calculator;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	public Program(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculator =calculator;
	}
	
	
	//세터주입	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void  addNumber(int su1, int su2) {
		int result  = calculator.add(su1, su2);
		System.out.println( " 두 수의 합" + result);		
	}
	 

}
