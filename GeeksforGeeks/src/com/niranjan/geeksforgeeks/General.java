package com.niranjan.geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class General {
	
	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
	    int[] numbers = new int[input.nextInt()];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextInt();
	    }
	    input.close();
		//System.out.println(Arrays.toString(replaceByMul(numbers)));
	    System.out.println("Single Occured element is:  " + findSingleOccurEle(numbers));
	    int[] arr = {2, 31, 17, 3, 7, 13, 11, 23, 37, 5, 29};
	    System.out.println(findMissingPrime(sortArray(arr)));
	}

	public static int[] sortArray(int[] arr) {
		// sort algorithm
		
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		//System.out.println(arr);
		return arr;
	}

	private static int findSingleOccurEle(int[] numbers) {
		int res = numbers[0];
		for(int i = 1;i<numbers.length;i++) {
			res = res ^ numbers[i];
		}
		return res;
	}

	@SuppressWarnings("unused")
	private static int[] replaceByMul(int[] arr) {
		// TODO Auto-generated method stub
		int left = 0,right = 0,temp;
		for(int i = 0; i < arr.length; i++) {
			if (i == 0) {
				left  = arr[i];
				right = arr[i+2];
			//	System.out.println(arr[i] + " * " + arr[i+1]);
				arr[i] = arr[i] * arr[i+1];
				
			} else if (i == arr.length - 1) {
				//System.out.println(left + " * " + arr[i]);
				arr[i] = left * arr[i];
				
			} else {
				//System.out.println(left + " * " + right);
				temp = left * right;
				
				left = arr[i];
				if (i < arr.length - 2)
					right = arr[i+2];
				arr[i] = temp;
			}
		}
		return arr;
	}
	
	/*Find the missing prime number in the the unordered list of prime numbers.

	Sample Input: 2, 31, 17, 3, 7, 13, 11, 23, 37, 5, 29
	Sample Output: 19*/
	public static int findMissingPrime(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr[i] + 1; j<arr[i+1];j++) {
				if(checkIfPrime(j))
					return j;
			}
		}
		return 0;
	}

	private static boolean checkIfPrime(int j) {
		for (int i = 2; i < (j/2)+1; i++) {
			if(j%i == 0) 
				return false;
		}
		return true;
	}
}
