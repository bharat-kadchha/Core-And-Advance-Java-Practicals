package hidden_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetHidden extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter writer=resp.getWriter();
		resp.setContentType("text/html");
		String hiddenName=req.getParameter("hiddenName");
		
		writer.print("get data from hidden field="+hiddenName);
	}
}
