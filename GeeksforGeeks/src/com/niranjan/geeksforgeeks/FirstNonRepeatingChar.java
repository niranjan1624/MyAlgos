package com.niranjan.geeksforgeeks;

import java.util.ArrayList;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String s = "nnniir";
		System.out.println(findFirstNonRepeatChar1(s));
	}

	private static String findFirstNonRepeatChar1(String s) {

		ArrayList<Integer> seen=new ArrayList<Integer>();
		for (int i=0; i<s.length();i++) {
			if (!seen.contains(i)) {
				boolean firstNon = false;
				for(int j = i+1; j<(s.length());j++) {
					if(s.charAt(i) == s.charAt(j)) {
						firstNon = true;
						seen.add(j);
					}
				}
				if (!firstNon) {
					return "First Non repeating Charcter is " +  s.charAt(i);
				}
			}
		}
		return "Non repeating character is not present";
	}
	
}
