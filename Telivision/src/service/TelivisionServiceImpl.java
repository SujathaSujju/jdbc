package service;

import java.util.ArrayList;

import com.xworkz.telivision.TelivisionDto;

import repository.TelivisionRepository;
import repository.TelivisionRepositoryImpl;

public class TelivisionServiceImpl implements TelivisionService{

	TelivisionRepository repo = new TelivisionRepositoryImpl();
	
	@Override
	public boolean save(TelivisionDto dto) {
		if(dto!=null) {
			if(dto.getSize()!=null && dto.getName()!=null && dto.getPrice()>100) {
			System.out.println("sending to repository");
			return repo.save(dto);
		}
		}
		return false;
	}

	@Override
	public ArrayList<TelivisionDto> read() {
		return repo.read();
	}

	@Override
	public ArrayList<TelivisionDto> findByNameAndSize(String name, String size) {
		if(name!=null && size!=null) {
		    ArrayList<TelivisionDto> find = repo.findByNameAndSize(name, size);
		    System.out.println(find);
		}
		return null;
		
		
	}

	@Override
	public TelivisionDto findTypeAndColourByIndex(String type, String colour, int index) {
		 
		return repo.findTypeAndColourByIndex(type, colour, index);
	}

	@Override
	public TelivisionDto updateSizeByType(String size, String type) {
		
		return repo.updateSizeByType(size, type);
	}

}
