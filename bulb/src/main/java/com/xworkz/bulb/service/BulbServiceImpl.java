package main.java.com.xworkz.bulb.service;

import java.util.List;

import main.java.com.xworkz.bulb.dto.BulbDto;
import main.java.com.xworkz.bulb.repo.BulbRepo;
import main.java.com.xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbService {

	BulbRepo repo = new BulbRepoImpl();
	
	@Override
	public boolean save(BulbDto dto) {
		if(dto!=null) {
			System.out.println("data is not null");
			 repo.save(dto);
			 return true;
			
		}
		return false;
	}

	public List<BulbDto> readAll() {
		return repo.readAll();
		
	}

	@Override
	public BulbDto findByName(String name) {
		if(name!=null) {
			return repo.findByName(name);
		}
		return null;
	}
	
}
