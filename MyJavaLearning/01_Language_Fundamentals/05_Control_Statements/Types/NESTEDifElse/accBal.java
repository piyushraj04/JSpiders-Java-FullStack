class accBal
{
	public static void main(String[] args)
	{
		double accBal = 10000.0;
		int amt = 3030;
		if(amt <= accBal)
		{
			if(amt%100 == 0)
			{
				System.out.println("Withdrawel Success");
			}
			else
			{
				System.out.println("Invalid Determination");
			}
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}