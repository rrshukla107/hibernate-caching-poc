package com.rahul.caching;

import javax.persistence.EntityManager;

public class CachingMain {

	public static void main(String[] args) {

//		setUp();

		EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();

		System.out.println(em.find(PersonEntity.class, 1));
		System.out.println(em.find(PersonEntity.class, 1));
		System.out.println(em.find(PersonEntity.class, 1));

		em.close();

	}

	private static void setUp() {
		EntityManager em = EntityManagerFactoryHelper.getFactory().createEntityManager();
		em.getTransaction().begin();
		for (int i = 0; i < 100; i++) {
			PersonEntity person = new PersonEntity();
			person.setName("Name " + i);
			person.setAddress("Address " + i);
			em.persist(person);
		}
		em.getTransaction().commit();
		em.close();
		EntityManagerFactoryHelper.getFactory().close();
	}

}
