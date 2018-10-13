package com.test.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProviderController {
	@Value("${server.port}")
	private String servicePork;
	
	@RequestMapping("/providerSercive")
	public String providerSercive() {
		
		return "服务提供者  端口："+servicePork ;
	}
}
