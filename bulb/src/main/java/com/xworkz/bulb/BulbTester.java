package main.java.com.xworkz.bulb;

import java.util.List;

import main.java.com.xworkz.bulb.dto.BulbDto;
import main.java.com.xworkz.bulb.service.BulbService;
import main.java.com.xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {

	public static void main(String[] args) {
		
		BulbService service = new BulbServiceImpl();
		
		BulbDto dto1 = new BulbDto(1, "bajaj", "220 volts", "LED", "WHITE");
		BulbDto dto2 = new BulbDto(2, "fiem", "210 volts", "LCD", "BLACK");
		BulbDto dto3 = new BulbDto(3, "GEs", "200 volts", "LAMP", "GREEN");
		BulbDto dto4 = new BulbDto(4, "havells", "300 volts", "BASE", "GREY");
		BulbDto dto5 = new BulbDto(5, "HPL", "150 volts", "LED", "YELLOW");
		BulbDto dto6 = new BulbDto(6, "osram", "180 volts", "CANDLE", "BLUE");
		BulbDto dto7 = new BulbDto(7, "philips", "200 volts", "GLOBE", "VIOLET");
		BulbDto dto8 = new BulbDto(8, "surya", "320 volts", "FLUORESCENT", "PURPLE");
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
//		service.save(dto7);
//		service.save(dto8);
		
//		System.out.println(service.readAll());
//		List<BulbDto> list=service.readAll();
//		for (BulbDto bulbDto : list) {
//			System.out.println(bulbDto);
//		}
		System.out.println(service.findByName("HPL"));

	}
}
