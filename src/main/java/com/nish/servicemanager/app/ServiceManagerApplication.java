package com.nish.servicemanager.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServiceManagerApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServiceManagerApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceManagerApplication.class, args);
	}
}
