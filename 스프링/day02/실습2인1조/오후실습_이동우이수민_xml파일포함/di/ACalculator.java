package com.acorn.prac2.di;

public class ACalculator implements Calculator{

	@Override
	public int add(int su1, int su2) {
		
		return su1 + su2;
	}

	@Override
	public int minus(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1 - su2;
	}

	@Override
	public int multy(int su1, int su2) {
		// TODO Auto-generated method stub
		return su1 * su2;
	}

	@Override
	public double divide(int su1, int su2) {
		// TODO Auto-generated method stub
		return  (double)su1 / su2;
	}

}
