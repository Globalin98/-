package com.global.water.filter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class B_Filter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
//		System.out.println(this);
		if (10 <= Collections.frequency(A_Filter.iplist, req.getRemoteAddr()) ) {
			A_Filter.blackIpSet.add(req.getRemoteAddr());
		}
		
		System.out.println(
				 req.getRemoteAddr()
				 + "("
				 + Collections.frequency(A_Filter.iplist, req.getRemoteAddr())
				 + ")"
				 );
		chain.doFilter(req, resp);
		
	}

}
