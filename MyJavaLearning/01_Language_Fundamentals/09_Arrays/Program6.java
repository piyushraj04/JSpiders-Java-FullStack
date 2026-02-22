class Program6
{
	public static void main(String [] args)
	{
		int[] arr = {13,16,18,15,17};
		for(int i = arr.length-1;i>=0;i--)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println("the value at index "+i + "is : "+arr[i]);
			}
		}
	}
}