package com.pilaf.sdc.auth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilaf.sdc.auth.model.PrivilegesDO;
import com.pilaf.sdc.auth.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthRestController {
	
	@Autowired
	private AuthService authService;

	@RequestMapping("/get")
	public PrivilegesDO getPrivilege() {
		return authService.getPrivilege();
	}

}
