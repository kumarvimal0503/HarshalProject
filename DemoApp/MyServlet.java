package com.demo;

import javax.servlet.*;
import java.io.IOException;


public class MyServlet implements Servlet {
	
	public void init(ServletConfig config){
	}
	
	public void service(ServletRequest request, ServletResponse response)
	throws ServletException, IOException{
	
		//System.out.println("Hello Servlet");
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<h1>Hello Servlet</h1>");
	
	}
	
	public String getServletInfo(){
		return null;
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
	
	public void destroy(){
	
	}
	
}