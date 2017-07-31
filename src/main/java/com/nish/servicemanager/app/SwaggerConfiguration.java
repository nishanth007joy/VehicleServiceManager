package com.nish.servicemanager.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
public Docket api(){
	final Contact contact =
	        new Contact("Service manager", "http://servicemanager", "servicemanager@servicemanager.com");
	    final ApiInfo info =
	        new ApiInfoBuilder()
	            .title("Service Manager API")
	            .description("Service Manager API")
	            .version("1.0.0")
	            .termsOfServiceUrl("http://terms-of-service.url")
	            .contact(contact)
	            .license("License")
	            .licenseUrl("http://license.url")
	            .build();
	return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.any())
			.paths(PathSelectors.regex("/v1/.*"))
			.build()
			.pathMapping("/")
			.genericModelSubstitutes(ResponseEntity.class)
	        .useDefaultResponseMessages(false);
}
}
