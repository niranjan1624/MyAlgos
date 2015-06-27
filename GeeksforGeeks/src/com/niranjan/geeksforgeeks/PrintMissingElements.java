package com.niranjan.geeksforgeeks;

public class PrintMissingElements {
	public static void main(String[] args) {
		
		int[] arr = {88, 105, 3, 2, 200, 0, 10};
		
		int[] standard_arr = new int[arr.length + 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 100) {
				//System.out.println(index);
				standard_arr[index] = arr[i];
				index++;
				
			}
		}
		/*int[] sortedArray = sortArray(standard_arr, index);
		for(int k =0; k<standard_arr.length; k++) 
			System.out.println(standard_arr[k]);*/
		findMissingElements(standard_arr, index);
	
	}
	
	public static void findMissingElements(int[] arr, int index) {
		int first = 0;
		int[] sortedArray = sortArray(arr, index);
		int i =0;
		for (i =0; i < index; i++) {
			if(sortedArray[i] != first) {
				int last = sortedArray[i] - 1;
				if (first  != sortedArray[i] - 1) 
					System.out.println(first + "-" + last);
				else
					System.out.println(first);
			}
			first = sortedArray[i] + 1;
		}
		if (sortedArray[i-1] != 99) {
			System.out.println(first + "-" + 99);
		}
	}
	public static int[] sortArray(int[] arr, int index1) {
		// sort algorithm
		
		for (int i = 0; i < index1; i++) {
			int index = i;
			for (int j = i+1; j < index1; j++) {
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
}
