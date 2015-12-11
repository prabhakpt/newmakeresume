package com.resume.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserModel {
	private int id;
	
	@NotEmpty(message="User Name is required")
	private String userName;
	
	@NotEmpty(message="Password is required!")
	private String password;
	
	@NotEmpty(message="Confirm Password is required!")
	private String confirmPassword;
	
	@NotEmpty(message="Email is required!")
	private String email;
	
	
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
