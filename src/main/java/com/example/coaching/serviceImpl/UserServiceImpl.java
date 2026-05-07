package com.example.coaching.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coaching.entity.User;
import com.example.coaching.repository.UserRepository;
import com.example.coaching.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userrepo;
   
	@Override
	public User register(User user) {
		return userrepo.save(user);
	}

	@Override
	public User login(String username, String password) {
		 return userrepo.findByUsernameAndPassword(username, password);
	}

}
