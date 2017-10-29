<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="Hello JSTL" />

<br>
<c:set var="userName" value="${param.userName }" />

<c:out value="${userName}" />

<c:if test="${userName eq 'Harshal'}">
	<c:out value="You are a Valid User"></c:out>
</c:if>
<c:if test="${userName ne 'Harshal'}">
	<c:out value="You are NOT a Valid User"></c:out>
</c:if>

<!--------------------------------- For Loops -->
<br>
<c:forEach begin="1" end="10" var="i" step="1">
	<c:out value="I = ${i }" />
	<br>
</c:forEach>
<br>
<%
	List<String> cities = new ArrayList<String>();
	cities.add("Pune");
	cities.add("Mumbai");
	cities.add("Kolhapur");
	pageContext.setAttribute("cities",cities);
%>

<c:forEach items="${pageScope.cities}" var="city">
	<c:out value=" ${city}" /> <br>
</c:forEach>

<jsp:useBean id="student" class="com.jsp.bean.Student">
</jsp:useBean>
	<jsp:setProperty property="subject" name="student" value="Java"/>
	<jsp:setProperty property="subject" name="student" value="C++"/>
	<jsp:setProperty property="subject" name="student" value="C"/>
	
	<c:forEach items="${student.subjectList}" var="sub">
		<c:out value="Subject: ${sub}" />
		<br>
	</c:forEach>
	
<br>

<c:forTokens items="Guava,Apple,Grapes,Banana,Custurd Apple" delims="," var="fruit" >
	<c:out value="Fruit Name: ${fruit}" />
	<br>
</c:forTokens>

<!--------------------------------- Switch -->
<br>
<c:set var="salary" value="${param.salary}" />
<c:choose>
	<c:when test="${salary ge 50000 and salary lt 70000}">
		<c:out value="You are eligible for 80% home loan"></c:out>
	</c:when>
	<c:when test="${salary ge 70000}">
		<c:out value="You are eligible for 90% home loan"></c:out>
	</c:when>
	<c:otherwise>
		<c:out value="You are NOT eligible for home loan"></c:out>
	</c:otherwise>
</c:choose>








</body>
</html>