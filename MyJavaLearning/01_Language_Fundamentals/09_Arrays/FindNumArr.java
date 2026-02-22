import java.util.Scanner;
class FindNumArr
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int [] arr ={20,32,25,65,68,15,24,89,75,31,6,5,8,88,2,759,9,99};
		System.out.println("Enter the number : ");
		int element = sc.nextInt();
		boolean flag = false;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println("the element "+ element+" is in the array at index : " + i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(element + " is not present in the array" );
		}
				
	}
}