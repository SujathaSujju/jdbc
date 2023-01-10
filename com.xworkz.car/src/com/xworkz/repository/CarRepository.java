package com.xworkz.repository;

import java.util.ArrayList;

import com.xworkz.carDto.CarDto;

public interface CarRepository {

	
public boolean save(CarDto dto);
	
	public ArrayList<CarDto> read();
	
	public ArrayList<CarDto> findByName(String name);
	

	
}
