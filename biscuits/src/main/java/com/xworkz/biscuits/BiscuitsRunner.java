package main.java.com.xworkz.biscuits;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import main.java.com.xworkz.biscuits.dto.BiscuitsDto;

public class BiscuitsRunner {

	
	public static void main(String args[]) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		BiscuitsDto dto1 = new BiscuitsDto(1, "parle-G", 10, "cookies", "gluco");
		BiscuitsDto dto2 = new BiscuitsDto(2, "bourbon", 20, "cream", "sugar");
		BiscuitsDto dto3 = new BiscuitsDto(3, "orea", 15, "cream", "chocolate");
		BiscuitsDto dto4 = new BiscuitsDto(4, "Good Day", 20, "cookies", "gluco");
		BiscuitsDto dto5 = new BiscuitsDto(5, "marigold", 30, "cookies", "gluco");
		BiscuitsDto dto6 = new BiscuitsDto(6, "sun feast", 15, "cookies", "sunflower");
		BiscuitsDto dto7 = new BiscuitsDto(7, "50-50", 35, "cookies", "salt");
		BiscuitsDto dto8 = new BiscuitsDto(8, "hide n seek", 25, "cream", "chocolate");
		BiscuitsDto dto9 = new BiscuitsDto(9, "britannia", 40, "cookies", "gluco");
		BiscuitsDto dto10 = new BiscuitsDto(10, "dark fantasy", 20, "cream", "chocolate");
		
		entityManager.persist(dto1);
		
		entityManager.persist(dto2);
		
		entityManager.persist(dto3);
		
		entityManager.persist(dto4);
		
		entityManager.persist(dto5);
		
		entityManager.persist(dto6);
		
		entityManager.persist(dto7);
		
		entityManager.persist(dto8);
		
		entityManager.persist(dto9);
		
		entityManager.persist(dto10);
		
		  BiscuitsDto dto= entityManager.find(BiscuitsDto.class, 2);
		  System.out.println(dto);
		
		dto9.setName("happy-happy");
		entityManager.merge(dto9);
		
		entityManager.remove(dto);
		System.out.println(dto);
		
		entityManager.getTransaction().commit();
		
		
		
		
		
		
		
	}
}
