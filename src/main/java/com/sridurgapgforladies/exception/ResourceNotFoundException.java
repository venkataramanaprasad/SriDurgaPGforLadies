package com.sridurgapgforladies.exception;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */

	private static final long serialVersionUID = 3955378912132768868L;

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public ResourceNotFoundException(String message) {
		super(message);

	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);

	}

}
