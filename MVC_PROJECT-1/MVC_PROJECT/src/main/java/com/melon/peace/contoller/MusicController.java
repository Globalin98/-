package com.melon.peace.contoller;

import java.io.IOException;

import com.melon.peace.model.MusicModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MusicController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this);
		String uri = req.getRequestURI();
		if ( uri.contains("music_write_form.melon") ) {
			req.getRequestDispatcher("/WEB-INF/view/music/music_write_form.jsp").forward(req, resp);
		}
		if ( uri.contains("music_write.melon") ) {
			MusicModel.writeMusic(req);
			resp.sendRedirect("/MVC_PROJECT/");
		}
		if ( uri.contains("music_list.melon") ) {
			req.setAttribute("musicList", MusicModel.listMusic(req));
			req.getRequestDispatcher("/WEB-INF/view/music/music_list.jsp").forward(req, resp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
