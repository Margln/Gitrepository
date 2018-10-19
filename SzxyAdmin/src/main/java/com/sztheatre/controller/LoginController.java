package com.sztheatre.controller;

import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@ComponentScan
@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String defaultView(Map<String,Object> map) {
		map.put("msg", "");
		return "/admin/login";
	}
	
	@RequestMapping("/login")
	public String login(Map<String,Object> map ) {
		
		
		
		map.put("msg", "");
		return "/admin/index";
	}
	

}
