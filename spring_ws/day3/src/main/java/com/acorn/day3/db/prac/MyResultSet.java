package com.acorn.day3.db.prac;

public class MyResultSet implements MyAutoCloseable{

	@Override
	public void close() {
		System.out.println("ResultSet 객체 close 하기");
	}

}
