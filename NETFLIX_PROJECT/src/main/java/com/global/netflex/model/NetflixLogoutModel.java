package com.global.netflex.model;

import jakarta.servlet.http.HttpServletRequest;

public class NetflixLogoutModel {

	public static void logout(HttpServletRequest req) {
		req.getSession().invalidate();
	}
}
