package com.xworkz.shoes.Repository;

import com.xworkz.shoes.Shoesdto.ShoesDto;

public interface ShoesRepo {

	public boolean save(ShoesDto dto);
	
	public ShoesDto read();
	
	public ShoesDto findByName(String name);
	
	public ShoesDto findByNameAndId(String name,int id);
}
