package com.javainuse.employeeconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmployeeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigApplication.class, args);
	}
}
