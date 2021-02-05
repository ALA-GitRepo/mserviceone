package com.gopal.mserviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class MserviceoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MserviceoneApplication.class, args);
	}

	@Value("${configmessage:default1}")
	private String message;

	@GetMapping("/message")
	private String getInfo() {
		System.out.println("Message : " + message);
		return message;
	}

}
