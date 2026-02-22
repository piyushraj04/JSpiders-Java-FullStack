import java.util.Scanner;
class PerfectNo{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no:");
		int num = sc.nextInt();
		int div = 1;
		int sum = 0;
		while(div<=num/2){
			if(num%div==0){
				sum+=div;
			}
			div++;
		}
		if(sum==num){
			System.out.println(num + " is the perfect no");
		}else{
			System.out.println(num + " is not the perfect no");
		}
	}
}