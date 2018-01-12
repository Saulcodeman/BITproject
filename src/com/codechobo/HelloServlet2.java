package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="/HelloServlet", urlPatterns= { "*.do", "/login/*"})
public class HelloServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, "+id+".</h1>");
		out.println("<h1>your password is "+pwd+".</h1>");
		out.println("<h1>count="+ ++count +".</h1>");
		out.println("<head>");
		out.println("</body>");
	}
		
}
