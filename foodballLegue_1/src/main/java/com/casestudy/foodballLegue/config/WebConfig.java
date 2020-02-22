package com.casestudy.foodballLegue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.casestudy.foodballLegue.filter.AuthFilter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class);
		http.antMatcher("/get_standings/*").authorizeRequests().anyRequest().authenticated();
	}

}
