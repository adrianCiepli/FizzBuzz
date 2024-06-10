package com.Adrian;

/**
 * @author Adrian Cieplicki
 * date 06/06/2024
 * A java implementation of Fizz Buzz
 */

import java.util.Scanner;

/**
 * The FizzBuzz class
 */
public class FizzBuzz {
	
	/**
	 * Main Method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		// Get the user's input for a range
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number that is bigger than 1");
		System.out.print("> ");
		int n = scanner.nextInt();
		
		// Create FizzBuzz list of all integers in the range
		fizzBuzz(n);

	}
	
	/**
	 * Prints 'Fizz' for multiples of 3, 'Buzz' for multiples of 5, and 'FizzBuzz' for multiples of both of all numbers in a given range
	 * @param n The range of numbers to convert into a FizzBuzz list
	 */
	public static void fizzBuzz(int n) {
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			
			// Print the unaltered number if not a multiple of 3 or 5
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i);
			}
			// Skip a line
			System.out.println();
		}
		
	}

}
