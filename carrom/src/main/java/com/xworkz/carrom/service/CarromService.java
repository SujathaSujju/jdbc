package main.java.com.xworkz.carrom.service;

import main.java.com.xworkz.carrom.dto.CarromDto;

public interface CarromService {

	public boolean save(CarromDto dto);
	
	public CarromDto findbyid(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);
	
	
	
}
