package main.java.com.xworkz.carrom.service;

import main.java.com.xworkz.carrom.dto.CarromDto;
import main.java.com.xworkz.carrom.repo.CarromRepo;
import main.java.com.xworkz.carrom.repo.CarromRepoImpl;

public class CarromServiceImpl implements CarromService{

	CarromRepo repo = new CarromRepoImpl();
	
	@Override
	public boolean save(CarromDto dto) {
		if(dto!=null) {
			System.out.println("data is not null,sending to repo");
			return repo.save(dto);
		}
		System.out.println("data is null");
		return false;
	}

	
	
	@Override
	public CarromDto findbyid(int id) {
		if(id>0) {
			System.out.println("id is valid");
			return repo.findbyid(id);
		}
		return null;
	}



	@Override
	public boolean updateNameById(String name, int id) {
		if(name.length()>2 && id>0) {
			System.out.println("data is valid");
			return repo.updateNameById(name, id);
		}
		return false;
	}



	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("id is valid");
			return repo.deleteById(id);
		}
		return false;
	}

	
	
}
