<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1", isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String userName = request.getParameter("userName");
		
		if(userName != null){
			pageContext.setAttribute("userName", userName,PageContext.REQUEST_SCOPE);
			pageContext.setAttribute("userName", userName,PageContext.SESSION_SCOPE);
			pageContext	.setAttribute("userName", userName,PageContext.APPLICATION_SCOPE);
		}
	%>
	
	<%= "Request Level User Name: "+pageContext.getAttribute("userName",PageContext.REQUEST_SCOPE) %> <br>
	<%= "Session Level User Name: "+pageContext.getAttribute("userName",PageContext.SESSION_SCOPE) %> <br>
	<%= "Application Level User Name: "+pageContext.getAttribute("userName",PageContext.APPLICATION_SCOPE) %> <br>
	
	


</body>
</html>