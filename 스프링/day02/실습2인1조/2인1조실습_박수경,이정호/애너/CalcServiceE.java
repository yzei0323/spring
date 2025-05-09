package com.acorn.prac2.애너;

import org.springframework.stereotype.Component;

@Component
public class CalcServiceE {
	
	public int calc(int num1, int num2, String oper) {
		switch(oper) {
		case "plus":
			return num1 + num2;
		case "minus":
			return num1 - num2;
		case "multi":
			return num1 * num2;
		case "divide":
			return num1 / num2;
		default:
			throw new IllegalArgumentException("Invalid operation: " + oper);
		}
	}
	
}
