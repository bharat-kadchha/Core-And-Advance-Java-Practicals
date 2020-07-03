<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>



		<c:out value="hello world" />
		name--<c:set var="name" value="bharat" scope="session" />
		<c:out value="${name}" /><br>
		<c:out value="After remove==${name}" /><br>
		
		<c:remove var="name" />
		
		<c:out value="before remove==${name}" /><br>
		<c:set var="name" value="bharat" scope="session" />

		<c:if test="${name=='bharat'}">
			<br><c:out value="you are log in"></c:out>
		</c:if>

		<br>
		<c:forEach var="j" begin="1" end="5">
			<br><c:out value="${j}"></c:out>
		</c:forEach>
		
		<br>
		<c:url value="/index.jsp" var="url">
			<c:param name="name" value="bharat" />
			<c:param name="pass" value="bj1312" />
		</c:url>
		
		<br>
		<c:import url="/index.jsp" var="data" />
		<c:out value="${data}"></c:out>
	</body>
</html>