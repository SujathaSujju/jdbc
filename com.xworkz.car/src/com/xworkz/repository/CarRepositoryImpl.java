package com.xworkz.repository;

import java.util.ArrayList;

import com.xworkz.carDto.CarDto;

public class CarRepositoryImpl implements CarRepository{

	ArrayList<CarDto> DTO = new ArrayList<CarDto>();
	
	@Override
	public boolean save(CarDto dto) {
      DTO.add(dto);
		return true;
	}

	@Override
	public ArrayList<CarDto> read() {
		System.out.println("data successfully validated");
       return DTO;
       
       
	}

	@Override
	public ArrayList<CarDto> findByName(String name) {
		System.out.println("name found");
      return DTO;
	}



	

}
