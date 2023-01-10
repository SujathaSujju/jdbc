package com.xworkz.institute;

import com.xworkz.Instituteservice.InstituteService;
import com.xworkz.Instituteservice.InstituteServiceImpl;

public class InstituteRunner {

	public static void main(String args[]) {
		
		InstituteService service = new InstituteServiceImpl();
		
		
		InstituteDto xworkz = new InstituteDto("xworkz","BTM",5,40,"java",5);
		InstituteDto Jspider = new InstituteDto("Jspider","JP Nagar",6,50,"sql",4);
		InstituteDto edubridge = new InstituteDto("edubridge","Banashankari",10,30,"vb",3);
		InstituteDto greatcoders = new InstituteDto("greatcoders","BTM",20,50,"c",4);
		InstituteDto palleTechnology = new InstituteDto("palleTechnology","Bannerghatta",15,35,"c++",3);
		
		service.save(xworkz);
		service.save(Jspider);
		service.save(edubridge);
		service.save(greatcoders);
		service.save(palleTechnology);
		
		System.out.println(service.read());
		
		System.out.println(service.findByNameAndCourse("xworkz", "java"));
		
		System.out.println(service.findByLocationAndRating("BTM", 4));
		
		System.out.println(service.updateLocationByIndex("JP Nagar", 3));
		
		System.out.println(service.updateCourseByName("testing", "Jspider"));
		
		System.out.println(service.deleteByRating(3));
	
		
	}
}
