package com.pointOfSale.suvaraj.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.pointOfSale.suvaraj.project1.entity.User;
import com.pointOfSale.suvaraj.project1.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/{id}")
	public  User userById(@PathVariable Long id) {
		return userService.getUser(id);
	}
	
	@GetMapping
	public List<User> userAll(){
		return userService.getUsers();
	}
	@PutMapping("/{id}")
	public User editUser(@PathVariable long id,@RequestBody User user) {
		return userService.updateUser(id, user);
	}
	@DeleteMapping("/{id}")
	public String removeUser(@PathVariable long id) {
		userService.deleteUser(id);
		return "Successfully Deleted";
	}
	
     

}
