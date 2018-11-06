package com.websystique.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.websystique.springboot.entity.User;
import com.websystique.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	@PostConstruct
	public void init() {
		userRepository.save(new com.websystique.springboot.entity.User("Sam",30, 70000));
		userRepository.save(new com.websystique.springboot.entity.User("Tom",40, 50000));
		userRepository.save(new com.websystique.springboot.entity.User("Jerome",45, 30000));
	}

	public User findById(long id) {
		return userRepository.findById(id);
	}

	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	public void saveUser(com.websystique.springboot.entity.User user) {
		userRepository.save(user);
	}

	public void updateUser(com.websystique.springboot.entity.User user) {
		userRepository.save(user);
	}

	public void deleteUserById(long id) {
		for (Iterator<com.websystique.springboot.entity.User> iterator = findAllUsers().iterator(); iterator.hasNext(); ) {
			com.websystique.springboot.entity.User user = iterator.next();
			userRepository.delete(user);
		}
	}

	public boolean isUserExist(com.websystique.springboot.entity.User user) {
		return findByName(user.getName())!=null;
	}

	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}



}
