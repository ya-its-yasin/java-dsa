class SumOfDigits
{
	public static void main(String as[])
	{
		System.out.println(getSum(Integer.parseInt(as[0])));
	}
	static int getSum(int n)
	{
		if(n<=9)
			return n;
		return getSum(n/10) + n%10;
	}
}