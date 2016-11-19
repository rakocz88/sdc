package com.pilaf.sdc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pilaf.sdc.auth.rest.AuthRestController;

@SpringBootApplication
public class SDCAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(SDCAuthApp.class, args);

	}

	@Configuration
//	@ComponentScan(basePackages = { "com.pilaf.sdc.auth.rest" })
	class BeanConfiguration {

		@Bean
		public AuthRestController getAuthRetController() {
			return new AuthRestController();
		}
	}

}
