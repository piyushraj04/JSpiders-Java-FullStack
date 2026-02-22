package org.jsp.Methods;

import java.util.Scanner;

public class FindNtothePowerQ {
	
	public static int nToThePowerOfQ(int n,int q) {
		int res=1;
		for(int i = 1; i <= q; i++) {
			res=res*n;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int n = sc.nextInt(); 
		System.out.println("Enter the q: ");
		int q = sc.nextInt();
		System.out.println(nToThePowerOfQ(n,q));
		sc.close();
	}

}
