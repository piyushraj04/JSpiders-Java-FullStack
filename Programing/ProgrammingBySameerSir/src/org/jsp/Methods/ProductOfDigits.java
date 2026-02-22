package org.jsp.Methods;

import java.util.Scanner;

public class ProductOfDigits {
	
	public static int productOfDigits(int n) {
		int pro = 1;
		while(n>0) {
			pro = pro*(n%10);
			n = n/10;
		}
		return pro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		
		System.out.println("The product of digits of "+ n + " is = "+productOfDigits(n));
		
		sc.close();
		
	}

}
