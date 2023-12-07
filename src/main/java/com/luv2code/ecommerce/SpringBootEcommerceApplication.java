package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

}
