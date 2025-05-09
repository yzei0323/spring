package com.acorn.실습;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FriendRepository {

	@Autowired
	SqlSession session;


	//전체조회
	public List<Friend> selectAll(){
		return session.selectList("b.selectAll");
	}
	
	
}
