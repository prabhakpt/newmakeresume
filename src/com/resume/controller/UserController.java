package com.resume.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.resume.model.NewUserValidation;
import com.resume.model.UserLoginPojo;
import com.resume.model.UserModel;
import com.resume.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/userRegister")
	public ModelAndView userRegister(@Valid @ModelAttribute("user") UserModel user, BindingResult result){
		System.out.println("Incoming Data:"+user.toString());
		NewUserValidation validateUser = new NewUserValidation();
		validateUser.validate(user, result);
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()){
			System.out.println("Having error in the form");
			modelAndView.addObject("result", result);
			modelAndView.setViewName("register");
			System.out.println("Redrecting to Register page");
		}else{
			userService.userRegister(user);
			System.out.println("came out of service class");
			modelAndView.setViewName("Success");
			System.out.println("Redirecting to success page");
		}
		
		return modelAndView;
	}
	
	// load registration page
	@RequestMapping("/register")
	public ModelAndView callRegister(){
		System.out.println("Loading Registration Page:");
		return new ModelAndView("register","user",new UserModel());
	}
	
	// load login page
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView viewLogin(){
		System.out.println("loading user login page..");
		return new ModelAndView("login","userLogin",new UserLoginPojo());
	}
	
	/**
	 * login validation
	 * @param userLogin
	 * @param result
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView doLogin(@Valid @ModelAttribute("userLogin") UserLoginPojo userLogin,BindingResult result){
		ModelAndView model = new ModelAndView();
		if(result.hasErrors()){
			model.addObject("result", result);
			model.setViewName("login");
		}else{
			UserModel user = userService.userLogin(userLogin);
			System.out.println("user data at controller"+user.getUserName());
			model.addObject("userInfo", user !=null ? user : "");
			model.setViewName("home");
		}
		return model;
	}
}
