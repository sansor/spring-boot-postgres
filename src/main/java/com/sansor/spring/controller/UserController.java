package com.sansor.spring.controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sansor.spring.model.User;
import com.sansor.spring.repo.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;

	@RequestMapping("/start")
	public String process() {
		initilizeDB();
		return "SUCCESS";
	}

	/**
	 * Create example users in user table
	 */
	private void initilizeDB() {
		repository.save(new User("Kamal", "Khan"));
		repository.save(Arrays.asList(new User("Sanjay", "Kumar"), new User("Nizam", "Haq"),
				new User("Mohan", "Kumar"), new User("Ranjit", "Damodaran")));
	}

	@RequestMapping(value="/users", produces= MediaType.APPLICATION_JSON_VALUE)
	public  List<User> findAll() {
		return (List<User>) repository.findAll();
	}

	@RequestMapping(value = "/users/search/id/{id}" , produces= MediaType.APPLICATION_JSON_VALUE)
	public String findById(@RequestParam("id") String id) {
		return repository.findOne(Long.valueOf(id)).toString();
	}

	@RequestMapping(value="/users/search/lastname/{searchTerm}", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<User> fetchDataByLastName(@PathParam("searchTerm") String searchTerm) {
		return repository.findByLastName(searchTerm);
	}
}
