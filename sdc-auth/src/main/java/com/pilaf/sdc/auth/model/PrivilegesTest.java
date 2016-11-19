package com.pilaf.sdc.auth.model;

import java.io.Serializable;

public class PrivilegesTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2686928476860448571L;

	private Long id;

	private String privilege;

	public PrivilegesTest() {
		super();
	}

	public PrivilegesTest(Long id, String privilege) {
		super();
		this.id = id;
		this.privilege = privilege;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

}
