package com.honeywell.HoneywellApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.HoneywellApp.EncryptionDetails;
import com.honeywell.HoneywellApp.service.EncryptionService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private EncryptionService encryptionService;
	
	
	
	@PostMapping("/encrypt")
	public EncryptionDetails getEncryptedMessage(@RequestBody EncryptionDetails encryptionDetails) {
		
		try {
			String encryptedMessage = encryptionService.encrypt(encryptionDetails.getMessage(), encryptionDetails.getFirstName());
			 return new EncryptionDetails( encryptionDetails.getFirstName(), encryptedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptionDetails;
		
	}
	

}
