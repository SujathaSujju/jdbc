package com.xworkz.bag.repository;

import com.xworkz.bag.BagDto;

public interface BagRepo {

	public boolean save(BagDto dto);
	
	public BagDto read();
	
	public BagDto findByName(String name);
	
	public BagDto findByNameAndId(String name,int id);
	
}
