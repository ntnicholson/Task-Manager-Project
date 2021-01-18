package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@GetMapping(value = "/index.html")
	public String index() 
	{
		return "Home";
	}
	@GetMapping(value = "/home")
	public String home() 
	{
		return "Home";
	}

}
