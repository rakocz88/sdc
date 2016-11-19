package com.pilaf.sdc.mail.repository;

import org.springframework.stereotype.Repository;

import com.pilaf.sdc.mail.model.MailDO;

@Repository
public class MailRepository {

	public MailDO getMail() {
		return new MailDO(11l, "Dupa");
	}

}
