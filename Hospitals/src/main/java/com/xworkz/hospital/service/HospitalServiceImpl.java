package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repo.HospitalRepo;
import com.xworkz.hospital.repo.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitalService {

	HospitalRepo repo = new HospitalRepoImpl();
	
	@Override
	public String save(HospitalDto dto) {
      if(dto!=null) {
    	  if(dto.getNoOfDoctors().length()>=2 && dto.getName().length()>2) {
    		  return repo.save(dto);
    	  }
      }
		
		return null;
	}

}
