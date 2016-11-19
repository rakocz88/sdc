package com.pilaf.sdc.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pilaf.sdc.user.model.UserDO;
import com.pilaf.sdc.user.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public UserDO getUser(){
		return userRepository.getUser();
	}
	
	
	

}
