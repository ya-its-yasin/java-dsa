public class ctr
{
	public static void main(String as[])
	{
		System.out.println(getCtr(5,2,2,2));
	}

	static int getCtr(int n, int a, int b, int c)
	{
		if(n==0) return 0;
		if(n<0) return -1;
		int res = Math.max(Math.max(getCtr(n-a,a,b,c),
							getCtr(n-b,a,b,c)),
							getCtr(n-c,a,b,c));
		if(res==-1) return -1;
		return res+1;
	}
}

