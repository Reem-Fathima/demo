package com.ust.swiggy.exception;

/**
 * Duplicate Error exception Class
 *
 */
public class DuplicateErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DuplicateErrorException() {
		super();

	}

	/**
	 * @param message
	 */
	public DuplicateErrorException(String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public DuplicateErrorException(Throwable cause) {
		super(cause);

	}

}
