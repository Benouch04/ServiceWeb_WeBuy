package com.example.J2EE_WeBuy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.J2EE_WeBuy.Dao.UserRepository;
import com.example.J2EE_WeBuy.Entity.User;

import java.util.List;

@Service
public class UserService {
	
	@Autowired
	private UserRepository u_repository;
	
	public User saveUser (User user) { 
		return u_repository.save(user);
	}
	public List<User> saveUser(List<User> users){
		return u_repository.saveAll(users);
	}
	public List<User> getUsers(){
		return u_repository.findAll();
	}
	public User getUsersById(int id){
		return u_repository.findById(id).orElse(null);
	}
	public User getUsersByNom(String nom){
		return u_repository.findByNom(nom);
	}
	public User getUserByEmail(String email) {
		return u_repository.findByEmail(email);
	}
	public String deleteUser(int id) {
		u_repository.deleteById(id);
		return "user removed !!" +id;
	}
	public User updateUser(User user) {
		User existingUser=u_repository.findById(user.getId()).orElse(null);
		existingUser.setNom(user.getNom());
		return u_repository.save(existingUser);
		
	}
	
}
