package main.java.com.xworkz.chocolate.service;

import java.util.List;

import main.java.com.xworkz.chocolate.dto.ChocolateDto;
import main.java.com.xworkz.chocolate.repo.ChocolateRepo;
import main.java.com.xworkz.chocolate.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {

	ChocolateRepo repo = new ChocolateRepoImpl();
	
	@Override
	public boolean save(ChocolateDto dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
			return repo.save(dto);
		}
		return false;
	}

	@Override
	public List<ChocolateDto> readAll() {
		return repo.readAll();
		
	}

	@Override
	public boolean findByColorAndWeight(String color, String weight) {
		if(color.length()>2 && weight!=null) {
			System.out.println("VALID");
			return repo.findByColorAndWeight(color, weight);
		}
		return false;
	}

	@Override
	public boolean findByPriceAndName(int price, String name) {
		if(price<500 && name!=null) {
			System.out.println("VALID");
			return repo.findByPriceAndName(price, name);
		}
		return false;
	}

	@Override
	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
		if(weight!=null &&name.length()>2 && color!=null) {
			System.out.println("valid");
			return repo.updateWeightByNameAndColor(weight, name, color);
		}
		return false;
	}

	@Override
	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		if(name!=null && id>0 && weight.length()>2) {
			System.out.println("valid");
			return repo.updateNameByIdAndWeight(name, id, weight);
		}
		return false;
	}

	@Override
	public boolean deleteByColorAndName(String color, String name) {
		if(color!=null && name!=null) {
			System.out.println("valid");
			return repo.deleteByColorAndName(color, name);
		}
		return false;
	}
	
}
