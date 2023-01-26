package main.java.com.xworkz.carrom.repo;

import main.java.com.xworkz.carrom.dto.CarromDto;

public interface CarromRepo {

	public boolean save(CarromDto dto);
	
	public CarromDto findbyid(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);
}
