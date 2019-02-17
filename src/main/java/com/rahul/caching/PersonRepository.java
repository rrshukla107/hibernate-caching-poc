package com.rahul.caching;

public class PersonRepository {

	public void putPerson(PersonEntity person) {

		EntityManagerFactoryHelper.getFactory().createEntityManager();

	}
}
