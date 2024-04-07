class SumOfDigits
{
	public static void main(String as[])
	{
		System.out.println(getSum(Integer.parseInt(as[0])));
	}
	static int getSum(int n)
	{
		if(n<=9)
			return 1;
		return getSum(n/10) + (n%10);
	}
}