package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.main.Average;

public class Average_test {
	@Test
	public void test() 
	{
		assertEquals(20,Average.Avg(10, 20, 30));
		assertEquals(10,Average.Avg(10, 20, 30));
	}

}
