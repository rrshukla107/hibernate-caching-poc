package com.rahul.caching;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryHelper {

	private static EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "caching-poc-persistance";

	static {
		try {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		} catch (ExceptionInInitializerError e) {
			throw e;
		}
	}

	public static EntityManagerFactory getFactory() {
		return factory;
	}

}