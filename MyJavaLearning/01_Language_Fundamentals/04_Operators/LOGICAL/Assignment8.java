class Assignment8
{
	public static void main(String [] args)
	{
		int x , y = 1;
		x = 10;
		if (x != 10 && x / 0 == 0)
			System.out.println(y);
		else
			System.out.println(++y);
		
		int a = 1, b = 2, c = 5;
		System.out.println(!((a+2)==(1+2)));
		System.out.println(!(b == c));
		System.out.println(!(c&gt;a));
	}
}