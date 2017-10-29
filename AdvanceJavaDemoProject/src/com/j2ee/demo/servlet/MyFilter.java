package com.j2ee.demo.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//PrintWriter out=response.getWriter();  
	    System.out.println("filter is invoked before");  
	          
	    chain.doFilter(request, response);//sends request to next resource  
	          
	    System.out.println("filter is invoked after");  
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
