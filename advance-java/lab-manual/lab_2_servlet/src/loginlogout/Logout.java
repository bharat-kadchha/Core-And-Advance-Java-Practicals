package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession s=req.getSession();
		
		if(s!=null)
		{
			s.invalidate();
			pw.print("you are logout");
			pw.print("<br>go to login page ..<a href='/leb_2_servlet/LoginDemo.jsp'>login</>");
		}
		
		
		
		
	}
}
