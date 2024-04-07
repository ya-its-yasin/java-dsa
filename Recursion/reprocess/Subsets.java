class Subsets
{
	public static void main(String as[])
	{
		generateSubsets("ABC", "", 0);
	}

	static void generateSubsets(String s, String cur, int i)
	{
		if(i==s.length())
		{
			System.out.println(cur);
			return;
		}
		generateSubsets(s,cur,i+1);
		generateSubsets(s,cur+s.charAt(i),i+1);
	}
}