<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		Date date = new Date();
		pageContext.setAttribute("date", date);
	%>

	<fmt:formatDate value="${date}" pattern="dd-MM-yyyy"/>
	<br>
	<fmt:formatDate value="${date}" type="time" pattern="hh:mm a"/>
	<br>
	<fmt:formatDate value="${date}" type="date"/>
	
	<fmt:formatDate value="${date}" type="date" dateStyle="long"/>
	
	
	<c:set var="date" value="12-08-2016" />  
  
	<fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
	<p><c:out value="${parsedDate}" /></p>  

	<fmt:setLocale value="zh"/>
	
	<%-- <fmt:setBundle basename="app" scope="application"/> --%>
	<fmt:bundle basename="app">
		<fmt:message key="app.name"/>
	</fmt:bundle>
	
	
	
</body>
</html>