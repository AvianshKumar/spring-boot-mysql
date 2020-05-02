package com.avinash.java.spring.mysql.springbootcrudrestfulwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.java.spring.mysql.springbootcrudrestfulwebservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
//	public List<User> findByEmail(String email);
	
	//public List<User> findByEmailEquals(String email);
	
	public List<User> findByEmailContaining(String email);
	

	

}
