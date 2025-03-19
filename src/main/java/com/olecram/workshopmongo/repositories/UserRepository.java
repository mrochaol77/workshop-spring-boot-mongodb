package com.olecram.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.olecram.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	// empty in this context
}
