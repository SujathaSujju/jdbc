package repository;

import java.util.ArrayList;

import com.xworkz.telivision.TelivisionDto;

public class TelivisionRepositoryImpl implements TelivisionRepository{

	ArrayList<TelivisionDto> list = new ArrayList<TelivisionDto>();
	
	
	@Override
	public boolean save(TelivisionDto dto) {
         list.add(dto);
         System.out.println("data saved");
		return true;
	}


	@Override
	public ArrayList<TelivisionDto> read() {
		System.out.println("read");
		return list;
	}


	@Override
	public ArrayList<TelivisionDto> findByNameAndSize(String name, String size) {
		    for (TelivisionDto telivisionDto : list) {
				if(telivisionDto.getName().equals(name) && telivisionDto.getSize().equals(size)){
		
			System.out.println("data found");
			System.out.println(telivisionDto);
		
		    }
		    }

		return list;
	}


	@Override
	public TelivisionDto findTypeAndColourByIndex(String type, String colour, int index) {
		list.get(index);
		for (TelivisionDto telivisionDto : list) {
			if(telivisionDto.getType().equals(type) && telivisionDto.getColour().equals(colour)) {
				
				list.set(index, telivisionDto);
				System.out.println("data found");
				System.out.println(telivisionDto);
			}
		}
		return null;
	}


	@Override
	public TelivisionDto updateSizeByType(String size, String type) {
		for (TelivisionDto update : list) {
			if(update.getSize().equals(size) && update.getType().equals(type)) {
				update.setSize(size);
			System.out.println("updated size successfully");
			System.out.println(update);
		}
		}
		return null;
	}

}
