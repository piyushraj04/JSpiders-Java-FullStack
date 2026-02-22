package org.jsp.Methods;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			sum=sum*10+(n%10);
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		
		System.out.println("The sum of digits of "+ n + " is = "+sumOfDigits(n));
		
		sc.close();
		
	}

}
