package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.User;
import com.hcl.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepo;
	
	public User loginValid(User u) {
		return userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword());
	}
	
}
