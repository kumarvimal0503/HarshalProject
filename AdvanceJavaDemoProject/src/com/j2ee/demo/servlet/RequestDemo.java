package com.j2ee.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDemo")
public class RequestDemo extends HttpServlet{

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String comp = request.getParameter("comp");
		
		ServletOutputStream out = response.getOutputStream();
		out.println("<h1>Hello "+name+"</h1>");
		out.println("<h1>Company Name "+comp+"</h1>");
		
		request.getParameterNames(); //ALl the params sent by client
		
		request.getParameterMap(); //Returns all the params as hash map 
		request.getRequestURL();
		request.getQueryString();
		request.getMethod(); // Return get/post/delete
		request.getRequestURI(); //
		request.getProtocol();
		request.getContextPath(); // returns /AdvanceJavaDemo
		
		request.getContentType(); 
		
		request.getLocalAddr(); // returns the IP Address of Server
		
		response.setContentType("text/html");
		PrintWriter io = response.getWriter();
		io.println("<h1>Social Media: Facebook</h1>");
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
	
	
}
