package com.nish.servicemanager.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {ApiConfig.class})
public class ServiceManagerApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ServiceManagerApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceManagerApplication.class, args);
	}
}
