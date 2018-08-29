package com.capg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Jspcontroller {
	
	@RequestMapping("/index")
	public String addFeed() {
		
		return "index";
		
	}
	

	@RequestMapping("/Merchant")
	public String addResponse() {
		
		return "Merchant";
		
	}

}
