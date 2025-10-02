package com.global.netflex.model;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

public class NetflexLoginModel {
	
	public  static boolean login(HttpServletRequest req) {
		String userId =req.getParameter("userId");
		String userPw =req.getParameter("userPw");
		if ( "sasaki".equals(userId) ) {
			if( "1234".equals(userPw) ) {
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
