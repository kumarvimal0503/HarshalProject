package com.j2ee.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		//Cookie[] cookies = request.getCookies();
		HttpSession session = request.getSession(false);
		
		//if(cookies == null || !"userName".equals(cookies[0].getName())) {
		if(session == null) {
			response.sendRedirect("login.html");
			return;
		}
		
		//Cookie cookie = cookies[0];
		// String userName = cookie.getValue();
		String userName = (String) session.getAttribute("userName");
		
		
		out.println("<h1>Welcome "+userName+"</h1>");
	}

}
