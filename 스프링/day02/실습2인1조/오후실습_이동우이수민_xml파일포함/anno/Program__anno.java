package com.acorn.prac2.calculator.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Program__anno {
	
	@Autowired
	Calculator calculator;
	
	int addNumber(int su1, int su2) {
		int result = calculator.add(su1, su2);
		System.out.println(result);
		return result;
	}
	int minusNumber(int su1, int su2) {
		int result = calculator.minus(su1, su2);
		System.out.println(result);
		return result;
	}
	int multiNumber(int su1, int su2) {
		int result = calculator.multi(su1, su2);
		System.out.println(result);
		return result;
	}
	
	double divideNumber(int su1, int su2) {
		double result = calculator.divide(su1, su2);
		System.out.println(result);
		return result;
	}

	public Program__anno(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public Program__anno() {
		// TODO Auto-generated constructor stub
	}
	
}
