class RopeCutting
{
	public static void main(String as[])
	{
		System.out.println(getRes(23,12,9,11));
	}
	static int getRes(int n, int a, int b, int c)
	{
		if(n==0) return n;
		if(n<0) return -1;

		int res = Math.max(getRes(n-a,a,b,c), Math.max(getRes(n-b,a,b,c), getRes(n-c,a,b,c)));
		return (res<0) ? -1 : 1+res;

	}
}