<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<sql:setDataSource var="db" driver="sun.jdbc.odbc.JdbcOdbcDriver"
			url="jdbc:odbc:student" />

		<c:set var="no" value="12" />
		<sql:update dataSource="${db}" var="rs">  
			
			delete from info where id=?;
			<sql:param value="${no}" />
		</sql:update>
		
		
		<sql:query dataSource="${db}" var="rs">  
			SELECT * from info;  
		</sql:query>


		<c:forEach var="table" items="${rs.rows}">
			<c:out value="${table.ID}" />
			<c:out value="${table.name}" />
			<c:out value="${table.city}" />
			<c:out value="${table.myDate}" />
			<br>
		</c:forEach>


	</body>
</html>