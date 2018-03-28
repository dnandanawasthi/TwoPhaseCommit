package com.twophasecommit.service;

import com.twophasecommit.model.Course;
import com.twophasecommit.model.University;

public interface Service {

	void persistCourseNUniversity(Course course, University university) throws Exception;
	
}
