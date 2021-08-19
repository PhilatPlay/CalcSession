package com.polosess;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("navbar.html").include(request, response);
		
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		
		if(username.equals("admin") && userpass.equals("123")) {
			out.println("You are successfully logged in!");
			out.println("<br>Welcome "+ username);
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
		}else {
			out.println("Sorry! invalid details");
			RequestDispatcher rd =  request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		out.close();		
	}

}
