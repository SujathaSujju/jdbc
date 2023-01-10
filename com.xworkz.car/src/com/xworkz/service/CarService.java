package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.carDto.CarDto;

public interface CarService {

	public boolean save(CarDto dto);
	
	public ArrayList<CarDto> read();
	
	public ArrayList<CarDto> findByName(String name);
	

	
	
	
}
