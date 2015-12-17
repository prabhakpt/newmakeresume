package com.resume.dao;

import com.resume.model.UserLoginPojo;
import com.resume.model.UserModel;

public interface UserDao {
	public void registerUser(UserModel user);
	public void deleteUser();
	public void updateUser();
	public UserLoginPojo loginUser(String userName,String password);
}
