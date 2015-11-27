package com.resume.controller;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.resume.dao.impl.ResumeDaoImpl;
import com.resume.model.UserResume;
import com.resume.playarea.MSWordResume;

@Controller
public class ResumeController {
	@Autowired
	ResumeDaoImpl resumeDao;

	@RequestMapping("/userResume")
	public ModelAndView helloWorld(@ModelAttribute("ResumeData") UserResume userResume) throws FileNotFoundException {
 
		System.out.println("Incoming Data:"+userResume.toString());
		ModelAndView result = new ModelAndView("Success");
		boolean isWrittentoFile = new MSWordResume().writeDataToMSWord(userResume);
		System.out.println("isWrittentoFile:  "+isWrittentoFile);
		result.addObject("hello","success");
		return result;
	}
	@RequestMapping("/testDao")
	public void testDb(){
		//resumeDao.inser();
	}
}
