package com.acorn.prac;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberRepository {

	@Autowired
	SqlSession session;
	
	
	//전체조회
	public List<Member> selectAll(){
		return session.selectList("a.selectAll");
		//매퍼정보 a매퍼이름을 가진 것을 찾고 그 안에서 id가 selectAll
	}
	
	public List<Map<String, Object>> selectAll2(){
		return session.selectList("a.selectAll");
		//매퍼정보 a매퍼이름을 가진 것을 찾고 그 안에서 id가 selectAll
	}
	
	public Member selectOne(String id) {
		return session.selectOne("a.selectOne", id);
	}
	
	public int insert(Member m) {
		int result = session.insert("a.insert", m);
		return result;
	}
	
	public int update(Member m) {
		int result = session.update("a.update", m);
		return result;
	}
	
	public int deleteOne(String id) {
		return session.delete("a.deleteOne", id);
	}
	
	public int deleteAll() {
		return session.delete("a.deleteAll");
	}


}
