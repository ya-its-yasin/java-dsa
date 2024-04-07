import java.util.ArrayList;
import java.util.LinkedList;
public class MyHash
{
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;

	MyHash(int n)
	{
		BUCKET = n;
		table = new ArrayList<LinkedList<Integer>>(BUCKET);
		for(int i=0;i<BUCKET;i++)
			table.add(new LinkedList<Integer>());
	}

	public void insert(Integer x)
	{
		int hash = x%BUCKET;
		table.get(hash).add(x);
	}

	public void delete(Integer x)
	{
		int hash = x%BUCKET;
		table.get(hash).remove(x);
	}

	public boolean search(Integer x)
	{
		int hash = x%BUCKET;
		return table.get(hash).contains(x);
	}

	public void display()
	{
		System.out.println(table);
	}
}