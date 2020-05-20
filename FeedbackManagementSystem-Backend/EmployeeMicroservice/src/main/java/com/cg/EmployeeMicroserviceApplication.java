package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroserviceApplication.class, args);
	}

}
