package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.EvenOdd;

public class EvenOdd_test {
	@Test  // annotation specifies that method is the test method
	public void max()  {
		assertEquals(true,EvenOdd.findEvenOdd(6));
		
	}

}
