<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>

		<c:set var="s1" value="I am a test String 123" />
		<c:out value="s1==${s1}" />
		<c:set var="s2" value="hello world,,,java programming" />
		<c:out value="s2==${s2}" />
		<c:if test="${fn:contains(s1, 'test')}">
			<p>	Found test string</p>
		</c:if>

		<c:if test="${fn:endsWith(s1, '123')}">
			<p>String ends with 123</p>
		</c:if>

		<p>Index (1) : ${fn:indexOf(s1, "String")}</p>
		<p>Index (2) : ${fn:indexOf(s2, "java")}</p>

		<p>Length of String (1) : ${fn:length(s1)}</p>
		<p>Length of String (2) : ${fn:length(s2)}</p>

		<c:out value="${s2}" />
		
		<br><c:set var="s2" value="${fn:toUpperCase(s2)}" />
		<c:out value="${s2}" />
	</body>
</html>