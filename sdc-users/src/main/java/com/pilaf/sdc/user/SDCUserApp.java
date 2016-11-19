package com.pilaf.sdc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SDCUserApp {

	public static void main(String[] args) {
		SpringApplication.run(SDCUserApp.class, args);

	}

	@Configuration
	class ServerConfiguration implements EmbeddedServletContainerCustomizer {

		private static final int USER_PORT = 9001;

		@Override
		public void customize(ConfigurableEmbeddedServletContainer server) {
			server.setPort(USER_PORT);
		}

	}

}
