class SelectionSort
{
	public static void main(String [] args)
	{
		int[] arr = {13,11,14,12,15};
		System.out.println("Before Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = i+1; j < arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int t = arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("After Sorted");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}