package com.pointOfSale.suvaraj.project1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pointOfSale.suvaraj.project1.entity.Sale;
import com.pointOfSale.suvaraj.project1.entity.User;
import com.pointOfSale.suvaraj.project1.repository.UserRepository;
@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository repo;
	

	@Override
	public User addUser(User user) {
	    for(Sale sale:user.getSales()) {
	    	sale.setUser(user);	    	
	    }
		return repo.save(user);
	}

	@Override
	public User getUser(long id) {
		if (repo.findById(id).isEmpty()) {
			throw new RuntimeException("Invalid ID...Entered ID is not found,Please enter valid Id");
		} else {

			return repo.findById(id).get();
		}
	}

	@Override
	public List<User> getUsers() {
	
		return repo.findAll();
	}

	@Override
	public User updateUser(long id, User user) {
		if(repo.findById(id).isEmpty()){
			throw new RuntimeException("User  ID is not found");
		}
		else {
			user.setuId(id);
			addUser(user);
		}
		
		return user;
	}

	@Override
	public String deleteUser(long id) {
		repo.deleteById(id);
		return "User Desleted Succesfully";
	}

}
