package com.ust.swiggy.exception;

/**
 * @author 219660
 *
 */

public class NoEntriesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public NoEntriesException() {
		super();

	}

	/**
	 * @param message
	 */
	public NoEntriesException(String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public NoEntriesException(Throwable cause) {
		super(cause);

	}

}
