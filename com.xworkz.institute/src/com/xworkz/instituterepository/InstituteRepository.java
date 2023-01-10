package com.xworkz.instituterepository;

import java.util.ArrayList;

import com.xworkz.institute.InstituteDto;

public interface InstituteRepository {

public boolean save(InstituteDto dto);
	
	public ArrayList<InstituteDto> read();
	
	public ArrayList<InstituteDto> findByNameAndCourse(String name,String course);
	
	public ArrayList<InstituteDto> findByLocationAndRating(String location,int rating);
	
	public InstituteDto updateLocationByIndex(String location,int index);
	
	public InstituteDto updateCourseByName(String course,String name);
	
	public ArrayList<InstituteDto> deleteByRating(int rating);
	
	
	
}
