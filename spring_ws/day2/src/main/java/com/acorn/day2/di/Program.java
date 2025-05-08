package com.acorn.day2.di;

public class Program {

	Calculator calculator;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	
	// 외부에서 생성된 계산기 객체를 주입받아서 사용
	
	void addNumber(int su1, int su2) {
		int result = calculator.add(su1, su2);
		System.out.println( result + "입니다" );
	}
	
	//생성자 주입
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	//세터 주입
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
}

