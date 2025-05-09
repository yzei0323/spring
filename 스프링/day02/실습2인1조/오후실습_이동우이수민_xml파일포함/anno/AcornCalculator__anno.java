package com.acorn.prac2.calculator.anno;

import org.springframework.stereotype.Component;

@Component
public class AcornCalculator__anno implements Calculator {

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1+su2;
	}

	@Override
	public int minus(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1-su2;
	}

	@Override
	public int multi(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1*su2;
	}

	@Override
	public double divide(int su1, int su2) {
		// TODO Auto-generated method stub
		return (double)su1/su2;
	}

}
