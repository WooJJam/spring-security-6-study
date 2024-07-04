package com.eazybytes.filter;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AuthoritiesLogginAtFilter implements Filter {

	private final Logger LOG = Logger.getLogger(AuthoritiesLogginAfterFilter.class.getName());

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws
		IOException,
		ServletException {
		LOG.info("Authentication Validation is in progress");
		chain.doFilter(request, response);
	}
}
