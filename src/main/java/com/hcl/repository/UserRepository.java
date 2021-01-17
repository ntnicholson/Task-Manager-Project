package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	List<User> findByEmailAndPassword(String email, String password);
}
