package com.pilaf.sdc.auth.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilaf.sdc.auth.model.PrivilegesTest;

@RestController
@RequestMapping("/auth")
public class AuthRestController {

	@RequestMapping("/tets")
	public PrivilegesTest getPrivilege() {
		return new PrivilegesTest(10l, "ReadAllShit");
	}

}
