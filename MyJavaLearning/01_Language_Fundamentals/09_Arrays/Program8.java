class Program8
{
	public static void main(String [] args)
	{
		int[] arr = {13,16,18,15,17};
		int sum = 0;
		for(int i = arr.length-1;i>=0;i--)
		{
			if(arr[i] % 2 == 0)
			{
				sum += arr[i];
			}
		}
		System.out.println("Even sum = " + sum);
	}
}