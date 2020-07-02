<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>

		<c:set var="number" value="123.567"></c:set>


		<fmt:parseNumber var="p" type="number" integerOnly="true"
			value="${number}" />
		<c:out value="${p}"></c:out>


		<c:set var="d" value="12-09-1223" />

		<fmt:parseDate var="now" value="${d}" pattern="dd-MM-yyyy" />
		<c:out value="${now}"></c:out>

		<p>
			Formatted Date (1):
			<fmt:formatDate type="time" value="${now}" />
		</p>

		<p>
			Formatted Date (2):
			<fmt:formatDate type="date" value="${now}" />
		</p>

		<p>
			Formatted Date (3):
			<fmt:formatDate type="both" value="${now}" />
		</p>
		<p>Formatted Date (4): <fmt:formatDate type = "both" 
         dateStyle = "short" timeStyle = "short" value = "${now}" /></p>
      
      <p>Formatted Date (5): <fmt:formatDate type = "both" 
         dateStyle = "medium" timeStyle = "medium" value = "${now}" /></p>
      
      <p>Formatted Date (6): <fmt:formatDate type = "both" 
         dateStyle = "long" timeStyle = "long" value = "${now}" /></p>
      
      <p>Formatted Date (7): <fmt:formatDate pattern = "yyyy-MM-dd" 
         value = "${now}" /></p>
         
         <fmt:setLocale value="EN"/>
        <fmt:setBundle basename="com.Demo" var="a"/>  
<fmt:message key="vegetable.Potato" bundle="${a}"/><br/>  
   <fmt:message key="vegetable.Tomato" bundle="${a}"/><br/>  
  <fmt:message key="vegetable.Carrot" bundle="${a}"/><br/> 
         
	</body>
</html>