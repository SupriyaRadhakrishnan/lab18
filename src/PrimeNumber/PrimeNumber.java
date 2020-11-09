package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Let’s locate some primes!\n");
		System.out.println("This application will find you any prime, in order, from first prime number on.");
		do {
			int userInput = Validator.getIntAtOrAbove(scnr, "Which prime number are you looking for?", 1);
			System.out.println("The number " + userInput + " prime is " + findPrimeNumberAt(userInput) + ".\n");

		} while (Validator.getYesNo(scnr, "Do you want to find another prime number?"));
		System.out.println("GoodBye!");
	}

	public static int findPrimeNumberAt(int userInput) {
		int primeNumber = 0;
		if (userInput > 0) {
			int i = 0;
			int counter = 0;
			while (counter < userInput) {
				primeNumber = primeNumber + 1;
				for (i = 2; i <= primeNumber; i++) {
					if (primeNumber % i == 0) {
						break;
					}
				}
				if (i == primeNumber) {
					counter = counter + 1;

				}
			}
		}
		return primeNumber;
	}

}
