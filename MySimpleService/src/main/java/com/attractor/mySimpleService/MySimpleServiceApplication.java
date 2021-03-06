package com.attractor.mySimpleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MySimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySimpleServiceApplication.class, args);
	}

}
