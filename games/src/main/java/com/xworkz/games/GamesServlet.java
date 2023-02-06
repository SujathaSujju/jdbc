package com.xworkz.games;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/form")
public class GamesServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.print("<html><body>");
		writer.print("<form action='form' method='Post'>");
		writer.println("<div>name :<input type='text' name='name'></div>");
		writer.println("<div>email :<input type='text' name='email'></div>");
		writer.print("<button type='submit' name='submit'>submit</button></form>");
		writer.print("</html></body>");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<h1>submitted successfully</h1>");
		writer.println("name: " +name);
		writer.println("email: " +email);
		System.out.println("name: " +name);
		System.out.println("email: " +email);
	}
}
