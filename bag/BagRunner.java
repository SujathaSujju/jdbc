package com.xworkz.bag;

import com.xworkz.bag.repository.BagRepo;
import com.xworkz.bag.repository.BagRepoImpl;

public class BagRunner {

	public static void main(String args[]) {
		
		BagRepo repo = new BagRepoImpl();
		
		BagDto DTO = new BagDto(10,"america","grey",900,"12L");
		BagDto DTO1 = new BagDto(11,"safari","brown",1000,"14L");
		BagDto DTO2 = new BagDto(12,"whitecraft","red",1200,"15L");
		BagDto DTO3 = new BagDto(13,"vip","orange",700,"11L");
		
		repo.save(DTO);
		repo.save(DTO1);
		repo.save(DTO2);
		repo.save(DTO3);
		
		System.out.println(repo.read());
		
		System.out.println(repo.findByName("vip"));
		
		System.out.println(repo.findByNameAndId("whitecraft", 04));
		
	}
	
}
