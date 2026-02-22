class IndexOf
{
	public static void main(String[] args)
	{
		String str = "karnataka";
		System.out.println(str.indexOf('n'));  //3
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('a'));
		int p = str.indexOf('a');
		System.out.println(p);
		int q = str.indexOf('a',p+1);
		System.out.println(q);
		int r = str.indexOf('a',q+1);
		System.out.println(r);
	}
}