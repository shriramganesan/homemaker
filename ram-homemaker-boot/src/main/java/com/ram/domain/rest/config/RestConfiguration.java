package com.ram.domain.rest.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfiguration {

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>
	  webServerFactoryCustomizer() {
	    return factory -> factory.setContextPath("/homemaker");
	}
}
