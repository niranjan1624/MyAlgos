package com.niranjan.algorithms;

import java.util.Arrays;

public class N_Queens {
	
	public static void main(String[] args) {
		int[] a = new int[4];
		auxQueens(0,a);
	}

	private static void auxQueens(int q,  int[] a) {
		if(q == a.length){ 
			System.out.println(Arrays.toString(a));
			return;
		}
		for(int i = 0; i < a.length; i++) {
			if(valid(q,i,a)) {
				a[q] = i;
				//System.out.println(q+"  "+i);
				auxQueens(q+1,a);
				
				
			}
		}
	}

	private static boolean valid(int cq, int cc, int[] a) {
		for(int i = 0; i < cq; i++) {
			if(a[i]==cc || cq-i == Math.abs(cc-a[i]))
				return false;
		}
		return true;
	}
}
