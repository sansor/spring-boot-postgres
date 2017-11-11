package com.sansor.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sansor.spring.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findByLastName(String lastName);
}
