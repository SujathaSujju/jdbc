package com.xworkz.soap;

import java.util.List;

import com.xworkz.dto.SoapDto;
import com.xworkz.repo.SoapRepo;
import com.xworkz.repo.SoapRepoImpl;

public class SoapRunner {

	public static void main(String args[]) {
		
		SoapRepo repo = new SoapRepoImpl();
		
		SoapDto dto1 = new SoapDto(2, "dove", "white", "milk", 25, "10 oct,2022", "human", 40);
		SoapDto dto2 = new SoapDto(3, "patanjali", "pink", "sandal", 15, "10 nov,2022", "human",50);
		SoapDto dto3 = new SoapDto(4, "liril", "blue", "lime", 30, "11 jan,2022", "human", 25);
		SoapDto dto4 = new SoapDto(5, "pears", "yellow", "berry", 35, "15 feb,2022", "human", 45);
		SoapDto dto5 = new SoapDto(6, "fiama", "green", "avacoda", 25, "18 march,2022", "human", 20);
		SoapDto dto6 = new SoapDto(7, "castile", "brown", "natural", 10, "31 oct,2022", "animal", 30);
		SoapDto dto7 = new SoapDto(8, "iilio", "orange", "glycerine", 75, "20 sep,2022", "animal", 60);
		SoapDto dto8 = new SoapDto(9, "anti tick", "grey", "coriand", 30, "19 april,2022", "animal", 80);
		SoapDto dto9 = new SoapDto(10, "rin", "blue", "neem", 40, "25 aug,2022", "clothes", 50);
		SoapDto dto10 = new SoapDto(11, "wheel", "green", "lemon", 32, "02 aug,2022", "clothes", 55);
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
//		repo.save(dto10);
//		
//		List<SoapDto> data = repo.read();
//		for (SoapDto soapDto : data) {
//			System.out.println(soapDto);
//		}
		
//		System.out.println(repo.findByNameAndPrice("liril", 25));
		
//		System.out.println(repo.updateNameByPrice("patanjali", 10));

		
		System.out.println(repo.updatecolourAndFragranceByName("green", "lime", "wheel"));
		
		
		System.out.println(repo.updateTypeById("animal", 1));
		System.out.println(repo.read());
		
	}
	
}
