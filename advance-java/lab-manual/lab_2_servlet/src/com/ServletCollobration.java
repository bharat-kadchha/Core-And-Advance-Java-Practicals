package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCollobration extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String no = req.getParameter("no");
		writer.print("you enter this--" + no);

		if (no.equals("12345")) {
			req.getRequestDispatcher("/servlet/forward").forward(req, resp);
		} else {
			req.getRequestDispatcher("/Collobration1.jsp").include(req, resp);
			writer.print("<b><h4>your are not valid user ... <br> enter only 12345</h4></b>");
		}
		writer.close();
	}

}
