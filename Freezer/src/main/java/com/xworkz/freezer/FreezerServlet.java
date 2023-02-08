package com.xworkz.freezer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/servlet")
public class FreezerServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		request.getRequestDispatcher("/servlet1").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.print("this is from servlet");
//		request.getRequestDispatcher("/servlet1").include(request, response);
	}
	
}
