package com.j2ee.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ObjectScopeDemo
 */
@WebServlet("/ObjectScopeDemo")
public class ObjectScopeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = getServletContext();
		
		
		if(userName != null) {
			request.setAttribute("userName", userName);
			session.setAttribute("userName", userName);
			context.setAttribute("userName", userName);
		}
		
		out.println("<h1>Request Scope: "+request.getAttribute("userName")+"</h1>");
		out.println("<h1>session Scope: "+session.getAttribute("userName")+"</h1>");
		out.println("<h1>Application Scope: "+context.getAttribute("userName")+"</h1>");
		
		
	}

}
