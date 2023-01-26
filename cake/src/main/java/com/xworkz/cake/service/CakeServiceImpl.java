package main.java.com.xworkz.cake.service;

import java.util.List;

import main.java.com.xworkz.cake.dto.CakeDto;
import main.java.com.xworkz.cake.repo.CakeRepo;
import main.java.com.xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {

	CakeRepo repo = new CakeRepoImpl();

	@Override
	public boolean save(CakeDto dto) {

		if (dto != null) {
			System.out.println("valid");

			return repo.save(dto);

		}

		return false;
	}

	@Override
	public CakeDto findById(int id) {

		if (id > 0) {
			return repo.findById(id);

		}

		return null;
	}
	
	

	@Override
	public boolean updateNameById(String name, int id) {
		if (name.length() > 2 && id > 0) {
			repo.updateNameById(name, id);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteNameByID(String name, int id) {
		if (name.length() > 2 && id > 0) {
			repo.deleteNameByID(name, id);
			return true;
		}
		return false;
	}

}
