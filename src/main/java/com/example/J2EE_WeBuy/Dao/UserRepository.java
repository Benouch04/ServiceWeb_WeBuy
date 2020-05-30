package com.example.J2EE_WeBuy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.J2EE_WeBuy.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByNom(String nom);

	User findByEmail(String email); 
	
	

}
