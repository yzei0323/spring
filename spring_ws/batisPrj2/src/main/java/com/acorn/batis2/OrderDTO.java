package com.acorn.batis2;

import lombok.Data;

/*
 * 

  
 * 
 */

@Data
public class OrderDTO {
	
	String orderno;  //주문번호
	String userid;   //사용자id
	String name;    //이름
	String tel;
	String price ;//  총주문금액
	
  
}
