package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.resume.model.UserResume;

//@Controller
public class TestWorld {/*
	@RequestMapping("/resume")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Start here to register first and create resume</h3></div><br><br>";
		return new ModelAndView("Resume", "ResumeData", new UserResume());
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView viewRegistration(Map<String, Object> model) {
    	System.out.println("Started executed....");
        User userForm = new User();    
        ModelAndView result = new ModelAndView("/Registration1");
        
        model.put("userForm", userForm);
        
        List<String> professionList = new ArrayList<>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
        result.addObject(model); 
        return result;
    }
	
	@RequestMapping(value="/registerSuccess", method = RequestMethod.POST)
    public ModelAndView processRegistration(@ModelAttribute("userForm") User user, @RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
         
        // implement your own registration logic here...
         System.out.println("started executing registersuccess..............");
        // for testing purpose:
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        
        System.out.println("email: " + user.getEmail());
        System.out.println("birth date: " + user.getDate());
        System.out.println("profession: " + user.getProfession());
        ModelAndView result = new ModelAndView("RegistrationSuccess");
        //result.addObject("userForm",user);
        return result;
    }
*/}
