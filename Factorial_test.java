package com.demo.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Factorial;

public class Factorial_test {
	@Test  // annotation specifies that method is the test method
	public void fact()  {
		assertEquals(120,Factorial.findfactorial(5));	
		//assertEquals(130,Factorial.findfactorial(5));	
	}
}
