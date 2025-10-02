package com.global.netflex.controller;

import java.io.IOException;

import com.global.netflex.model.NetflixLoginModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/netflix/login")
public class NetflixLoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if ( NetflixLoginModel.login(req) ) {
			resp.sendRedirect(req.getContextPath() + "/netflix/home");
		} else {
			resp.sendRedirect(req.getContextPath());
		}
	}
	
}
