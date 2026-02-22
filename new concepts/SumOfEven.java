import java.util.Scanner;
class SumOfEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int x = sc.nextInt();
		int y = 1;
		int sum = 0;
		while(y<=x){
			if(y%2!=0){
				sum += y;
			}
			y++;
		}
		System.out.println("The sum of even no is : "+ sum);
	}
}