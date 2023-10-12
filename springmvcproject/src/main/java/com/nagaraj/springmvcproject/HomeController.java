package com.nagaraj.springmvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller  // spring container will create object for home controller
public class HomeController {

	/**
	 * 
	 */
	public HomeController() {
		super();
	System.out.println("Home controller is started waiting for bean to execuated")
;
}

	// i need to execute the below method when the request from the user 
	// so i will use request-mapping
	@RequestMapping("/home")  // used to map request to method handler of mvc
	public String showHome()
	{
		return "home";
	}
	@RequestMapping("/inputview")
	
	public String showInput()
	{
		return "inputview";
	}
	
}
