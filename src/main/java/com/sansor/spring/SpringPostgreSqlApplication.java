package com.sansor.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sansor.spring.repo.UserRepository;

@SpringBootApplication
public class SpringPostgreSqlApplication implements CommandLineRunner{

	@Autowired
	UserRepository repository;
	
	public static void main(String[] args){
		SpringApplication.run(SpringPostgreSqlApplication.class, args);
	}

	
	@Override
	public void run(String... arg0) throws Exception {
		repository.deleteAll();
	}
}
