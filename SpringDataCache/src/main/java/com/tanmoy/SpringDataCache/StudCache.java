package com.tanmoy.SpringDataCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class StudCache {
	
	@Autowired
	private StudRepository repo;
	
	
	@Cacheable(value="studCache", key="#name")
	public Stud getStudent(String name) {
		System.out.println("Retrieving data from database");
		return repo.findByName(name);
	}

}
