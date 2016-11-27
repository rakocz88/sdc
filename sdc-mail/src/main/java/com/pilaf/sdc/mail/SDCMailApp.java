package com.pilaf.sdc.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SDCMailApp {

	public static void main(String[] args) {
		SpringApplication.run(SDCMailApp.class, args);

	}

	@Configuration
	class ServerConfiguration implements EmbeddedServletContainerCustomizer {

		private static final int MAIL_PORT = 9002;

		@Override
		public void customize(ConfigurableEmbeddedServletContainer server) {
			server.setPort(MAIL_PORT);
		}

	}

}
