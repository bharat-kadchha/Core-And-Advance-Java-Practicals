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

	</head>

	<body>
		
		<h4><br></h4><h4>welcome to hidden field technique<br> click to continue..</h4>
		
		<form action="/leb_2_servlet/servlet/hiddendemo">
		
		username: <input type="text" name="name">
		<input type="submit" value="continue">
		
		</form>
		
	</body>
</html>
