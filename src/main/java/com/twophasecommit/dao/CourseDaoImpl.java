package com.twophasecommit.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.twophasecommit.model.Course;

@Service
public class CourseDaoImpl implements CourseDao {

	@PersistenceContext(unitName="PersistenceUnitA")
	private EntityManager entityManager;

	public void persistCourse(Course course) {
		entityManager.persist(course);
	}


}