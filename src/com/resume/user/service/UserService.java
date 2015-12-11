package com.resume.user.service;

import com.resume.model.UserLoginPojo;
import com.resume.model.UserModel;


public interface UserService {
	public UserModel userLogin(UserLoginPojo user);
	public void userRegister(UserModel user);
}
