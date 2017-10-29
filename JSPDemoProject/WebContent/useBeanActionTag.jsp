<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<jsp:useBean id="student" class="com.jsp.bean.Student"></jsp:useBean>
		
		<%-- <jsp:setProperty property="rollNo" name="student" value="982374"/>
		<jsp:setProperty property="name" name="student" value="Harshal"/> --%>

		<%-- <jsp:setProperty property="rollNo" name="student" param="myRollNo"/>
		<jsp:setProperty property="name" name="student" param="myName"/> --%>
		
		<%-- <jsp:setProperty property="rollNo" name="student" />
		<jsp:setProperty property="name" name="student"/> --%>
		
		<jsp:setProperty property="*" name="student" />


		Roll No> <jsp:getProperty property="rollNo" name="student"/><br>
		Name> <jsp:getProperty property="name" name="student"/>

		<br>
		<%="Student Info: "+student.getInfo()%>


</body>
</html>