package com.xworkz.Instituteservice;

import java.util.ArrayList;

import com.xworkz.institute.InstituteDto;
import com.xworkz.instituterepository.InstituteRepository;
import com.xworkz.instituterepository.InstituteRepositoryImpl;

public class InstituteServiceImpl implements InstituteService{

	InstituteRepository repo = new InstituteRepositoryImpl();
	
	@Override
	public boolean save(InstituteDto dto) {
      if(dto!=null) {
    	  if(dto.getName().length()>=3) {
    		  System.out.println("Sending to repo");
    		  repo.save(dto);
    		  return true;
    		  
    	  }
      }
      System.out.println("is null");
		return false;
	
	}

	@Override
	public ArrayList<InstituteDto> read(){
		return repo.read();
		

	}

	@Override
	public ArrayList<InstituteDto> findByNameAndCourse(String name, String course) {
    if(name!=null) {
    	if(name.length()>=3 && course.length()>=3) {
       return  repo.findByNameAndCourse(name, course);
        
    	}
    }
		return null;
	}

	@Override
	public ArrayList<InstituteDto> findByLocationAndRating(String location, int rating) {
     if(location!=null) {
    	 if(location.length()>=3) {
    		 return repo.findByLocationAndRating(location, rating);
    	 }
     }
		return null;
	}

	@Override
	public InstituteDto updateLocationByIndex(String location, int index) {
          if(location!=null && location.length()>=3) {
        	  if(index<5 && index>=0) {
        		  return repo.updateLocationByIndex(location, index);
        		
        	  }
          }
		return null;
	}

	@Override
	public InstituteDto updateCourseByName(String course, String name) {
        if(course!=null && name!=null) {
        	return repo.updateCourseByName(course, name);
        }
		return null;
	}

	@Override
	public ArrayList<InstituteDto> deleteByRating(int rating) {
		if(rating>=0) {
		repo.deleteByRating(rating);
		}
		return null;
	}

}
