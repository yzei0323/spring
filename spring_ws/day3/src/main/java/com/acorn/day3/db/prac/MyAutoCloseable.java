package com.acorn.day3.db.prac;

public interface MyAutoCloseable {
	//MyConnection, MyPreparedStatement, MyResultSet close를 위한 인터페이스
	public void close();
}
