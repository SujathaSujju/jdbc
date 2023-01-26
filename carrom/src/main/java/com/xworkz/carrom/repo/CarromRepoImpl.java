package main.java.com.xworkz.carrom.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.carrom.dto.CarromDto;

public class CarromRepoImpl implements CarromRepo{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	
	
	@Override
	public boolean save(CarromDto dto) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}



	@Override
	public CarromDto findbyid(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto  find = entityManager.find(CarromDto.class, id);
			entityManager.getTransaction().commit();
			return find;
		}
		return null;
	}



	@Override
	public boolean updateNameById(String name, int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto  find = entityManager.find(CarromDto.class, id);
			find.setBrandname(name);
			entityManager.merge(find);
			entityManager.getTransaction().commit();
			return true;
		
	}
return false;
}



	@Override
	public boolean deleteById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto find = entityManager.find(CarromDto.class, id);
			entityManager.remove(find);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}
}
