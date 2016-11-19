package com.pilaf.sdc.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pilaf.sdc.auth.model.PrivilegesDO;
import com.pilaf.sdc.auth.repository.AuthRepository;

@Service
public class AuthService {
	
	private AuthRepository authRepository;

	@Autowired
	public AuthService(AuthRepository authRepository) {
		super();
		this.authRepository = authRepository;
	}
	
	public PrivilegesDO getPrivilege(){
		return authRepository.getPrivilege();
	}
	
	
	

}
