class TOH
{
	public static void main(String as[])
	{
		toh(3,'A','B','C');
	}
	static void toh(int n, char a, char b, char c)
	{
		if(n==1){
			System.out.println("Moving disk from " + a +" to " + c);
			return;
		}
		toh(n-1, a, c, b);
		System.out.println("Moving disk from " + a +" to " + c);
		toh(n-1, b, a, c);
	}
}