public class MyHashTest{
	public static void main(String as[]){
		MyHash h = new MyHash(7);
		h.insert(49);
		h.insert(56);
		h.insert(72);

		System.out.println(h.search(56));
		h.delete(56);
		System.out.println(h.search(56));

		h.showHashTable();
	}
}