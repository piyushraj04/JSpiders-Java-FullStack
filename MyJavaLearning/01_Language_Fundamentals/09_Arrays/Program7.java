class Program7
{
	public static void main(String [] args)
	{
		double[] arr = {2.5,5.2,8.2,17.1,19.7,28.4};
		double sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum is : " + sum);
	}
}