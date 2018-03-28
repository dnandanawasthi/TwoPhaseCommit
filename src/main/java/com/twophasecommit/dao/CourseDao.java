package com.twophasecommit.dao;

import com.twophasecommit.model.Course;

public interface CourseDao {
	
	  void persistCourse(Course course);
}
