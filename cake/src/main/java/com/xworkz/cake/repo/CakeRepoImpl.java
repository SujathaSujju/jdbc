package main.java.com.xworkz.cake.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.cake.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(CakeDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;

	}

	@Override
	public CakeDto findById(int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			CakeDto dto = entityManager.find(CakeDto.class, id);
			entityManager.getTransaction().commit();
			return dto;
		}
		return null;
	}

	

	@Override
	public boolean updateNameById(String name, int id) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();

			CakeDto dto = entityManager.find(CakeDto.class, id);
			dto.setName(name);
			entityManager.merge(dto);

			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteNameByID(String name, int id) {

		if (entityManager != null) {
			entityManager.getTransaction().begin();

			CakeDto dto = entityManager.find(CakeDto.class, id);
			entityManager.remove(dto);

			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	

	

	
}
