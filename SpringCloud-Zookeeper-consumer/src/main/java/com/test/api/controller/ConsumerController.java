package com.test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/getService")
	public String getService() {
		
		String url = "http://Zookeeper-provider/providerSercive";
		
		String result = restTemplate.getForObject(url, String.class);
		
		return "消费者调用 服务提供者 ----  result :"+result;
	}
	
}
