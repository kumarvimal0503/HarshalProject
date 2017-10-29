package com.j2ee.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayUserInfoServlet
 */
@WebServlet("/DisplayUserInfoServlet")
public class DisplayUserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		
		
		request.setAttribute("date", new Date());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("GetUserInfoServlet");
		
		PrintWriter pr =  response.getWriter();
		
		pr.println("User Information: ");
		
		//dispatcher.forward(request, response);
		
		response.sendRedirect("GetUserInfoServlet?userName="+userName);
		
	}

}
