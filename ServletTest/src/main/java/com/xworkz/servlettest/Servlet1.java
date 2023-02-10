package com.xworkz.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet1")
public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<h1>hiii</h1>");
		writer.print("<h1>this is from first servlet</h1>");
		
//		request.getRequestDispatcher("/servlet2").include(request, response);
		
		request.getRequestDispatcher("/servlet2").forward(request, response);
	}
	
}
