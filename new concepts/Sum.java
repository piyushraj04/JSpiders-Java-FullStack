import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = 1;
		System.out.println("Enter the no till which you want the total sum:");
		int y = sc.nextInt();
		int sum = 0;
		
		while(x<=y){
			sum = sum+x;
			x++;
		}
		System.out.println("Total sum is : " + sum );
	}
	
}