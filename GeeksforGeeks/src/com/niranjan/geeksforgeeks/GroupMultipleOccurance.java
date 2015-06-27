package com.niranjan.geeksforgeeks;

import java.util.Arrays;

public class GroupMultipleOccurance {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
		System.out.println(Arrays.toString(groupMultipleOccurance(arr)));
	}
	public static int[] groupMultipleOccurance(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length;j++) {
				
				if (arr[i] == arr[j]) {
					temp = arr[i+1];
					arr[i+1] = arr[j];
					arr[j] = temp;
					//	System.out.println(arr[i+1] + "  "+ arr[j] + "  " + i + " " + j);
					
				}
			}
		}
		return arr;
	}
}
