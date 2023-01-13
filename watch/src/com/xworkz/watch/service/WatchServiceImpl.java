package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo = new WatchRepoImpl();

	@Override
	public boolean save(WatchDto dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			if (dto.getId() > 0) {
				System.out.println("id is greater than 0");
				if (dto.getName().length() > 2) {
					System.out.println("name is valid");
					if (dto.getColour().length() > 2) {
						System.out.println("colour is valid");
						if (dto.getType().length() > 2) {
							System.out.println("type is valid");
							if (dto.getPrice() > 200) {
								System.out.println("Sending to repository");
								repo.save(dto);
								return true;
							} else {
								System.out.println("price is invalid");
							}
						} else {
							System.out.println("type is invalid");
						}
					} else {
						System.out.println("colour is invalid");
					}
				} else {
					System.out.println("name is invalid");
				}
			} else {
				System.out.println("id is invalid");
			}
		} else {
			System.out.println("dto is null");

		}
		return false;
	}

	@Override
	public List<WatchDto> read() {
		
		return repo.read();
	}

	@Override
	public List<WatchDto> findByNameAndColour(String name, String colour) {
		if(name.length()>3 && colour.length()>2) {
			return repo.findByNameAndColour(name, colour);
		}
		return null;
	}

	@Override
	public List<WatchDto> findByIdAndType(int id, String type) {
		if(id>0 && type.length()>3) {
			return repo.findByIdAndType(id, type);
		}
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
       if(name.length()>3 && id>0) {
    	   return repo.updateNameById(name, id);
       }
		return false;
	}

	@Override
	public boolean deleteByColourandType(String colour, String type) {
      if(colour.length()>2 && type.length()>3) {
    	  
    	  return repo.deleteByColourandType(colour, type);
      }
		return false;
	}

}
