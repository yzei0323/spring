package com.acorn.day3.db.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTEST1 {

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
		
		while(rs.next()) {	//true, false
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}
		
		
		
		
		//ArrayList<Member>	
		
	}

}
