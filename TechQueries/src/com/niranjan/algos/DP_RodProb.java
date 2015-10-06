package com.niranjan.algos;

import java.util.Arrays;

/*Max Price By Selling Pieces Of A Rod

Question: You are given a rod of length 'L' and an array of prices where 
price at each index is the price obtained by selling rod of length equal 
to that index. You need to find the maximum price, you can get by selling pieces of rod.

Note: Rod can be sold in as many pieces of integer length as you want. 
You may also sell the rod as a whole if that gets you maximum price.

Example: Lets say, there is rod of length 8 units with price array given below:

[0, 3, 7, 8, 9, 12, 13, 19, 20]

We have put 0 at 0th index to show price of length 0.

for this particular example, maximum selling price will be 28 by 
cutting the rod in 4 pieces of length 2.*/
public class DP_RodProb {
	public static void main(String[] args) {
		int[] price = {0,3,7,8,9,12,13,19,20,21,30,32};
		findMaxPrice(price);
		findMaxPrice1(price);
	}
// perfect algorithm
	public static void findMaxPrice(int[] price) {
		int[] maxPrice = new int[price.length];int p;
		maxPrice[1] = price[1];
		for(int i = 2; i < price.length;i++) {
			maxPrice[i] = price[i];
			for(int j=1; j<i/2+1;j++) {
				p = maxPrice[j]+maxPrice[i-j];
				if(p>maxPrice[i])
					maxPrice[i] = p;
			}
		}
				
		System.out.println(Arrays.toString(maxPrice));
	}
	// wrong code we need to check all possible combinations
	public static void findMaxPrice1(int[] price) {
		int[] maxPrice = new int[price.length];
		maxPrice[0] = price[0];
		maxPrice[1] = price[1];
		for(int i = 2; i < price.length; i++){
			maxPrice[i] = Math.max(maxPrice[i/2]+maxPrice[i-i/2], price[i]);
	}
		System.out.println(Arrays.toString(maxPrice));
	}
}
