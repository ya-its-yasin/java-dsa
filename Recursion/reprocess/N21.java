class N21
{
	public static void main(String as[])
	{
		printNum(5);
	}

	static void printNum(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		printNum(n-1);
	}
}