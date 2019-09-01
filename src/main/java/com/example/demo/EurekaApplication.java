package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 添加启动注解
 * 
 * */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
 
	//Eureka的启动类 承担注册中心的工作
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
