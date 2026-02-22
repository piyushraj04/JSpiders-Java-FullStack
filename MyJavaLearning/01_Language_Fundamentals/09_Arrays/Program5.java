class Program5
{
	public static void main(String [] args)
	{
		int[] arr = {10,12,15,17,18};
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2==0)
			{
				System.out.println("the value at index "+i + "is : "+arr[i]);
			}	
		}
	}
}