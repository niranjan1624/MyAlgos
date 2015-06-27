package com.niranjan.algorithms;

import java.util.HashMap;
import java.util.HashSet;

//Dynamic Programming
public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		
		String s1 = "aabd";
		String s2 = "abad";
		
		findLenofLCS(s1,s2);
	
	}

	public static void findLenofLCS(String s1, String s2) {
		int m = s1.length(), n = s2.length();
		System.out.println(m+ " " + n);
		int[][] mem = new int[m+1][n+1];

		for(int i=0; i <= m; i++ ){
			mem[i][0] = 0;
		}
		for(int i=0; i <= n; i++ ){
			mem[0][i] = 0;
		}
		for(int i = 1; i<=m; i++){
			for (int j = 1; j <= n; j++){
				if(s1.charAt(i-1) == s2.charAt(j-1)){	
					mem[i][j] = 1 + mem[i-1][j-1];
				}
				else
					mem[i][j] = Math.max(mem[i-1][j],mem[i][j-1]);
			}
		}
		
		System.out.println(mem[m][n]);
		for(int i = m; i>=m; i++){
			for (int j = n; j >= n; j++){
				int x=0,y=0;
				//if(mem[i][j])
			}
		}
			}
		
	}


