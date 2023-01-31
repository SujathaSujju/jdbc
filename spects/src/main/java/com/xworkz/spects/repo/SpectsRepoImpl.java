package main.java.com.xworkz.spects.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.spects.dto.SpectsDto;

public class SpectsRepoImpl implements SpectsRepo{

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public boolean save(SpectsDto dto) {
        if(entityManager!=null) {
        	entityManager.getTransaction().begin();
        	entityManager.persist(dto);
        	entityManager.getTransaction().commit();
        	return true;
        }
		return false;
	}

	@Override
	public List<SpectsDto> readAll() {
       if(entityManager!=null) {
    	   entityManager.getTransaction().begin();
    	   Query query =entityManager.createNamedQuery("readAll", SpectsDto.class);
    	   entityManager.getTransaction().commit();
    	   return  query.getResultList();
       }
		return null;
	}

	@Override
	public boolean findById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			SpectsDto find =entityManager.find(SpectsDto.class, id);
			System.out.println(find);
			return true;
		}
		return false;
	}

	@Override
	public boolean findByShapeAndPrice(String shape, int price) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("findByShapeAndPrice", SpectsDto.class);
			query.setParameter("sh", shape);
			query.setParameter("pr", price);
			entityManager.getTransaction().commit();
			System.out.println(query.getResultList());
			return true;
		}
		return false;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("updatePriceByName");
			query.setParameter("pr", price);
			query.setParameter("nm", name);
			query.executeUpdate();
			entityManager.getTransaction().commit();
			
			return true;
		}
		return false;
	}

	@Override
	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("updateColorByPriceAndShape");
			query.setParameter("clr", color);
			query.setParameter("pr", price);
			query.setParameter("sh", shape);
			query.executeUpdate();
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByPriceAndColor(int price, String color) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pr", price);
			query.setParameter("clr", color);
			query.executeUpdate();
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndId(String name, int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("deleteByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.executeUpdate();
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

}
