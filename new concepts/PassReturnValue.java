import java.util.Scanner;
class PassReturnValue{
	static boolean verify(int a){
		if(a%2==0){
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args){
		verify(10);
		System.out.println(verify(5));
		boolean res = verify(3);
		System.out.println(res);
	}
	
}