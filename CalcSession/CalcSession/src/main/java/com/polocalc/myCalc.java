package com.polocalc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class myCalc extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Hello, let my calculator 'serve' you");
		
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		
		out.println("<h1>Results: </h1>");
		out.println("<h1>Added: "+ (firstNum + secondNum) +"</h1>");
		out.println("<h1>Subtracted: "+ (firstNum - secondNum) +"</h1>");
		out.println("<h1>Multiplied: "+ (firstNum * secondNum) +"</h1>");
		out.println("<h1>Divided: "+ (firstNum / secondNum) +"</h1>");
//		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
//		rd.include(req, res);
		
		}
	}
	

