package com.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.resume.dao.MSWordResume;
import com.resume.dao.Wordtable;
import com.resume.model.UserResume;

@Controller
public class ResumeController {

	@RequestMapping("/userResume")
	public ModelAndView helloWorld(@ModelAttribute("ResumeData") UserResume userResume) throws FileNotFoundException {
 
		System.out.println("Incoming Data:"+userResume.toString());
		ModelAndView result = new ModelAndView("Success");
		boolean isWrittentoFile = new MSWordResume().writeDataToMSWord(userResume);
		System.out.println("isWrittentoFile:  "+isWrittentoFile);
		result.addObject("hello","success");
		return result;
	}
}
