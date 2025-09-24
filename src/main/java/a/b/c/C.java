package a.b.c;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class C extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String[] msgArr = req.getParameterValues("msg");
		String nick = req.getParameter("nick");
		PrintWriter pw = resp.getWriter();
		
		
		if (msgArr[0].contains("good")) {
			pw.write("thank you"+":"+msgArr[0]+":"+msgArr[1]+"from"+nick);
		}else {
			pw.write("xxxx"+nick);
		}
	}

}
