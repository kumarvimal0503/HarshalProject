package com.j2ee.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/SecondServlet",loadOnStartup=0,
initParams={@WebInitParam(name="address", value="Nyati Estate Road")})
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletConfig config = null;
	
	static {
		
		System.out.println("=============Servlet Loaded==============");
		
	}
	
	public SecondServlet() {
		System.out.println("=============Servlet Instantiated==============");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		this.config = config;
		super.init(config);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		ServletOutputStream out = response.getOutputStream();
		out.println("<h1>Hello Servlet</h1>");
		
		out.println("<h1>Hello Servlet</h1>");
		out.println("<h1>Servlet Name: "+getServletConfig().getServletName()+"</h1>");
		out.println("<h1>Address: "+getServletConfig().getInitParameter("address")+"<h1>");
		
		
		out.println("<h1>=====================================================</h1>");
		
		ServletContext context = getServletContext();
		
		out.println("<h1>DB Name: "+context.getInitParameter("DBName")+"<h1>");
		
	}
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		ServletOutputStream out = response.getOutputStream();
		out.println("<h1>Hello Servlet: POST</h1>");
		
	}
	
	
}
