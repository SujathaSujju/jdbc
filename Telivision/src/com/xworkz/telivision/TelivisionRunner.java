package com.xworkz.telivision;

import java.util.Iterator;

import service.TelivisionService;
import service.TelivisionServiceImpl;

public class TelivisionRunner {

	public static void main(String args[]) {
		
		TelivisionService service = new TelivisionServiceImpl();
		
		TelivisionDto LG = new TelivisionDto("LG","42 inch",80000,"black","LED","LG UQ75");
		TelivisionDto samsung = new TelivisionDto("samsung","32 inch",90000,"grey","OLED","samsung 2m");
		TelivisionDto sony = new TelivisionDto("sony","43 inch",85000,"white","CURVED","sony bravia");
		TelivisionDto tcl = new TelivisionDto("tcl","55 inch",50000,"green","OTT","tcl 4K");
		TelivisionDto vizio = new TelivisionDto("vizio","65 inch",95000,"black","OLED","vizio m6");
		
		service.save(LG);
		service.save(samsung);
		service.save(sony);
		service.save(tcl);
		service.save(vizio);
		
		
		System.out.println(service.read());
		
		
	   System.out.println(service.findByNameAndSize("tcl", "55 inch"));
	   
	  service.findTypeAndColourByIndex("LED", "black", 0);
	   
	
		service.updateSizeByType("42 inch", "CURVED");
		
	}
	
}
