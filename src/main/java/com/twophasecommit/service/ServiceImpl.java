package com.twophasecommit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.twophasecommit.dao.CourseDao;
import com.twophasecommit.dao.UniversityDao;
import com.twophasecommit.model.Course;
import com.twophasecommit.model.University;

@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {

	@Autowired
	CourseDao courseDao;
	
	@Autowired
	UniversityDao universityDao;
	
	@Transactional(rollbackFor=Exception.class)
	public void persistCourseNUniversity(Course course, University university) throws Exception {
		courseDao.persistCourse(course);
		universityDao.persistUniversity(university);
	}

}
