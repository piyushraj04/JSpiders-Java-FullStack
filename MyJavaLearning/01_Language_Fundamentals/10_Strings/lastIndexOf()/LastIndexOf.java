class LastIndexOf
{
	public static void main(String[] args)
	{
		String str = "Developer";
		System.out.println(str.lastIndexOf('v'));  //3
		System.out.println(str.lastIndexOf('p'));
		System.out.println(str.lastIndexOf('L'));
		System.out.println(str.lastIndexOf('M'));
		int p = str.lastIndexOf('e');
		System.out.println(p);
		int q = str.lastIndexOf('e',p-1);
		System.out.println(q);
		int r = str.lastIndexOf('e',q-1);
		System.out.println(r);
		int s = str.lastIndexOf('e',r-1);
		System.out.println(s);
	}
}