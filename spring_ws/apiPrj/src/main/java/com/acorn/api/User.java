package com.acorn.api;

public class User {
	
	String id;
	String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 
	public User() {
		// TODO Auto-generated constructor stub
	}	
	

}
