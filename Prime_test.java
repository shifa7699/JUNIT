package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Prime;

public class Prime_test {
	@Test
	public void test()
	{
		assertEquals(true,Prime.findPrime(3));
		assertEquals(false,Prime.findPrime(3));
		assertEquals(true,Prime.findPrime(0));
		assertEquals(true,Prime.findPrime(2));
		assertEquals(true,Prime.findPrime(-1));
	}
}
