package com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeController {
	
	
	private static final Logger logger= Logger.getLogger(WelcomeController.class);
	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView getWelcome()
	{
		
		if(logger.isDebugEnabled())
		{
			logger.debug("getWelcome is executed");
		}
		
		logger.error("This is the error message", new Exception("Testing"));
		
		ModelAndView model= new ModelAndView();
		model.addObject("msg", "Hello Spring MVC + log4j");
		
		
		return model;
		
	}

}
