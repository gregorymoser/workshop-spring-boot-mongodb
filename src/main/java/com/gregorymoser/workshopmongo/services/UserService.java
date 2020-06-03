package com.gregorymoser.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gregorymoser.workshopmongo.domain.User;
import com.gregorymoser.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List <User> findAll(){
		return repo.findAll();
	}
}
