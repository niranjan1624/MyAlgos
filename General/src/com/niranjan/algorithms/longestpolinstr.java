package com.niranjan.algorithms;

public class longestpolinstr {
	
	public static void main(String[] args) {
		String str = "aabbccbbaba";
		findLongestPolindrominString(str);
	}

	private static void findLongestPolindrominString(String str) {
		String pol = "";
		int x =0;
		for(int i = 0; i < str.length(); i++) {
			for(int j =0; j < str.length(); j++)
				if(str.charAt(i) == str.charAt(j))
					pol = pol + str.charAt(i);
				else {
					pol = "";
					if(j == str.length() -1) {
						x = x +1;
						i = x;
					}
					else
						i = x;
				}
		}
		System.out.println(pol);
	}
}
