package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetSession extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		resp.setContentType("text/html");
		HttpSession session = req.getSession();

		printWriter.print("created " + session.getCreationTime());
		printWriter.print("\n id=" + session.getId());
		printWriter.print("\n max limit=" + session.getMaxInactiveInterval());
		printWriter.print(session.isNew());

		session.setMaxInactiveInterval(1200);
		printWriter.print("\n max limit=" + session.getMaxInactiveInterval());

		session.removeAttribute("name");
		printWriter.println("\nhello " + session.getAttribute("name"));

		Enumeration enumeration = session.getAttributeNames();
		while (enumeration.hasMoreElements()) {
			printWriter.print("attributesession---" + enumeration.nextElement());
		}
		printWriter.println("your pasessionsessionword isession "
				+ session.getAttribute("pasessionsessionword"));

		printWriter.close();
	}

}
