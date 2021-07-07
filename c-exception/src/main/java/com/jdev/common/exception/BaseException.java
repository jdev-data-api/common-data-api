package com.jdev.common.exception;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseException extends RuntimeException {

	/**
	 * i = Input
	 */
	private static final long serialVersionUID = 2842195200404100479L;

	private String errorCode;
	
	/* Data to populate in error response */
	private List<String> datas;
	
	private HttpStatus httpCode;
	
	public BaseException (String iMessage) {
		super(iMessage);
		errorCode = null;
		datas = null;
	}
	
	public BaseException (String iErrorCode, String iMessage) {
		super(iMessage);
		errorCode = iErrorCode;
		
	}
}
