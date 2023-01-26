package main.java.com.xworkz.carrom;

import main.java.com.xworkz.carrom.dto.CarromDto;
import main.java.com.xworkz.carrom.service.CarromService;
import main.java.com.xworkz.carrom.service.CarromServiceImpl;

public class CarromTester {

	public static void main(String args[]) {
		
		CarromService service = new CarromServiceImpl();
		
		CarromDto dto1 = new CarromDto(1, "golden", 1000, "32 inch", "black");
		CarromDto dto2 = new CarromDto(2, "precise", 2000, "30 inch", "grey");
		CarromDto dto3 = new CarromDto(3, "siscaa", 1500, "28 inch", "red");
		CarromDto dto4 = new CarromDto(4, "professional", 1800, "26 inch", "yellow");
		CarromDto dto5 = new CarromDto(5, "korners", 1600, "24 inch", "green");
		
//		boolean status = service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		System.out.println(status);
		
//		System.out.println(service.findbyid(2));
		
//		System.out.println(service.updateNameById("VLT", 1));
		
		System.out.println(service.deleteById(2));
		
		
		
		
		
		
	}
}
