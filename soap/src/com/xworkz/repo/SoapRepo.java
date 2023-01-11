package com.xworkz.repo;

import java.util.List;

import com.xworkz.dto.SoapDto;

public interface SoapRepo {

	public boolean save(SoapDto dto);
	
	public List<SoapDto> read();
	
	public SoapDto findByNameAndPrice(String name,int price);
	
	public boolean updateNameByPrice(String name,int price);
	
	public boolean updatecolourAndFragranceByName(String colour,String fragrance,String name);
	
	public boolean updateTypeById(String type,int id);
	
	
}
