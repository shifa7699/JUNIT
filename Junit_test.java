package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.main.Junit_demo1;

public class Junit_test {
	@BeforeClass
	public static void beforecl() throws Exception {
		System.out.println("Before the class will implement");
	}
	@Before
	public void before() throws Exception {
		System.out.println("Using before class");
	}
	@Test  // annotation specifies that method is the test method
	public void max()  {
		assertEquals(8,Junit_demo1.findMax(new int[] {1,3,4,2,8}));
		assertEquals(-1,Junit_demo1.findMax(new int[] {-12,-1,-3,-4,-2}));
	}
	@Test
	public void findsquare()  {
		assertEquals(4,Junit_demo1.square(2));
	}
	@Test
	public void Reverse() {
		assertEquals("emocleW ",Junit_demo1.reverseWord("Welcome"));
	}
	@After
	public void after()  {
		System.out.println("Using after Class");
	}
	@AfterClass
	public static void aftercl() throws Exception {
		System.out.println("After the class will implement");
	}
}
