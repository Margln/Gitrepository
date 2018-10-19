package com.sztheatre.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sztheatre.entity.User;
import com.sztheatre.mapper.UserMapper;


@ComponentScan
@Controller
public class UserController {
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/getUser")
	public String selectUser(Map<String, Object> map) {
		
		/*int result= userMapper.insert("szxy","123123" );
		
		User user = userMapper.findByName("szxy");
		
		map.put("result", result);
		
		map.put("user", user);*/
		
		map.put("username", "admin");
		
		return "/admin/index";
	} 
	

}
