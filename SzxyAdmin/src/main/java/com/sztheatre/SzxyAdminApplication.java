package com.sztheatre;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "com.sztheatre.mapper" })
public class SzxyAdminApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SzxyAdminApplication.class, args);
	
	}
}
