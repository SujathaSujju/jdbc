package com.xworkz.hospital.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRepoImpl implements HospitalRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hospitalProperties");
	
	EntityManager em = emf.createEntityManager();
	
	@Override
	public String save(HospitalDto dto) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			em.close();
			
			return "data saved successfully";
		}
		return null;
	}

}
