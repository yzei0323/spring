package com.acorn.di.calculator;





 
public class BCalculator  implements Calculator {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println( "B calculator");		
		return su1+ su2;
	}

}
