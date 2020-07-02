<%@ page language="java" import="java.util.*" pageEncoding="
UTF-8"
	contentType="text/html; charset=UTF-8"%>
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

		<title>My JSP 'StaticInclude1.jsp' starting page</title>

	</head>

	<body>
		<br>
		This is my Static include page.
		<br>
		<%@ include file="/JspPages/includeDemo/doc.txt"%>
	</body>
</html>
