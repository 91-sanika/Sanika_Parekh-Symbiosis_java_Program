package com.TEST2;

public class InvalidInputException extends RuntimeException {
	
	public InvalidInputException(String message) {
		super(message);
	}
}

	class Number {
	    public int divide(int dividend, int divisor) {
	        if (divisor <= 0) {
	            throw new InvalidInputException("Invalid divisor: " + divisor);
	        }
	        return dividend / divisor;
	    }
	}



