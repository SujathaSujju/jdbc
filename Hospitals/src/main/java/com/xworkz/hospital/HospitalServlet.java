package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

@WebServlet(value="/save")
public class HospitalServlet extends HttpServlet{
	
	HospitalService service = new HospitalServiceImpl();

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title></title>\r\n"
				+ "        <style>\r\n"
				+ "            input{\r\n"
				+ "                margin: 10px;\r\n"
				+ "                padding: 10px;\r\n"
				+ "            }\r\n"
				+ "        </style>\r\n"
				+ "\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        \r\n"
				+ "        <div style=\"text-align: center;\">\r\n"
				+ "            <form action=\"save\" method=\"post\">\r\n"
				+ "                <h1>Hospital details</h1>\r\n"
				+ "                <div><input type=\"text\" name=\"name\" placeholder=\"Name\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"noOfDoctors\" placeholder=\"No of nurse\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"noOfwards\" placeholder=\"specialization\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"specialistIn\" placeholder=\"No of doctors\"></div>\r\n"
				+ "                <div><input type=\"text\" name=\"noOfNurses\" placeholder=\"No of Patients\"></div>\r\n"
				+ "                <button type=\"submit\">Submit</button>\r\n"
				+ "\r\n"
				+ "            </form>\r\n"
				+ "        </div>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
		
		
		
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		

		 String name=request.getParameter("name");
		 String location=request.getParameter("location");
		 String noOfDoctors=request.getParameter("noOfDoctors");
		 String noOfwards=request.getParameter("noOfwards");
		 String specialistIn=request.getParameter("specialistIn");
		 String noOfNurses=request.getParameter("noOfNurses");
		 
		 HospitalDto dto1= new HospitalDto(name, location, noOfDoctors, noOfwards, specialistIn, noOfNurses);
		 String status= service.save(dto1);
		 PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		 writer.print(status);	
	}
}
