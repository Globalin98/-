package com.global.water.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/*")
public class A_Filter implements Filter{
	
	private static Set<String> blackIpSet = new HashSet<String>();

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		if (req.getRemoteAddr().contains("192.168.0.78")) {
			System.out.println(new java.util.Date() + "★★(A_Filter)★★" + req.getRemoteAddr());
			chain.doFilter(req, resp);
		} else {
			if (blackIpSet.contains(req.getRemoteAddr())) {
				
				
			}
			System.out.println(new java.util.Date() + "====(A_Filter)====" + req.getRemoteAddr());
			blackIpSet.add(req.getRemoteAddr());
		}
	}
}
