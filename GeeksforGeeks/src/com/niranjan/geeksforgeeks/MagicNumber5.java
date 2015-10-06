package com.niranjan.geeksforgeeks;

import java.util.Scanner;

/*A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

Write a function to find the n’th Magic number.

Example:

Input: n = 2
Output: 25

Input: n = 5
Output: 130 */

public class MagicNumber5 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			magicNum(in.nextInt());
			in.close();
		}

		public static void magicNum(int nextInt) {
			
			int magNum = 0, i = 1;
			while(nextInt != 0) {
				magNum = (int) (magNum + (nextInt & 1) * Math.pow(5, i));
				i = i+1;
				nextInt = nextInt >> 1;
				
			}
			System.out.println(magNum);
		}
}
