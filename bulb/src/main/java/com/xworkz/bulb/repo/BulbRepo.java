package main.java.com.xworkz.bulb.repo;

import java.util.List;

import main.java.com.xworkz.bulb.dto.BulbDto;

public interface BulbRepo {


	public boolean save(BulbDto dto);
	
	public List<BulbDto> readAll();
	
	public BulbDto findByName(String name);
}
