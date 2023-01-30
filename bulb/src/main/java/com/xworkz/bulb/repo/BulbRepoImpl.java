package main.java.com.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import main.java.com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");

	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public boolean save(BulbDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<BulbDto> readAll() {

		if (entityManager != null) {
			entityManager.getTransaction().begin();
			TypedQuery<BulbDto> list = entityManager.createNamedQuery("readAll", BulbDto.class);
			entityManager.getTransaction().commit();
			return list.getResultList();
			
         
		}
		return null;
	}

	@Override
	public BulbDto findByName(String name) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			TypedQuery<BulbDto> query=entityManager.createNamedQuery("findByName", BulbDto.class);
			query.setParameter("nm", name);
			entityManager.getTransaction().commit();
			return query.getSingleResult();
		
	}
		return null;

}}
