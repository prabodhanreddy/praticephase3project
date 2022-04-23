package com.example.demo;

	
	import org.springframework.data.repository.CrudRepository;

	import com.example.UserManager.entities.User;

	public interface UserRepository extends CrudRepository<User, Integer> {

	    public User findByName(String name);
	}


