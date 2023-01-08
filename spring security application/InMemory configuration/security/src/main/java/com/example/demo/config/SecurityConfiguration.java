package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain fitlerChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests((auth) -> auth
				.requestMatchers("/masai/userr").authenticated()
				.requestMatchers("/masai/adminn").authenticated()
				.requestMatchers("/masai/helloo").permitAll()
				).httpBasic();
		
		return http.build();	
		    
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetails() {
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("mohit").password("12345").authorities("read").build();
		UserDetails admin = User.withUsername("admin").password("12345").authorities("admin").build();
		userDetailsService.createUser(user);
		userDetailsService.createUser(admin);
		return userDetailsService;
	}
	
	@Bean
	public PasswordEncoder passowrdEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
