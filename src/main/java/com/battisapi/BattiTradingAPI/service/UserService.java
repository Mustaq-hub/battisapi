package com.battisapi.BattiTradingAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.battisapi.BattiTradingAPI.entity.User;
import com.battisapi.BattiTradingAPI.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user)
	{
		return repository.save(user);
	}
	
	public List<User> saveUsers(List<User> users)
	{
		return repository.saveAll(users);
	}
	
	public List<User> getUsers()
	{
		return repository.findAll();
	}
	
	public User getUserbyID(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public String deleteUserbyID(int id)
	{
		repository.deleteById(id);
		return "User removed";		
	}
	
	public User updateUser(User user)
	{
		User existingUser=repository.findById(user.getId()).orElse(null);
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		existingUser.setAadhar(user.getAadhar());
		existingUser.setMobileNumber(user.getMobileNumber());
		return repository.save(existingUser);
		
		
	}
	

}
