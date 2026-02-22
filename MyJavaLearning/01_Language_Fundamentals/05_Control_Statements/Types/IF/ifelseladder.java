class ifelseladder
{
	public static void main(String [] args)
	{
		char ch = '#';
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("UPPER CASE");
		}
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("lower case");
		}
		else if(ch >= '0' && ch <= '9')
		{
			System.out.println("NUMBERS");
		}
		else
		{
			System.out.println("Special Characters");
		}
	}
}