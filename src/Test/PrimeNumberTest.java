package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import PrimeNumber.PrimeNumber;
/*
 * Finding the nth Prime Number
 * 1.find nth prime number- 6 should return 13
 * 2.find -nth prime number - -6 should return 0
 * 3.find 0th prime number - 0 should return 0
 * 4.find 1st prime number - 1 should return 2
 * 5.find higher prime numbers - 100 should return 541
 * 6.find higher prime numbers - 1000 should return 7919
 */

//Included negative and 0 value to increase the number of of testcases.
class PrimeNumberTest {

	@Test
	void testPositiveNthPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(6);
		assertEquals(13,actual);
	}
	
	@Test
	void testNegativeNthPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(-6);
		assertEquals(0,actual);
	}
	
	@Test
	void test0thPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(0);
		assertEquals(0,actual);
	}
	
	@Test
	void test1stPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(1);
		assertEquals(2,actual);
	}
	
	@Test
	void test100thPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(100);
		assertEquals(541,actual);
	}
	
	@Test
	void test1000thPrimeNumber() {
		int actual =  PrimeNumber.findPrimeNumberAt(1000);
		assertEquals(7919,actual);
	}

}
