package com.demo.main;

import java.util.StringTokenizer;

public class Junit_demo1 {
	public static int findMax(int[] arr)
	{
		int max = arr[0]; 
		//int max = Integer.MIN_VALUE;
		for(int i =0; i< arr.length; i++)
		{
			if(max<arr[i]) 
				max = arr[i];
		}
		return max;   
	}
	public static int square(int a)  {
		return a*a;
	}
	public static String reverseWord(String str)  {
		StringBuilder r= new StringBuilder();
		StringTokenizer tkn = new StringTokenizer(str ," ");
		while( tkn.hasMoreTokens())  {
			StringBuilder r1= new StringBuilder();
			r1.append(tkn.nextToken());
			r1.reverse();
			r.append(r1);
			r.append(" ");
		}
		return r.toString();
	}
}
