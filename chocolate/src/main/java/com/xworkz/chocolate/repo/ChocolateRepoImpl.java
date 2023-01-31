package main.java.com.xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import main.java.com.xworkz.chocolate.dto.ChocolateDto;


public class ChocolateRepoImpl implements ChocolateRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public boolean save(ChocolateDto dto) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}


	@Override
	public List<ChocolateDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
			Query query= em.createNamedQuery("readAll", ChocolateDto.class);
			em.getTransaction().commit();
			return query.getResultList();
			
			
		}
		return null;
	}


	@Override
	public boolean findByColorAndWeight(String color, String weight) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByColorAndWeight", ChocolateDto.class);
			query.setParameter("clr", color);
			query.setParameter("wg", weight);
			em.getTransaction().commit();
			System.out.println(query.getResultList());
			return true;
		}
		return false;
	}


	@Override
	public boolean findByPriceAndName(int price, String name) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByPriceAndName", ChocolateDto.class);
			query.setParameter("pr", price);
			query.setParameter("nm", name);
			em.getTransaction().commit();
			System.out.println(query.getResultList());
			return true;
		}
		return false;
	}


	@Override
	public boolean updateWeightByNameAndColor(String weight, String name, String color) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query =em.createNamedQuery("updateWeightByNameAndColor");
			query.setParameter("wg", weight);
			query.setParameter("nm", name);
			query.setParameter("clr", color);
			query.executeUpdate();
			em.getTransaction().commit();
			
			return true;
		}
		return false;
	}


	@Override
	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query =em.createNamedQuery("updateNameByIdAndWeight");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.setParameter("wg", weight);
			query.executeUpdate();
			em.getTransaction().commit();
			
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteByColorAndName(String color, String name) {
		if(em!=null) {
			em.getTransaction().begin();
			Query query =em.createNamedQuery("deleteByColorAndName");
			query.setParameter("clr", color);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			
			return true;
		}
		return false;
	}

}
