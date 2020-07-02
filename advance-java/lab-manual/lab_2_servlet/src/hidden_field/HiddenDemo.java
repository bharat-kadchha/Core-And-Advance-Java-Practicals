package hidden_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenDemo extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		
		pw.print("hello "+name);
		pw.print("...enter data below...");
		

		pw.print("<form action='/leb_2_servlet/servlet/gethidden'>"); 
		pw.print("phoneno : <input type='text' name='phoneno'><br>");
		pw.print("<input type='hidden' name='hiddenName' value='"+name+"'>");	
		pw.print("<input type='submit' value='go'>");
		
	}
}
