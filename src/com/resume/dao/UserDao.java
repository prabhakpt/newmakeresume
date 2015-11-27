package com.resume.dao;

import com.resume.model.UserModel;

public interface UserDao {
	public void registerUser(UserModel user);
	public void deleteUser();
	public void updateUser();
	public void loginUser();
}
