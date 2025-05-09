package com.acorn.batis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )

public class MemberDaoTest2 {
	
	
	@Autowired
	MemberRepository dao;

	
	@Test
	public void test() throws Exception { 
		Member m = new Member();
		m.setId("test02");
		m.setName("김길동");
		m.setPwd("5678");
		dao.insert(  m);
		 
	}

}
