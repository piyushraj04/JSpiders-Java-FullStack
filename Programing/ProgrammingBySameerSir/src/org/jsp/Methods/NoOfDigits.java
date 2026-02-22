package org.jsp.Methods;

import java.util.Scanner;

public class NoOfDigits {
	
	public static int noOfDigits(int n) {
		int cnt = 0;
		while(n>0) {
			cnt++;
			n = n/10;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		
		System.out.println("The no of digits in "+ n + " is = "+noOfDigits(n));
		
		sc.close();
		
	}

}
