import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int noOfDivisors = 0;
		int x = sc.nextInt();
		int y = 2;
		if(x==1){
			System.out.println(x + " is not the Prime No");
		}
		else{
			while(y<=x/2){
			if(x%y==0){
				noOfDivisors++;
			}
			y++;
		}
		
		if(noOfDivisors==0){
			System.out.println(x + " is the Prime No");
		}else{
			System.out.println(x + " is not a Prime No");
		}
		}
	}
}