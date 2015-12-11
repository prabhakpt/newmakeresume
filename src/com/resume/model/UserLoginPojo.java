package com.resume.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserLoginPojo {
	
	@NotEmpty(message="Please Enter User Name")
	String userName;
	
	@NotEmpty(message="Please Enter Password")
	String password;
	
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
	
}
