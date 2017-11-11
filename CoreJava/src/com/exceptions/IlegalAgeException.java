package com.exceptions;

public class IlegalAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IlegalAgeException(String message){
		super(message);
	}

}
