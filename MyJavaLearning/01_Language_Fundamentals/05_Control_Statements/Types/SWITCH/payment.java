class payment
{
	public static void main(String[] args)
	{
		int choice = 3;
		
		switch (choice)
		{
			case 1 : System.out.println("COD");
			break;
			case 2 : System.out.println("CARD");
			break;
			case 3 : System.out.println("UPI");
			break;
			case 4 : System.out.println("NET BANKING");
			break;
			
			default : System.out.println("Invalid Selection");
		}
	}
}