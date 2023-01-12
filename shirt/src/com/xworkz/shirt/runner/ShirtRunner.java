package com.xworkz.shirt.runner;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.repo.ShirtRepo;
import com.xworkz.shirt.repo.ShirtRepoImpl;

public class ShirtRunner {

	    public static void main(String args[]) {
		
		ShirtRepo repo = new ShirtRepoImpl();
		
		ShirtDto dto = new ShirtDto(1, "roadstar", "green", "XL", true);
		ShirtDto dto1 = new ShirtDto(2, "allensiley", "black", "L", false);
		ShirtDto dto2 = new ShirtDto(3, "vanheusen", "red", "XXL", true);
		ShirtDto dto3 = new ShirtDto(4, "zara", "grey", "S", false);
		ShirtDto dto4 = new ShirtDto(5, "dnmx", "white", "M", true);
		
		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);
		
		System.out.println(repo.findNameAndId("roadstar", 1));
		
		System.out.println(repo.updateSizeByName("L", "vanheusen"));
		
		System.out.println(repo.deleteByColour("black"));
		
		System.out.println(repo.deleteBySizeAndName("XL", "roadstar"));
		
		 List<ShirtDto> DTO= repo.read();
		 for (ShirtDto read : DTO) {
			 
			 System.out.println(read);
			 
			 }
	}
}
