class UnaryPreOperator
{
	public static void main(String[] args)
	{
		int a = 4;
		System.out.println(++a);
		System.out.println(a);
		
		int b = 8;
		System.out.println(--b);
		System.out.println(b);
		
		int x = 13;
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(x);
		
		int y = 18;
		System.out.println(--y);
		System.out.println(--y);
		System.out.println(y);
		
		int e = 10;
		int f = ++e + ++e;
		System.out.println(f);
		
		int c  = 10;
		int d = --c + --c;
		System.out.println(d);
		
		int g = 14;
		int h = ++g + ++g + ++g;
		System.out.println(h);
		
		int i = 13;
		int j = --i + --i + --i;
		System.out.println(j);
	}
	
}