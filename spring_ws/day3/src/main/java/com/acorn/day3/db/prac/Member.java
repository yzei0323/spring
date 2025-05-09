package com.acorn.day3.db.prac;

import lombok.AllArgsConstructor;
import lombok.Data;

//M_ID       NOT NULL VARCHAR2(5)  
//M_PW                VARCHAR2(5)  
//M_NAME              VARCHAR2(10) 
//M_TEL               VARCHAR2(13) 


//lombok 쓰려면 @Data 걸고 하면 된다 어.. 그래 몬소리야?
@AllArgsConstructor  //아 이거있으면 생성자 소스 안만들어도됨 대박뭐야이거
@Data
public class Member {

	String id;
	String pw;
	String name;
	String tel;	
	
}
