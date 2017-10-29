package com.j2ee.demo.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet  extends HttpServlet{
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String userName = request.getParameter("userName");
		String passkey = request.getParameter("passkey");
		
		
		if("12345".equals(passkey)){
			//Cookie cookie = new Cookie("userName", userName);
			//response.addCookie(cookie);
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			response.sendRedirect("HomeServlet");
		} else {
			response.sendRedirect("error.html");
		}
	}
	
}