package com.pilaf.sdc.mail.model;

import java.io.Serializable;

public class MailDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6873268240879342210L;

	/**
	 * 
	 */

	private Long id;

	private String mgs;

	public MailDO() {
		super();
	}

	public MailDO(Long id, String mgs) {
		super();
		this.id = id;
		this.mgs = mgs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMgs() {
		return mgs;
	}

	public void setMgs(String mgs) {
		this.mgs = mgs;
	}

}
