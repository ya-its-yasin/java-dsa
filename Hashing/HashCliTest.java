import java.util.Scanner;
public class HashCliTest
{
	public static void main(String as[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of bucket -> ");
		MyHash hash = new MyHash(sc.nextInt());
		int inp = 0;
		while(inp!=-1)
		{
			System.out.print("""
				1. insert
				2. delete
				3. search
				-1. exit
				""");
			inp = sc.nextInt();
			switch(inp)
			{
				case 1:
					System.out.print("Enter value to insert -> ");
					hash.insert(sc.nextInt());
					break;

				case 2:
					System.out.print("Enter value to delete -> ");
					hash.delete(sc.nextInt());
					break;

				case 3:
					System.out.print("Enter value to search -> ");
					System.out.println(hash.search(sc.nextInt()));
					break;

				default: 
					inp = -1;
					break;
			}
			hash.display();
		}
	}
}