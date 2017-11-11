package com.exceptions;

public class IllegalPriceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IllegalPriceException(String message){
		super(message);
	}

}
