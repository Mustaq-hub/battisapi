package com.battisapi.BattiTradingAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.battisapi.BattiTradingAPI.entity.User;
import com.battisapi.BattiTradingAPI.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public User addUSer(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUSers(@RequestBody List<User> users)
	{
		return service.saveUsers(users);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers()
	{
		return service.getUsers();
	}
	
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable int id)
	{
		return service.getUserbyID(id);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return service.deleteUserbyID(id);
	}

}
