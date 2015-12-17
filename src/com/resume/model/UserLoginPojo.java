package com.resume.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserLoginPojo {
	
	int id;
	
	@NotEmpty(message="Please Enter User Name")
	String userName;
	
	@NotEmpty(message="Please Enter Password")
	String password;
	
	String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
