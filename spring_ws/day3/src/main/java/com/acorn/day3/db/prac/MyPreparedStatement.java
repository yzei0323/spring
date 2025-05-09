package com.acorn.day3.db.prac;

public class MyPreparedStatement implements MyAutoCloseable{

	@Override
	public void close() {
		System.out.println("PreparedStatement 객체 close하기");
	}

}
