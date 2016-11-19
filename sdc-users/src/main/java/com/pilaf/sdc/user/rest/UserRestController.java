package com.pilaf.sdc.user.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilaf.sdc.user.model.UserDO;
import com.pilaf.sdc.user.service.UserService;


@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/get")
	public UserDO getUser() {
		return userService.getUser();
	}

}
