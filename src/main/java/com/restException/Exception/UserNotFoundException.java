package com.restException.Exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	public UserNotFoundException() {
	}

	private static final long serialVersionUID = 8427074234368263039L;

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
