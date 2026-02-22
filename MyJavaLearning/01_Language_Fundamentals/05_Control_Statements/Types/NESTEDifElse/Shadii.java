class Shadii
{
	public static void main(String[] args)
	{
		char gender = 'M';
		int age = 15;
		
		if(gender == 'M')
		{
			if(age >= 21)
			{
				System.out.println("Eligibal Bachelor");
			}
			else
			{
				System.out.println("Boy Underage");
			}
		}
		else if(gender == 'F')
		{
			if(age >= 18)
			{
				System.out.println("Eligible Spinster");
			}
			else
			{
				System.out.println("Girl Underage");
			}
		}
	}
}