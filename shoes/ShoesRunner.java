package com.xworkz.shoes;

import com.xworkz.shoes.Repository.ShoesRepo;
import com.xworkz.shoes.Repository.ShoesRepoImpl;
import com.xworkz.shoes.Shoesdto.ShoesDto;

public class ShoesRunner {

	public static void main(String[] args) {
		
		ShoesRepo repo = new ShoesRepoImpl();
		
		ShoesDto DTO = new ShoesDto(100,"puma",9,"white",999);
		ShoesDto DTO1 = new ShoesDto(200,"rebook",8,"grey",900);
		ShoesDto DTO2 = new ShoesDto(300,"bata",10,"green",1200);
		ShoesDto DTO3 = new ShoesDto(400,"woodland",6,"blue",1100);
//		
//		repo.save(DTO);
//		repo.save(DTO1);
//		repo.save(DTO2);
//		repo.save(DTO3);
//		
//		repo.read();
//		
//	     System.out.println(repo.findByName("bata"));
	     
	     System.out.println(repo.findByNameAndId("puma", 100));
	}
	
}
