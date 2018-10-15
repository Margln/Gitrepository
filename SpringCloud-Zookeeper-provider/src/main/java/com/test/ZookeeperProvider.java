package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient 非Eureka作为注册中心时，向注册中心注册服务

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperProvider {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperProvider.class, args);
	}
}
