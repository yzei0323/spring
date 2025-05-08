package com.acorn.day2.food;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FoodService {

	public String getFood() {
		return "신라면"; 
	}
	
	public String getFoodver2() {
		
	//	String[] foods = {"김밥","라면","불고기덮밥","순대국","파스타"};  //배열의 선언과 동시에 초기화 하는 방법
		String[] foods = new String[] {"김밥","라면","불고기덮밥","순대국","파스타"};
		
		//얘는 분리가능
		//String[] foods;
		//foods = new String[]{"김밥","라면","불고기덮밥","순대국","파스타"};
		
		Random r = new Random();
		int index = r.nextInt(foods.length);
		
		String food = foods[index];
		
		return food;
	}
}
