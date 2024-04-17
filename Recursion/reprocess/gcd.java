/*
Euclidan Algorithm for GCD of two numbers.


*/

class gcd{
	public static void main(String as[]){
		System.out.println(gcd(6,8));
	}
	static int gcd(int a, int b){
		if(b==0)
			return a;
		System.out.println(b + ", " + a%b);
		return gcd(b,a%b);
	}
}