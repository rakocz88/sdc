package com.pilaf.sdc.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pilaf.sdc.mail.model.MailDO;
import com.pilaf.sdc.mail.repository.MailRepository;

@Service
public class MailService {
	
	private MailRepository mailRepository;

	@Autowired
	public MailService(MailRepository mailRepository) {
		super();
		this.mailRepository = mailRepository;
	}
	
	public MailDO getMail(){
		return mailRepository.getMail();
	}
	
	
	

}
