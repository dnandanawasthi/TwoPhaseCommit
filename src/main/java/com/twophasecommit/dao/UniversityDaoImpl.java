package com.twophasecommit.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.twophasecommit.model.University;
import org.springframework.stereotype.Service;

@Service
public class UniversityDaoImpl implements UniversityDao {

	@PersistenceContext(unitName="PersistenceUnitB")
	private EntityManager entityManager;

	public void persistUniversity(University university) throws Exception {
		entityManager.persist(university);
	}
}