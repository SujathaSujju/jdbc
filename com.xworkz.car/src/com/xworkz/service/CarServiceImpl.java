package com.xworkz.service;

import java.util.ArrayList;

import com.xworkz.carDto.CarDto;
import com.xworkz.repository.CarRepository;
import com.xworkz.repository.CarRepositoryImpl;

public class CarServiceImpl implements CarService{

	CarRepository repo = new CarRepositoryImpl();
	
	@Override
	public boolean save(CarDto dto) {
      if(dto!=null) {
    	  if(dto.getColour().length()>=3) {
    		  System.out.println("data saved");
    		  boolean Repo =  repo.save(dto);
    		   return Repo;
    	  }
      }
		return false;
	}

	@Override
	public ArrayList<CarDto> read() {
		return repo.read();
	}

	@Override
	public ArrayList<CarDto> findByName(String name) {
       if(name!=null) {
    	   if(name.length()>=3) {
    		ArrayList<CarDto> Name =  repo.findByName(name);
    		return Name;
    	   }
    	   else {
    		   System.out.println("name not found");
    		   
    	   }
       }
		return null;
	}


	

}
