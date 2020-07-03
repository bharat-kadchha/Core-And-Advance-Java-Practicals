package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class Mytag extends TagSupport {

	public int doStartTag() throws JspException {
		try {
			JspWriter jsw = pageContext.getOut();

			jsw.write("<h2>starting tag..</h2>");

		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_PAGE;
	}

	public int doEndTag() throws JspException {
		JspWriter jsw = pageContext.getOut();
		try {
			jsw.write("<br><h2>ending tag..</h2>");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return 1;
	}

}
