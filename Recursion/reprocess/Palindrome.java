class Palindrome
{
	public static void main(String as[])
	{
		System.out.print(isPalindrome(as[0], 0, as[0].length()-1));
	}
	static boolean isPalindrome(String s, int x, int y)
	{
		if(x==y)
			return true;
		if(s.charAt(x)==s.charAt(y) && isPalindrome(s,x+1,y-1))
			return true;
		return false;
	}
}