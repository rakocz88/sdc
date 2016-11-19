package com.pilaf.sdc.user.model;

import java.io.Serializable;

public class UserDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6873268240879342210L;

	/**
	 * 
	 */

	private Long id;

	private String name;

	public UserDO() {
		super();
	}

	public UserDO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
