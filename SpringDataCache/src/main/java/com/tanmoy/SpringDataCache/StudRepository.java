package com.tanmoy.SpringDataCache;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudRepository extends CrudRepository<Stud, Long> {
	
	Stud findByName(String name);
	
	@Query("SELECT s FROM Stud s WHERE LOWER(s.name) = :name")
	Stud retrieveByName(@Param("name") String name);

}
