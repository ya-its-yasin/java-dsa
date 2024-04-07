public class ss
{
	public static void main(String as[])
	{
		getss("ABC", "", 0);
	}

	static void getss(String s, String cur, int i)
	{
		if(i==s.length())
		{
			System.out.print(cur + "-");
			return;
		}
		getss(s, cur, i+1);
		getss(s, cur+s.charAt(i), i+1);
	}
}