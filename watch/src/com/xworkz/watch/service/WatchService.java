package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {

	public boolean save(WatchDto dto);
	
	public List<WatchDto> read();
	
	public List<WatchDto> findByNameAndColour(String name,String colour);
	
	public List<WatchDto> findByIdAndType(int id,String type);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteByColourandType(String colour,String type);
	

	
	
}
