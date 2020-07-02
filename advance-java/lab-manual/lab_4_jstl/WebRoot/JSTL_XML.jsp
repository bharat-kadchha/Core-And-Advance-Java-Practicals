<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:import url="vegetables.xml" var="vv"/>

<x:parse xml="${vv}" var="data"/>

<x:forEach select="$data/vegetables/vegetable" var="record">

	<x:out select="$record/name"/>
	<x:out select="$record/price"/>

</x:forEach>

<x:choose>
	<x:when select="$data/vegetables/vegetable/price >='20'">
	
			price is high...
	</x:when>

	<x:otherwise >
	
		price is less...
	  </x:otherwise>
</x:choose>

<x:set var="name"  select="$data/vagetables/vegetable/name"/>

first name ==<x:out select="$name"/>

</body>
</html>