package com.xworkz.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/getpost")
public class ServletGetPost extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("<form action='getpost' method='Post'>");
		writer.print("<div> firstname : <input type='text' name='firstname'></div>" );
		writer.print("<div> lastname :<input type ='text' name='lastname'></div>");
		writer.print("<div> email :<input type ='email' name='email'></div>");
		writer.print("<div>password :<input type ='password' name='password'></div>");
		writer.print("<button type='submit' name='submit'>submit</button></form>");
		writer.print("</body></html>");
		
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
        response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<h1>data submitted successfully</h1>");
		writer.println("<h4>firstname:</h4> " +firstname+"\n");
		writer.println("<h4>lastname: </h4>" +lastname);
		writer.println("<h4>email: </h4>" +email);
		writer.println("<h4>password:</h4> " +password);
		
		System.out.println("firstname: " +firstname);
		System.out.println("lastname: " +lastname);
		System.out.println("email: " +email);
		System.out.println("password: " +password);
		
	}
	
}
