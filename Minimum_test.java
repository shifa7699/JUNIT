package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Minimum;

public class Minimum_test {
	@Test  
	public void min()  {
		assertEquals(3,Minimum.findMin(new int[] {7,4,9,3,6,5}));
		assertEquals(-4,Minimum.findMin(new int[] {-10,-11,-23,-4,-21}));
	}
}



