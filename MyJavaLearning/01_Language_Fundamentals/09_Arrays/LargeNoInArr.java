class LargeNoInArr
{
   public static void main(String [] args)
    {
		int [] arr = {12,13,45,62,24,53};
		int large  =  arr[0];
		for(int i = 1; i < arr.length;i++)
		{
			if(arr[i]>large)
			{
				large = arr[i];
			}
		}
		System.out.println("Largest val is " + large);
	
    }
}