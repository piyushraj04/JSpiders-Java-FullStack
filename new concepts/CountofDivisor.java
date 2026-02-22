import java.util.Scanner;
class CountofDivisor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = 1;
		System.out.println("Enter the no of which you want the no of divisor:");
		int y = sc.nextInt();
		int NoOfDivisors = 0;
		
		while(x<=y){
			if(y%x==0){
				System.out.println(x + " is the divisor of " + y);
				NoOfDivisors++;
			}
			else{
				System.out.println(x + " is not divisor of " + y);
			}
			x++;
		}
		System.out.println("Total NoOfDivisors is : " + NoOfDivisors );
	}
	
}