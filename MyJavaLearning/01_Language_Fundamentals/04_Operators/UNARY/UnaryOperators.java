class UnaryOperators
{
	public static void main(String[] args)
	{
		int a = 12;
		int b = 6;
		int c = ++a + --b + ++a + --b;
		System.out.println(c);
		
		//ex.2
		
		int x  = 10;
		int y = x++ + ++x;
		System.out.println(y);
		
		
		//EX.3
		int p = 15;
		int q = --p + p--;
		System.out.println(q);
		
		//Ex.4
		
		int d = 14;
		int e = 17;
		int f = ++d + e-- + d-- + ++e;
		System.out.println(f);
		
		
	}
	
}