class UnaryPostOperator
{
	public static void main(String [] args)
	{
		//Increment
		
		
		int a = 7;
		System.out.println("The value of a is substitutes as 7 here and internally increment(+1) here :" + a++);
		System.out.println("The value of a is incremented by 1 here :" + a);
		
		//Ex.2
		int x = 13;
		System.out.println("The value of x is substitutes as 13 here and internally increment(+1) here :" + x++);
		System.out.println("The value of x is incremented by 1 here :" + x);
		
		//Ex.3
		int p = 12;
		int q = p++ + p++;
		System.out.println("The value of \"p++ + p++\" is : " + q);
		
		//Ex.4
		int m = 5;
		int n = m++ + m++ + m++;
		System.out.println("The value of \" m++ + m++ + m++\" is : " + n);
		
		
		//Ex.1
		int e = 17;
		int f = 12;
		int g = e-- + f++ + e-- + f++;
		System.out.println("The value of \"e-- + f++ + e-- + f++\" is : " + g);
		
		
		
		//Decrement
		
		
		int b = 5;
		System.out.println("The value of b is substitutes as 5 and internally decrement(-1) here :" + b--);
		System.out.println("The value of b is decremented by 1 here :" + b);
		
		int y = 19;
		System.out.println("The value of y is substituted as 19 here and decrease by (-1) : " + y--);
		System.out.println("The value of y is decremented by 1 here :" + y);
		
		//Ex.4
		int r = 15;
		int s = r-- + r--;
		System.out.println("The value of \"r-- + r--\" is : " + s);
		
		//Ex.1
		int u = 8;
		int v = u-- + u-- + u--;
		System.out.println("The value of \"u-- + u-- + u--\" is : " + v);
	}
}