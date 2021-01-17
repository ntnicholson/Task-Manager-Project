package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.model.User;
import com.hcl.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public User loginValid(String email, String password) {

		List<User> loginList = userRepo.findByEmailAndPassword(email, password);
		
		for(User u:loginList) {
			u.toString();
		}

		return new User(777, "Nick", "n@mail.com", "pass");
	}
//	public boolean loginValid(String email, String password) {
//	
//	
//	if (userRepo.findByEmailAndPassword(email == null){
//		
//	}
//	else {
//		return userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword();
//	}

}
