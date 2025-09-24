package a.b.c;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class B extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("B doGet");
		
		String ip = req.getRemoteAddr();
		PrintWriter pw = resp.getWriter();
		
//		pw.write("Redirected");
		pw.write("<script>location.href='http://192.168.0.192:8800/SERVLET_PROJECT/abc'</script>");
		pw.flush();
		pw.close();

	}

}
