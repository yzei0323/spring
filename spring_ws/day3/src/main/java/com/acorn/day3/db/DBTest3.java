package com.acorn.day3.db;

import java.sql.*;
 

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DBTest3 {

	public static void main(String[] args) throws SQLException {
		 
		 ApplicationContext  ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/test.xml");
		//ApplicationContext  ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
		DataSource  ds=ac.getBean(DataSource.class);		
		Connection con  = ds.getConnection();		
		String sql = "select * from member_tbl_11";
		PreparedStatement  pst =con.prepareStatement(sql);
		ResultSet rs =pst.executeQuery();
		
		while( rs.next()) {
			System.out.println( rs.getString(1));
			System.out.println( rs.getString(2));
			System.out.println( rs.getString(3));
		}
		
		rs.close();
		pst.close();
		con.close();
		
		
	}

}
