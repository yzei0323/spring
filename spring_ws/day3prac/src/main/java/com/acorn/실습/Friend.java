package com.acorn.실습;

import java.util.Date;
import java.util.Objects;

//NAME     VARCHAR2(10) 
//PWD      VARCHAR2(10) 
//BIRTH    VARCHAR2(4)  

public class Friend {

	private String name;
	private String pwd;
	private String birth;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", pwd=" + pwd + ", birth=" + birth + "]";
	}

	public Friend(String name, String pwd, String birth) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.birth = birth;
	}
	
	
	
}
