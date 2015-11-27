package com.resume.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.resume.model.UserModel;
import com.resume.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/userRegister")
	public ModelAndView userRegister(@ModelAttribute("user") UserModel user){
		System.out.println("Incoming Data:"+user.toString());
		ModelAndView result = new ModelAndView("Success");
		userService.userRegister(user);
		return result;
	}
	
	@RequestMapping("/register")
	public ModelAndView callRegister(){
		System.out.println("Loading Registration Page:");
		return new ModelAndView("register","user",new UserModel());
	}
}
