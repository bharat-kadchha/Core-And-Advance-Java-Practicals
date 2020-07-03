package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodsOfResp extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();

		resp.addCookie(new Cookie("name", "bharat"));

		for (Cookie cookie : req.getCookies()) {
			printWriter.print(cookie.getName() + "--" + cookie.getValue() + "--");
		}

		resp.addHeader("num", "123456");
		printWriter.print(resp.containsHeader("num"));
		printWriter.print("\nbufer size--" + resp.getBufferSize() +
				"\n encoding--" + resp.getCharacterEncoding() + 
				"\n context type--"+ resp.getContentType());
		
		printWriter.print("\nreturn all status \n" + resp.SC_ACCEPTED + "\n"
				+ resp.SC_REQUEST_URI_TOO_LONG + "\n");

		resp.resetBuffer();
		resp.sendError(404);
		resp.sendRedirect("/leb_2_servlet/servlet/httpMethod");
		resp.setBufferSize(523456);

		printWriter.print(resp.getBufferSize());

		resp.setLocale(new Locale("jp", "JP"));

		printWriter.print("\nlocale--" + resp.getLocale());

		resp.setStatus(420, "hello");
		
		printWriter.close();

	}
}
