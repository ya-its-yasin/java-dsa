public class Sum
{
	public static void main(String as[])
	{
		System.out.println(getSum(5));
	}
	static int getSum(int n)
	{
		if(n==0)
			return 0;
		return n + getSum(n-1);
	}
}