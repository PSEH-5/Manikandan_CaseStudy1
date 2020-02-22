package com.casestudy.foodballLegue.filter;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

public class AuthFilter extends GenericFilterBean{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		final HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		
		final String authKey = httpServletRequest.getHeader("Authorization");

		if (authKey != null) {
			String role = "Auth_User";
			final AuthToken AuthToken = new AuthToken(authKey, Collections.singletonList(new SimpleGrantedAuthority(role)));
			SecurityContextHolder.getContext().setAuthentication(AuthToken);
		} 
		chain.doFilter(request, response);
	}

}
