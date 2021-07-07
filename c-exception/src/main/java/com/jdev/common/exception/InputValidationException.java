package com.jdev.common.exception;

public class InputValidationException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4892852390143327299L;

	public InputValidationException(String iMessage) {
		super(iMessage);
	}
	
	public InputValidationException(String iErrorCode, String iMessage) {
		super(iErrorCode, iMessage);
	}

}
