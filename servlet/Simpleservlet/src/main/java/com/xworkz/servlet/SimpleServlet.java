package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/simple")
public class SimpleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.print("<html><body>");
		writer.print("<h1>this is servlet program</h1>");
		writer.print("</body></html>");

	}

}
