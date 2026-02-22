class Program3
{
	static char play()
	{
		return 'J';
	}
	static boolean send()
	{
		return false;
	}
		
	public static void main(String [] args)
	{
	        boolean bool = send();
			
			System.out.println("Program starts");
			System.out.println("Returned value is :" + play());
			System.out.println("Returned value is :" + bool);
			System.out.println("Program ends");
	}
}