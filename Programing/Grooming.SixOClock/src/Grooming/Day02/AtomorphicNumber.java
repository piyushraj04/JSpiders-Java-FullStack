package Grooming.Day02;


public class AtomorphicNumber {
	
	public static int cntOfDigit(int n) {
		int cnt = 0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}


	public static int mod(int cnt) {
		int mod = 1;
		for(int i = 1; i <= cnt; i++) {
			mod = mod*10;
		}
		return mod;
	}
	
	public static boolean isAtomorphic(int n) {
		int sq = n*n;
		int cntOfDigits = cntOfDigit(n);
		int mod = mod(cntOfDigits);
		int ldSq = sq % mod;
		
		return n==ldSq;
	}
	
	public static void main(String[] args) {
		int n = 24;
		
		System.out.println(isAtomorphic(n));
	}

}
