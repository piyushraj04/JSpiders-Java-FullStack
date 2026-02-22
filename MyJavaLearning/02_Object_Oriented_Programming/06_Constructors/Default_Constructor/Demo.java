class Demo
{
	int a = 10;
	void test()
	{
		System.out.println("executing test()...");
	}
	public static void main(String [] args)
	{
		Demo ref = new Demo();
		System.out.println(ref.a);
		ref.test();
	}
}