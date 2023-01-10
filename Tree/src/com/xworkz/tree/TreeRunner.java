package com.xworkz.tree;

import com.xworkz.treerepo.TreeRepo;
import com.xworkz.treerepo.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {
		
		TreeRepo repo = new TreeRepoImpl();
		
		TreeDto DTO = new TreeDto(1,"banyan","green","creaper",200,150.0);
		
		repo.save(DTO);
		
	}
}
