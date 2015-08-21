package com.test;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    private String username;
    private String password;
    private String email;
    @DateTimeFormat(pattern="yyyy-MM-dd")// converting string date to Class Date format
    private Date date;
    private String profession;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", email=" + email + ", birthDate="  
				+ ", profession=" + profession + "]";
	}
 
    
 
}
