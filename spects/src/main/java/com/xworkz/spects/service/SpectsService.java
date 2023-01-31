package main.java.com.xworkz.spects.service;

import java.util.List;

import main.java.com.xworkz.spects.dto.SpectsDto;

public interface SpectsService {

	public boolean save(SpectsDto dto);
	
	public List<SpectsDto> readAll();
	
	public boolean findById(int id);
	
	public boolean findByShapeAndPrice(String shape,int price);
	
	public boolean updatePriceByName(int price,String name);
	
	public boolean updateColorByPriceAndShape(String color,int price,String shape);
	
	public boolean deleteByPriceAndColor(int price,String color);
	
	public boolean deleteByNameAndId(String name,int id);
	
	
	
}
