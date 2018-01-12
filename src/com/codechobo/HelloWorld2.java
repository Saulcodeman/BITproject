package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2")
public class HelloWorld2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter(); //ctrl+shift+o
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<script>");
		
		out.print("</script>");
		out.print("<script>");
		out.print("document.getElementById('D1').src");
		out.print("</script>");
		out.print("</head>");
		
		out.print("<body>");
//		for(int z=1; z<7; z++) {
////			z=(int)(Math.random()*5);
//		out.print("<img \\dice"+z+".jpg");
//		out.print("<img id='D1' src=C:\\dice\\dice1.jpg>");
//		out.print("<img src=C:\\dice\\dice2.jpg>");
//		}
//		out.print("<img src=\"https://mdn.mozillademos.org/files/13687/HTTP_Request.png\">");
		
		int i;
		int j;
		int sum = 0;
			for(j=0; j<2; j++) { 
				i=(int)(Math.random()*6+1);
				out.print("<img id=\"D1\" src=images/dice"+i+".jpg>");
				
				sum += i; 
			}	out.print(sum);									//dice 123456랜덤
		
		
		out.print("<img src=https://mdn.mozillademos.org/files/13687/HTTP_Request.png>");
		
		out.print("</body>");
		
		out.print("</html>");
	}
	//post요청이들어오면 get으로처리한다
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
