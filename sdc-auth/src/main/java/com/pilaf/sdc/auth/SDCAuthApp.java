package com.pilaf.sdc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SDCAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(SDCAuthApp.class, args);

	}

	@Configuration
	class BeanConfiguration {
	}

}
