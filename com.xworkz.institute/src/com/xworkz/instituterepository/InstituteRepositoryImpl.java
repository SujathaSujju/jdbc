package com.xworkz.instituterepository;

import java.util.ArrayList;
import java.util.Iterator;

import com.xworkz.institute.InstituteDto;

public class InstituteRepositoryImpl implements InstituteRepository{

	ArrayList<InstituteDto> list = new ArrayList<InstituteDto>();
	
	@Override
	public boolean save(InstituteDto dto) {
    list.add(dto);
    System.out.println("saved in repository");
		return true;
	}

	@Override
	public ArrayList<InstituteDto> read() {
		System.out.println("read");
		return list;
	}

	@Override
	public ArrayList<InstituteDto> findByNameAndCourse(String name, String course) {
     for(InstituteDto dto:list) {
    	 if(dto.getName().equals(name) && dto.getCourse().equals(course)) {
         System.out.println(dto);    
    	 }

     }
	return null; 
	}

	@Override
	public ArrayList<InstituteDto> findByLocationAndRating(String location, int rating) {
		for(InstituteDto dto:list) {
			if(dto.getLocation().equals(location)) {
				if(rating>3) {
					System.out.println(dto);
					
				}
			}
		}
		return null;
	
	}

	@Override
	public InstituteDto updateLocationByIndex(String location, int index) {
		
       InstituteDto DTO = list.get(index);
    	  DTO.getLocation();
    	  DTO.setLocation(location);
    	  list.set(index, DTO);
    	  list.add(DTO);
    	  System.out.println("updated location Successfully");
    	  return DTO;
         
	}

	@Override
	public InstituteDto updateCourseByName(String course, String name) {
		for(InstituteDto dto:list) {
			dto.getCourse();
			dto.setCourse(course);
			dto.getName();
			dto.setName(name);
			
			System.out.println("updated course Successfully");
			return dto;
		}
		return null;
	}

	@Override
	public ArrayList<InstituteDto> deleteByRating(int rating) {
		Iterator<InstituteDto> delete = list.iterator();
		  list.remove(rating);
			
		  System.out.println("removed Successfully");
		  		  return null ;
        	 
		
		
	}
	 }
	




