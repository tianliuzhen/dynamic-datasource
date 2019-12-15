package com.aaa.eurkea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkeaApplication.class, args);
	}

}
