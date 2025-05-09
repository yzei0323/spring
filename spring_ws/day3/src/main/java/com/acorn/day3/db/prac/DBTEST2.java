package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class DBTEST2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:testdb";
		String user="scott";
		String password="tiger";
		
		//
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		//커넥션 객체를 반환함
		
		
		if( con != null ) System.out.println("db ok");
		//con이 null이 아니면? db연결 ㅇㅇ
		
		
		//sql작성
		String sql = "select * from member_tbl_11";
		//실행할 수 있는.. 객체를..? 
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		
		ArrayList<Member> list = new ArrayList<>();
		//데이터 담을 그릇이 필요하니까는 Member클래스 만들게여~??
		
		
		while(rs.next()) {	//true, false
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
			
			Member m = new Member( rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4) );
			list.add(m);
		}
		
		
		//ArrayList<Member>	
		
		System.out.println("====3번 출력====");
		list.forEach((item)->{System.out.println(item);}); 
		list.forEach(item->System.out.println(item));
		list.forEach(System.out::println);   //매서드 참조 문법: 람다식을 더 줄여서 표현
		
		System.out.println("========");
		
		list.forEach(new Consumer<Member>() {

			@Override
			public void accept(Member t) {
				System.out.println(t);		
			}
		});
		
		
		
	}

}
