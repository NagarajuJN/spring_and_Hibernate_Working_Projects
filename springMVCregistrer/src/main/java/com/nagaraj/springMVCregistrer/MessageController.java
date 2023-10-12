package com.nagaraj.springMVCregistrer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
	
	
	@Autowired
	MessageService service;
	/**
	 * 
	 */
	public MessageController() {
		super();
		System.out.println("in Message no-org controller  ");
	}

	@RequestMapping({"/","/home"}) // url patterns
	public String  showHome()
	{
		System.out.println("in Message MC -----> showHome  ");
		
		return "home";
	}
	
	// linking for show quote page
	@RequestMapping("/showQuote")
	public String showQuote(Model model)
	{
		System.out.println("inn MC ---> showQuote");
		String quote = service.getQuote();
		model.addAttribute("quote",quote);
		
		return "showQuote";
	}
	
	// linking for register page 
	@RequestMapping("/openregister")

	public String showregister()
	{
		System.out.println("in MC -------> show Register");
		return "openregister";
	}
	
	
	@RequestMapping("/register")

	public String showregisters()
	{
		System.out.println("in MC -------> show Registers");
		return "register";
	}
}
