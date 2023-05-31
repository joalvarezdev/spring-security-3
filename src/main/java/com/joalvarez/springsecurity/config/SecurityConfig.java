package com.joalvarez.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	private static final String[] IGNORED_PATHS = {
		"/sample/unsecured"
	};

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity
			.authorizeHttpRequests(auth -> {
				auth.requestMatchers(IGNORED_PATHS).permitAll();
				auth.anyRequest().authenticated();
			})
			.build();
	}
}
