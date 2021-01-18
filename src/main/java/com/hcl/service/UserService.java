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
	
	public void register(User r)
	{
		userRepo.save(r);
	}
	public boolean loginValid(User u) {

		User login = userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword());
		
		if (login.equals(null)) {
			return false;
		}
		else {
			return true;
		}
	}
	public User loginUser(User u) {
	
		User login = userRepo.findByEmailAndPassword(u.getEmail(), u.getPassword());
		return login;
	
	}

}
