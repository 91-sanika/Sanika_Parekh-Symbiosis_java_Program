package com.TEST2;

public class Main {

	public static void main(String[] args) {
		Number number = new Number();
        int dividend = 10;
        int divisor = 0;

        try {
            int result = number.divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (InvalidInputException e) {
            System.out.println("Exception Occur " + e.getMessage());
        }
	}

}
