<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HI JSP</h1>
	
	Server Date
	
	<%
		String name = "Harshal";		
		out.println(new Date());
		
	%>	
	
	<br>
	<%= "Hello  "+name  %>
	
	<br>
	<%= "Addition of 5 and 10:  "+ add (5, 10)%>
	
	
	<%! 
		public int add(int a , int b){
			return (a + b);
		}
	
	
	%>
	
</html>