class Split
{
	public static void main(String[] args)
	{
		String str = "jspider Qspider Pyspider ";
	
	
	    System.out.println();
		
		
		String[] arr = str.split(" "); //split after spaces
		for(int i = 0; i <arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println();
		
	
		String[] arr2 = str.split("id");  //split after id
		for(int i = 0; i <arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		System.out.println();
		
		
		String[] arr3 = str.split("s");  // split after s
		for(int i = 0; i <arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}