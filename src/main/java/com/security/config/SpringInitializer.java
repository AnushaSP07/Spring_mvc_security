package com.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringInitializer extends AbstractSecurityWebApplicationInitializer {

	//this class to help to get the filter from the SprngSecurity Config
	//initilizer or register filter chain here
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("test")
		.password("test");
	}
}
