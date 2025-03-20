package com.honeywell.HoneywellApp.service;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

@Service
public class EncryptionService {
	
	 private static final String ALGORITHM = "AES";
	 
	 
	 public String encrypt(String message, String key) throws Exception {
	        SecretKeySpec secretKey = generateKey(key);
	        Cipher cipher = Cipher.getInstance(ALGORITHM);
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
	        return Base64.getEncoder().encodeToString(encryptedBytes);
	    }
	 
	 private SecretKeySpec generateKey(String key) throws Exception {
	        byte[] keyBytes = key.getBytes();
	        return new SecretKeySpec(keyBytes, ALGORITHM);
	    }

	
}
