package com.customException;

public class InvalidStringException extends RuntimeException{
	
	public InvalidStringException() {
		super();
	}
	
	public InvalidStringException(String message) {
		super(message);
	}

}
