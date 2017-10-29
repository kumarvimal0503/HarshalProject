package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.business.LoginCheck;
import com.business.exception.UserNotFoundException;
import com.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private LoginCheck loginCheck = new LoginCheck();
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		
		String userName = request.getParameter("userName");
		
		String passKey = request.getParameter("pass");
		
		try {
			boolean loginFlag = loginCheck.checkLogin(userName, passKey);
			if(loginFlag){
				User user = loginCheck.getUserInfo(userName); 
				HttpSession session = request.getSession();
				session.setAttribute("userObj", user);
				response.sendRedirect("home.jsp");
			} else {
				response.sendRedirect("error.jsp?message=Invalid email-id/pass");
			}
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp?message=User Not Found");
		}
		
		
		
		
		
	}
	
	
}
