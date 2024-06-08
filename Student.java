package com.itsc.ioc;

public class Student {
	private int id;
	private String name;
	private String email;
	
	// Setter Methods
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter method
	public int getId(int id) {
		return this.id;
	}
	public String getName(String name) {
		return this.name;
	}
	public String getEmail(String email) {
		return this.email;
	}
}
