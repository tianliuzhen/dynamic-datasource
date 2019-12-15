package com.aaa.gatewayswagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewaySwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySwagger2Application.class, args);
	}

}
