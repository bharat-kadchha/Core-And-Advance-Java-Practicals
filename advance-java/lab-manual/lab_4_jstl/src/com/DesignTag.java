package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DesignTag extends TagSupport {

	public int doStartTag() throws JspException {

		JspWriter jsw = pageContext.getOut();
		try {
			jsw.write("<h2 style='background-color:orange'>staring tab</h2>");
		} catch (IOException e) {

			e.printStackTrace();
		}
		return 1;
	}

	public int doEndTag() throws JspException {
		JspWriter jsw = pageContext.getOut();
		try {
			jsw.write("<h2 style='background-color:pink'>ending tag</h2>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 1;
	}
}
