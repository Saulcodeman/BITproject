package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//		
		throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("asdf") && pwd.equals("1234")) {
			//id�� password�� ��ġ�ϴ� ���
			response.sendRedirect("/DC.html");
		} else {
			//id�� password�� ��ġ���� �ʴ� ���
			request.setAttribute("msg", "id �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");//request��ü�� �޽����� ����
			
			RequestDispatcher reqDis = request.getRequestDispatcher("/loginForm.jsp");
			reqDis.forward(request,  response);
		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, "+id+".</h1>");
		out.println("<h1>your password is "+pwd+".</h1>");
	
		out.println("</body>");
		out.println("</html>");
	}
		
}