public class toh
{
	public static void main(String as[])
	{
		findtoh(3, 'A', 'B', 'C', 0);
	}

	static void findtoh(int n, char a, char b , char c, int cnt)
	{
		if(n==1)
		{
			System.out.println("moving 1 plate from " + a + " to " + c + ", total moves - " + ++cnt);
			return ;
		}
		findtoh(n-1, a, c, b, ++cnt);
		System.out.println("moving " + n + "th plate from " + a + " to " + c + ", total moves - " + ++cnt);
		findtoh(n-1, b, a, c, ++cnt);
	}
}