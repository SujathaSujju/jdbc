package main.java.com.xworkz.spects.service;

import java.util.List;

import main.java.com.xworkz.spects.dto.SpectsDto;
import main.java.com.xworkz.spects.repo.SpectsRepo;
import main.java.com.xworkz.spects.repo.SpectsRepoImpl;

public class SpectsServiceImpl implements SpectsService{

	SpectsRepo repo = new SpectsRepoImpl();
	
	@Override
	public boolean save(SpectsDto dto) {
      if(dto!=null) {
    	  System.out.println("dto is not null");
    	  return repo.save(dto);
      }
		
		return false;
	}

	@Override
	public List<SpectsDto> readAll() {
       
		return repo.readAll();
	}

	@Override
	public boolean findById(int id) {
       if(id>0) {
    	   System.out.println("id is valid");
    	   return repo.findById(id);
       }
		return false;
	}

	@Override
	public boolean findByShapeAndPrice(String shape, int price) {
		if(shape.length()>2 && price>500) {
			System.out.println("data is valid");
			return repo.findByShapeAndPrice(shape, price);
		}
		return false;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		if(price<5000 && name!=null) {
			System.out.println("valid");
			return repo.updatePriceByName(price, name);
		}
		return false;
	}

	@Override
	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if(color!=null && price>100 && shape!=null) {
			System.out.println("valid");
			return repo.updateColorByPriceAndShape(color, price, shape);
		}
		return false;
	}

	@Override
	public boolean deleteByPriceAndColor(int price, String color) {
		if(price>500 && color!=null) {
			System.out.println("valid");
			return repo.deleteByPriceAndColor(price, color);
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndId(String name, int id) {
		if(name.length()>2 && id>0) {
			System.out.println("valid");
			return repo.deleteByNameAndId(name, id);
		}
		
		return false;
	}

}
