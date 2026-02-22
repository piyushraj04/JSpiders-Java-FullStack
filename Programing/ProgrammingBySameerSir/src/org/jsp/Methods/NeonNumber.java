package org.jsp.Methods;

public class NeonNumber {
	public static int sumOfDigitsOfSquare(int sq) {
		int sum = 0;
		while(sq>0) {
			sum+=sq%10;
			sq/=10;
		}
		return sum;
	}
	public static boolean isNeon(int n) {
		int sq = n * n;
		
		return n==;
	}
	
	public static void main(String[] args) {
		
	}

}
