package com.resume.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class NewUserValidation implements Validator{

	@Override
	public boolean supports(Class<?> userClass) {
		System.out.println("verifying is UserModel is a class");
		return UserModel.class.equals(userClass);
	}

	@Override
	public void validate(Object userModle, Errors result) {
		UserModel user = (UserModel) userModle;
		if(user.getPassword() != null && !(user.getPassword().equals(""))&& user.getConfirmPassword() != null && !(user.getConfirmPassword().equals(""))){
			if(!(user.getPassword().equals(user.getConfirmPassword()))){
				result.reject("", "Both password and confirm password should be same");
			}
		}
	}

}
