package com.jdev.common.exception;

public class BusinessValidationException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2549279793093962923L;

	public BusinessValidationException(String iMessage) {
		super(iMessage);
	}
	
	public BusinessValidationException(String iErrorCode, String iMessage) {
		super(iErrorCode, iMessage);
	}

}
