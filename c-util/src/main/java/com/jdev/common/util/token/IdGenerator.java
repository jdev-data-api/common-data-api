package com.jdev.common.util.token;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.springframework.stereotype.Component;

import com.jdev.common.util.constants.CommonConstants;
import com.jdev.common.util.utils.CommonUtils;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component("idGen")
public class IdGenerator {

	 public String generateTransactionId() {
		 log.info(CommonUtils.entry("GenerateTransactionId"));
		 String transactionId = CommonConstants.EMPTY;
		 Long currentTime = System.currentTimeMillis();
		 try {
			SecureRandom secureRandomGenerator = SecureRandom.getInstance("SHA1PRNG");
			Integer ramdomNumber = secureRandomGenerator.nextInt(99999);
			transactionId = currentTime.toString().concat(CommonConstants.SEPERATOR).concat(ramdomNumber.toString());
		} catch (NoSuchAlgorithmException noSuchAlgorithmException) {
			log.error("NoSuchAlgorithmException caught in generateTransactionId method : {}".concat(noSuchAlgorithmException.getLocalizedMessage()));
		}
		 
		 return transactionId;
	 }
	
}
