package com.attractor.myNamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyNamingServerApplication.class, args);
	}

}
