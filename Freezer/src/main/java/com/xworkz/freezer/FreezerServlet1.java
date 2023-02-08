package com.xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet1")
public class FreezerServlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h2>hello</h2>");
		writer.print("<h1>this is from servlet 1</h1>");
		
		
	}
}
