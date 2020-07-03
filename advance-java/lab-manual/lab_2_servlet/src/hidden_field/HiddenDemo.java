package hidden_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("text/html");
		String name = req.getParameter("name");

		printWriter.print("hello " + name);
		printWriter.print("...enter data below...");

		printWriter.print("<form action='/leb_2_servlet/servlet/gethidden'>");
		printWriter.print("phoneno : <input type='text' name='phoneno'><br>");
		printWriter.print("<input type='hidden' name='hiddenName' value='" + name+ "'>");
		printWriter.print("<input type='submit' value='go'>");
		printWriter.close();

	}
}
