package main.java.com.xworkz.spects;

import main.java.com.xworkz.spects.dto.SpectsDto;
import main.java.com.xworkz.spects.service.SpectsService;
import main.java.com.xworkz.spects.service.SpectsServiceImpl;

public class SpectsTester {

	public static void main(String[] args) {
		
		SpectsService service = new SpectsServiceImpl();
		
		SpectsDto dto1 = new SpectsDto(1, "Ray-Ban", "black", "round", 1000);
		SpectsDto dto2 = new SpectsDto(2, "oakley", "grey", "square", 1500);
		SpectsDto dto3 = new SpectsDto(3, "XOXO", "brown", "rectangle", 1800);
		SpectsDto dto4 = new SpectsDto(4, "gucci", "white", "eclipse", 2000);
		SpectsDto dto5 = new SpectsDto(5, "persol", "cement", "circle", 2500);
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		
		
//		for (SpectsDto string : service.readAll()) {
//			System.out.println(string);
//	}
		
//		System.out.println(service.findById(1));
		
//		service.findByShapeAndPrice("round", 1000);
		
//		service.updatePriceByName(4000, "Ray-Ban");
		
//		service.updateColorByPriceAndShape("green", 1500, "square");
		
//		service.deleteByPriceAndColor(2500, "cement");
		
		service.deleteByNameAndId("XOXO", 3);
		
}
}
