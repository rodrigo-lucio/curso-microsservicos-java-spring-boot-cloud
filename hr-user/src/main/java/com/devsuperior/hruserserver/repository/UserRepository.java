package com.devsuperior.hruserserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hruserserver.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public  User findByEmail(String email);
	
}
