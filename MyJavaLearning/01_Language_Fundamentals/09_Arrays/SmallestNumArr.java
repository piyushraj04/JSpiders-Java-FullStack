class SmallestNumArr
{
	public static void main(String [] args)
	{
		int [] arr ={20,32,25,65,68,15,24,89,75,31,6,5,8,88,2,759,9,99};
		int small = arr[0];
		for(int i = 1;i < arr.length;i++)
		{
			if(arr[i]<small)
			{
				small = arr[i];
			}
		}
		System.out.println("the smallest in the array is : " + small);
			
	}
}