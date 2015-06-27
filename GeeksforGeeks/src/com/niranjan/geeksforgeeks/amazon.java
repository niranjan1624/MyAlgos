package com.niranjan.geeksforgeeks;

import java.util.Arrays;

/* problem1:
 * 
 * Given an array of integers, {1,0,2,0,3,0,0,4,5,6,7,0,0,0},
 *  you have to create a new array
	which will be like (1,2,3,4,5,6,7,0,0,0,0,0,0,0},
 	without using any other temporary array.
 *
 */

public class amazon {
	public static void main(String[] args) {
		int[] input = {1,0,2,0,3,0,0,4,5,6,7,0,0,0};
		System.out.println(Arrays.toString(problem1(input)));
		
	}

	private static int[] problem1(int[] input) {
		int index=0,count;
		for (int i = 0; i < input.length;i++) {
			if (input[i]!=0){
				input[index++] = input[i];
			} 
		}
		count = input.length - index + 1;
		for (int j = 0; j < count-1;j++) {
			input[index++] = 0;
		}
		return input;
	}
}
