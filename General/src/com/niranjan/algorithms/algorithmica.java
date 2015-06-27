package com.niranjan.algorithms;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] out = new int[2];
		sequenceGenerater(0,2,out);
	}
	public static void sequenceGenerater(int d, int n, int[] out) {
	if (d==n) {
	 	System.out.println(Arrays.toString(out));
		return;
	}
	for(int i=0;i < n;i++) {
 		out[d]	= i;
 		System.out.println(d+","+i);
 		sequenceGenerater(d+1, n, out);
	}
	
}
}
