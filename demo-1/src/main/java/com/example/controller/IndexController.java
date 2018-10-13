package com.example.controller;

import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * <p>ClassName: IndexController</p>  
 * <p>Description: </p>  
 * @author Administrator  
 * @date 2018年10月11日
 */
@Slf4j
@ComponentScan
@Controller
public class IndexController {
	
	/**
	 * 
	 * <p>Method: index</p>  
	 * <p>Description: </p>  
	 * @param x
	 * @return
	 */
	@RequestMapping("/index")
	public String  index(Map<String, Object>map) {
		
		//log.info("HelloWorld!");
		map.put("name", "HelloWorld!");
		return "index";
	}
	

}
