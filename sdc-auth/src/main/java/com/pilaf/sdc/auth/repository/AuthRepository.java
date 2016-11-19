package com.pilaf.sdc.auth.repository;

import org.springframework.stereotype.Repository;

import com.pilaf.sdc.auth.model.PrivilegesDO;

@Repository
public class AuthRepository {

	public PrivilegesDO getPrivilege() {
		return new PrivilegesDO(11l, "Dupa");
	}

}
