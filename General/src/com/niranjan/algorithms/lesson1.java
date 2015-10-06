package com.niranjan.algorithms;

/*Divide and conquer algorithm - find a peak 1-D

Greedy assent algorithm -  find a peak in 2-D*/

public class lesson1 {

	public static void main(String[] args) {
						
		int[] array = {1,2,3,3,3,4,5,10,10,20,20,21,22,23,3,3,3,3,3,2,1};
		System.out.println(findPeak(array, 0, array.length-1));
		System.out.println(findPeak1(array, 0, array.length));
	}
	
	public static int findPeak(int[] array, int low, int high) {
		if (low == high) {
			return array[low];
		}
		if (array[low] > array[low+1] && high == low+1) {
			return array[low];
		}
		int mid = (low + high)/2;
		
		if (array[mid] < array[mid+1] && array[mid] > array[mid-1]) {
			return findPeak(array, mid+1, high);
		}
		else if (array[mid] > array[mid+1] && array[mid] < array[mid-1]) {
			return findPeak(array, low, mid-1);
		} else if (array[mid] == array[mid-1] || array[mid] == array[mid+1]) {
			for (int i = mid; i < high; i++) {
				if (array[i] > array[i+1])
					return findPeak(array, low, mid-1);
				else if (array[i] < array[i+1])
					return findPeak(array, mid+1, high);
			}
		} else {
			return array[mid];
		}
		
		return 0;
	}
	
	// giving wrong 
	public static int findPeak1(int[] array, int low, int high) {
		System.out.println(low + " | " + high);
		int mid = (low+high)/2;
		int n = array.length;
		if ((mid==0 || array[mid]>=array[mid-1]) && (mid == n-1 || array[mid]>array[mid+1]))
			return array[mid];
		else if (array[mid] < array[mid-1]) 
			return findPeak1(array, low, mid-1);
		else 
			return findPeak1(array, mid+1, high);
	}
	public int greedyAscentAlgorithm(int[][] array) {
		return 3;
	}
	
}
