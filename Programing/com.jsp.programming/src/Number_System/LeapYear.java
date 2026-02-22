package Number_System;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = sc.nextInt();
		
		
//		if(y%4==0 && y%100!=0 || y%400==0)
//		{
//			System.out.println("leap");
//		}
//		else
//		{
//			System.out.println("not leap year");
//		}
		
		
		//by method
		
		System.out.println(Year.isLeap(y));
		
	}
}
