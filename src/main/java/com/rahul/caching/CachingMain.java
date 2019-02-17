package com.rahul.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CachingMain {

	private static final String PERSISTENCE_UNIT_NAME = "caching-poc-persistance";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		PersonEntity person = new PersonEntity();
		person.setName("John Doe");
		person.setAddress("John Doe address");
		em.persist(person);
		em.getTransaction().commit();
		em.close();
	}

}
