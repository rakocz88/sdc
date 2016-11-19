package com.pilaf.sdc.user.repository;

import org.springframework.stereotype.Repository;

import com.pilaf.sdc.user.model.UserDO;


@Repository
public class UserRepository {

	public UserDO getUser() {
		return new UserDO(12l, "Pan Marian");
	}

}
