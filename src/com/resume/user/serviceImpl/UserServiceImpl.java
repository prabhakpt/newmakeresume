package com.resume.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.UserDao;
import com.resume.model.UserLoginPojo;
import com.resume.model.UserModel;
import com.resume.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public UserLoginPojo userLogin(UserLoginPojo user) {
		UserLoginPojo pojo = userDao.loginUser(user.getUserName(), user.getPassword());
		if(pojo != null){
			System.out.println(" user is not null:"+pojo);
			return pojo;
		}
		return pojo;
	}

	@Override
	public void userRegister(UserModel user) {
		userDao.registerUser(user);
	}

}
