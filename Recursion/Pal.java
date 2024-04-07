public class Pal
{
	public static void main(String as[])
	{
		String str = as[0];
		System.out.println(checkPal(str, 0, str.length()-1));
	}

	static boolean checkPal(String str, int x, int y)
	{
		if(x>=y)
			return true;
		if(str.charAt(x)==str.charAt(y) && checkPal(str,x+1,y-1))
			return true;
		else
			return false;
	}
}