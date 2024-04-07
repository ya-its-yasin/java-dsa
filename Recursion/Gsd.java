public class Gsd
{
	public static void main(String as[])
	{
		System.out.println(gsd(10));
	}
	static int gsd(int n)
	{
		if(n<=0)
			return 0;

		return (n%10) + gsd(n/10);
	}
}