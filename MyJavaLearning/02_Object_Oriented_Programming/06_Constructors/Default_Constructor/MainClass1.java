class Sample
{
	int x;
	double y;
	String s;
}
public class MainClass1
{
	public static void main(String [] args)
	{
		Sample ref = new Sample();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.s);
	}
}