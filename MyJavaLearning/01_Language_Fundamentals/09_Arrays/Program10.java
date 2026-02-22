class Program10
{
	public static void main(String [] args)
	{
		int[] arr = {13,16,18,15,17};
		int sum = 0;
		for(int i = arr.length-1;i>=0;i--)
		{
			sum += arr[i];	
		}
        double avg = sum/arr.length;
		System.out.println("avg is : "+avg);
	}
}