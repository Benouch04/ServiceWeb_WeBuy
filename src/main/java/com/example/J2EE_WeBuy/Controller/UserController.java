package com.example.J2EE_WeBuy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.J2EE_WeBuy.Entity.User;
import com.example.J2EE_WeBuy.Service.UserService;


@RestController
 
public class UserController {

	@Autowired 
	private UserService userservice;
	
	
	@PostMapping("/addUser")
	public User addUser(User user) {
		System.out.println(user.getPrenom());
	    return userservice.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(List<User> users) {
		return userservice.saveUser(users);
	}
	
	@GetMapping("/user_index")
	public List<User> findAllUsers(){
		return userservice.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable int id) {
		return userservice.getUsersById(id);
	}

	@PutMapping("/user/update")
	public User updateUser(User user) {
		return userservice.updateUser(user);
	}
	@DeleteMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userservice.deleteUser(id);
	}

}
