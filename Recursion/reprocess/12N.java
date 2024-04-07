class PrintNumbers
{
	public static void main(String as[])
	{
		printNum(5);
	}
	static void printNum(int n)
	{
		if(n==0)
			return;
		printNum(n-1);
		System.out.print(n+ " ");
	}
}