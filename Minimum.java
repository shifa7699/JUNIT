package com.demo.main;

public class Minimum {
	public static int findMin(int[] arr)
	{
		int min = arr[0]; 
		//int max = Integer.MIN_VALUE;
		for(int i =0; i< arr.length; i++)
		{
			if(min>arr[i]) 
				min = arr[i];
		}
		return min;   
	}
}

