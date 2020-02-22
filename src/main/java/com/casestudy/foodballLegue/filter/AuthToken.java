package com.casestudy.foodballLegue.filter;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class AuthToken extends AbstractAuthenticationToken{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String authKey;
	public AuthToken(String authKey, Collection<? extends GrantedAuthority> authorities) {
		super(authorities);
		this.authKey = authKey;
		setAuthenticated(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAuthKey() {
		return authKey;
	}

}
