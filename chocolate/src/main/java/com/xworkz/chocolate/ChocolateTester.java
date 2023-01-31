package main.java.com.xworkz.chocolate;

import main.java.com.xworkz.chocolate.dto.ChocolateDto;
import main.java.com.xworkz.chocolate.service.ChocolateService;
import main.java.com.xworkz.chocolate.service.ChocolateServiceImpl;

public class ChocolateTester {

	public static void main(String[] args) {
		
	
	ChocolateService service = new ChocolateServiceImpl();
	
	ChocolateDto dto1 = new ChocolateDto(1, "kitkat", 40, "30g", "brown");
	ChocolateDto dto2 = new ChocolateDto(2, "milkybar", 10, "15g", "white");
	ChocolateDto dto3 = new ChocolateDto(3, "dairy milk", 100, "40g", "chocolate");
	ChocolateDto dto4 = new ChocolateDto(4, "perk", 20, "35g", "black");
	ChocolateDto dto5 = new ChocolateDto(5, "munch", 15, "25g", "silver");
	
//	service.save(dto1);
//	service.save(dto2);
//	service.save(dto3);
//	service.save(dto4);
//	service.save(dto5);
	
//	System.out.println(service.readAll());
	
//	service.findByColorAndWeight("brown", "30g");
	
//	service.findByPriceAndName(10, "milkybar");
	
//	service.updateWeightByNameAndColor("10g", "milkybar", "white");
	
//	service.updateNameByIdAndWeight("dark", 4, "35g");
	
	service.deleteByColorAndName("silver", "munch");
	
	
	
	}	
	
}
