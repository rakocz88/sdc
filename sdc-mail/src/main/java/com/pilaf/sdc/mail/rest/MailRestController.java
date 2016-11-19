package com.pilaf.sdc.mail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilaf.sdc.mail.model.MailDO;
import com.pilaf.sdc.mail.service.MailService;

@RestController
@RequestMapping("/auth")
public class MailRestController {
	
	@Autowired
	private MailService mailService;

	@RequestMapping("/get")
	public MailDO getMail() {
		return mailService.getMail();
	}

}
