package org.jsp.Methods;

import java.util.Scanner;

public class FindFactorial {
	
	public static int findFactorial(int n) {
		int res = 1;
		for(int i = n; i > 0; i--) {
			res = res*i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : " );
		int n = sc.nextInt();
		System.out.println(findFactorial(n));
		sc.close();
	}

}
