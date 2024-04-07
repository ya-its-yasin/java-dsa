public class Test{
	public static void main(String as[]){
		printRev(5);
		printFor(5);
	}

	static void printRev(int x){
		if(x==0)
			return;
		System.out.print(x + " ");
		printRev(x-1);
	}

	static void printFor(int x){
		if(x==0)
			return;
		printFor(x-1);
		System.out.print(x + " ");
	}
}