package com.twophasecommit.dao;

import com.twophasecommit.model.University;

public interface UniversityDao {
	
	  void persistUniversity(University university) throws Exception;
		  
}
