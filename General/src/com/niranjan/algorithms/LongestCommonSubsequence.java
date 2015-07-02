package com.niranjan.algorithms;

import java.util.HashMap;
import java.util.HashSet;

//Dynamic Programming
public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		
		String s1 = "aabd";
		String s2 = "abad";
		
		findLenofLCS(s1,s2);
		System.out.println(lcs(s1,s2));
	
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
		StringBuffer sb = new StringBuffer();

		for(int i = 1; i<=m; i++){
			for (int j = 1; j <= n; j++){
				if(s1.charAt(i-1) == s2.charAt(j-1))
					mem[i][j] = 1 + mem[i-1][j-1];
				else 
					mem[i][j] = Math.max(mem[i-1][j],mem[i][j-1]);
			}
			
		}
		//not working
		/*int x = 1, y = 1;*/
		for (int x = s1.length(), y = s1.length();
		         x != 0 && y != 0; ) {
		        if (mem[x][y] == mem[x-1][y])
		            x--;
		        else if (mem[x][y] == mem[x][y-1])
		            y--;
		        else {
		            if(s1.charAt(x-1) == s2.charAt(y-1))
		            	sb.append(s1.charAt(x-1));
		            x--;
		            y--;
		        }
		    }
		System.out.println(mem[m][n]);
		System.out.println(sb.reverse().toString());
		}
	
	// Recursion
	public static String lcs(String a, String b){
	    int aLen = a.length();
	    int bLen = b.length();
	    if(aLen == 0 || bLen == 0){
	        return "";
	    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
	        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
	            + a.charAt(aLen-1);
	    }else{
	        String x = lcs(a, b.substring(0,bLen-1));
	        String y = lcs(a.substring(0,aLen-1), b);
	        return (x.length() > y.length()) ? x : y;
	    }
	}
		
	}


