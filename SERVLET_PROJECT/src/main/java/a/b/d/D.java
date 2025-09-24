package a.b.d;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class D extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("D dopost");
		String msg = req.getParameter("msg");
		System.out.println(msg);
		PrintWriter pw = resp.getWriter();
		pw.write(msg);
		pw.flush();
		pw.close();
	}

}
