import java.util.ArrayList;
import java.util.Hashtable;

public class MyHashKV
{
	int BUCKET;
	ArrayList<Hashtable<Integer,String>> table;

	public MyHashKV(int n)
	{
		BUCKET = n;
		table = new ArrayList<Hashtable<Integer,String>>(BUCKET);
		for(int i=0;i<n;i++)
		{
			table.add(new Hashtable<Integer,String>());
		}
	}

	public void insert(Integer x, String s)
	{
		int hash = x%BUCKET;
		table.get(hash).put(x,s);
	}

	public void delete(Integer x)
	{
		int hash = x%BUCKET;
		table.get(hash).remove(x);
	}

	public String search(Integer x)
	{
		int hash = x%BUCKET;
		return table.get(hash).get(x);
	}

	public void display()
	{
		System.out.println(table);
	}
}