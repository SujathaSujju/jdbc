package com.xworkz.carDto;

import com.xworkz.service.CarService;
import com.xworkz.service.CarServiceImpl;

public class CarRunner {

	public static void main(String args[]) {
		
		CarService service = new CarServiceImpl();
		
		CarDto sedan = new CarDto("Toyoto",700000,"black","sedan",60);
		CarDto SUV = new CarDto("suzuki",750000,"green","SUV",50);
		CarDto creta = new CarDto("hyundai",700000,"red","creta",62);
		CarDto GRSupra = new CarDto("Toyoto",900000,"grey","GRSupra",55);
		CarDto ertiga = new CarDto("maruti",650000,"white","ertiga",52);
		
		service.save(sedan);
		service.save(SUV);
		service.save(creta);
		service.save(GRSupra);
		service.save(ertiga);
		
		System.out.println(service.read());
		service.findByName("Toyoto");
		
	}
	
}
