import java.util.Scanner;
class FibonacciSeries{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nthTerm = sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int fib3 = fib1 + fib2;
		while(nthTerm>0){
			System.out.println(fib1);
			fib1 = fib2;
			fib2 = fib3;
			fib3 = fib1 + fib2;
			nthTerm--;
		}
	}
}