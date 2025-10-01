package com.global.water.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/*")
public class A_Filter implements Filter{
	
	public static Set<String> blackIpSet = new HashSet<String>();
	public static List<String> iplist = new ArrayList<String>();

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
//		System.out.println(this);
//		chain.doFilter(req, resp);
		
		if (blackIpSet.contains(req.getRemoteAddr()) ) {
			//shorinasi(if문에 빈칸도 주석으로 "적을게 없음" 이라고 적어야함)
		} else {
			iplist.add(req.getRemoteAddr());
			chain.doFilter(req, resp);
		}
		
		
//		iplist.add(req.getRemoteAddr());
//		chain.doFilter(req, resp);
		
//		if (req.getRemoteAddr().contains("192.168.0.78")) {
//			System.out.println(new java.util.Date() + "★★(A_Filter)★★" + req.getRemoteAddr());
//			chain.doFilter(req, resp);
//		} else {
//			if (blackIpSet.contains(req.getRemoteAddr())) {
//				
//				
//			}
//			System.out.println(new java.util.Date() + "====(A_Filter)====" + req.getRemoteAddr());
//			blackIpSet.add(req.getRemoteAddr());
//		}
	}
}
