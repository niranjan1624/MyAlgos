package com.niranjan.geeksforgeeks;

public class SwapBits {

		public static void main(String[] args) {
			swapbits(20,0,3);
		}

		public static void swapbits(int n, int p1, int p2) {
			
			System.out.println(Integer.toBinaryString(n));
			   /* Move p1'th to rightmost side */
		    int bit1 =  (n >> p1) & 1;
		    System.out.println(Integer.toBinaryString(bit1));
		    /* Move p2'th to rightmost side */
		    int bit2 =  (n >> p2) & 1;
		    System.out.println(Integer.toBinaryString(bit2));
		    /* XOR the two bits */
		    int x = (bit1 ^ bit2);
		    System.out.println(Integer.toBinaryString(x));
		    /* Put the xor bit back to their original positions */
		    x = (x << p1) | (x << p2);
		    System.out.println(Integer.toBinaryString(x));
		    /* XOR 'x' with the original number so that the
		       two sets are swapped */
		   System.out.println( Integer.toBinaryString(n ^ x));;
		}
}
