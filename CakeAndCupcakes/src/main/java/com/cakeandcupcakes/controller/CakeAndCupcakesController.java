package com.cakeandcupcakes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CakeAndCupcakesController {
	@RequestMapping("/")
	public String gethome(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String getlogin(){
		return "login";
	}
	@RequestMapping("/signup")
	public String getsignup(){
		return "registration";
	}
}
