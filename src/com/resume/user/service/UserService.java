package com.resume.user.service;

import com.resume.model.UserLoginPojo;
import com.resume.model.UserModel;


public interface UserService {
	public UserLoginPojo userLogin(UserLoginPojo user);
	public void userRegister(UserModel user);
}
