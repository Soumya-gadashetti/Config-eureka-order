package com.cts.om;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableCircuitBreaker
public class OrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementApplication.class, args);
		
	}
		
		@Bean
		Docket configureSwagger() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.ant("/order/**"))
					.build()
					
					.apiInfo(new ApiInfo("Order API Documentation",
							"A Sample API for Vendors",
							"1.0.0",
							"Shopping is Fun",
							new Contact("Soumya", "www.soumya.com", "soumya@gmail.com"), 
							"Standard API License",
							"www.soumya1.com",
							Collections.emptyList()));
	}

}
