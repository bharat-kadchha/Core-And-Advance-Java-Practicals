<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'LoginPage.jsp' starting page</title>

	</head>

	<body>
		<h6 >LOGIN PAGE</h6>

		<form action="JspPages/login/Check.jsp">

			Name :&nbsp; <input type="text" name="name">
			<br>
			Pass :&nbsp;&nbsp;&nbsp;<input type="password" name="pass">
			<br>

			<input type="submit" value="login">
		</form>
	</body>
</html>
