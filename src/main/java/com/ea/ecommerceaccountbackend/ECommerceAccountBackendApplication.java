package com.ea.ecommerceaccountbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ECommerceAccountBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceAccountBackendApplication.class, args);
	}

}
