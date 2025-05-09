package com.acorn.prac2.di;

public class Program {
	
Calculator cal;
	
	
	int addNum(int su1, int su2) {
		int add = cal.add(su1, su2);
		System.out.println(add);
		return add;
	}
	
	int minusNum(int su1, int su2) {
		int minus = cal.minus(su1, su2);
		System.out.println(minus);
		return minus;
	}
	
	int multyNum(int su1, int su2) {
		int multy = cal.multy(su1, su2);
		System.out.println(multy);
		return multy;
	}
	
	double divid(int su1, int su2) {
		double divid = cal.divide(su1, su2);
		System.out.println(divid);
		return divid;
	}

	
	
	public void setCal(Calculator cal) {
		this.cal = cal;
	}

	public Program(Calculator cal) {
		super();
		this.cal = cal;
	}
	
	
	
	

}
