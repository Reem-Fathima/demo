package com.ust.swiggy.exception;

/**
 * No Entity Exception Class
 *
 */
public class NoEntryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NoEntryException() {
		super();
		
	}

	/**
	 * @param message
	 */
	public NoEntryException(String message) {
		super(message);
		
	}

	/**
	 * @param cause
	 */
	public NoEntryException(Throwable cause) {
		super(cause);
		
	}
	

}
