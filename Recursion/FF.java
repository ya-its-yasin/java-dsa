public class FF
{
	public static void main(String as[])
	{
		System.out.println(fac(0));
		System.out.println(fib(4));
	}
	static int fac(int x)
	{
		if(x<=1)
			return 1;
		return x*fac(x-1);
	}

	static int fib(int x)
	{
		if(x<=1)
			return x;
		return fib(x-1) + fib(x-2);
	}
}