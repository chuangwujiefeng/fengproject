package com.cwj.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class SpringMVCSayHello {
	
	@RequestMapping("/mvc")
	public String sayHello(){
		return "home";
	}
	
	@RequestMapping("/file")
	public String fileUpload(){
		return "file";
	}
}
