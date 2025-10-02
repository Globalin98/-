package com.global.netflex.controller;

import java.io.IOException;

import com.global.netflex.model.NetflixLogoutModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/netflix/logout")
public class NetflixLogoutController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NetflixLogoutModel.logout(req);
		resp.sendRedirect(req.getContextPath());
	}
}
