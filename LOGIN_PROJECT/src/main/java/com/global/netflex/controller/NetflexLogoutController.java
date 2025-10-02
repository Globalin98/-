package com.global.netflex.controller;

import java.io.IOException;

import com.global.netflex.model.NetflexLogoutModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/netflex/logout")
public class NetflexLogoutController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		NetflexLogoutModel.logout(req);
		resp.sendRedirect(req.getContextPath());
	}
}
