package com.global.netflex.model;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NetflexLoginModel {
	
	public static void processGenre(HttpServletRequest req, HttpServletResponse resp) {
		Cookie[] cookieArr = req.getCookies();
		if (null != cookieArr ) {
			for (Cookie cookie : cookieArr) {
				if ("GENRE".equals(cookie.getName()) ) {
					req.getSession().setAttribute("genreMsg", "당신이 선호하는 장르는" + cookie.getValue() + "이군요");
					break;
				}
			}
		}
	}
	
	public static boolean login(HttpServletRequest req, HttpServletResponse resp) {
		String userId =req.getParameter("userId");
		String userPw =req.getParameter("userPw");
		if ( "sasaki".equals(userId) ) {
			if( "1234".equals(userPw) ) {
				Cookie welcome = new Cookie("welcomeMSG", req.getRemoteAddr());
				welcome.setMaxAge(60);
				welcome.setPath(req.getContextPath());
				resp.addCookie(welcome);
				
				Map userInfo = new HashMap();
				userInfo.put("userId", userId);
				userInfo.put("name", "sasaki");
				userInfo.put("age", 20);
				req.getSession().setAttribute("userinfo", userInfo);
				return true;
			}
			
		}
		return false;
		}

}
