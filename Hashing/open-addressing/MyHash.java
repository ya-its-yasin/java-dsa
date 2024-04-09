import java.util.Arrays;  

public class MyHash{
	int size=0,cap=0;
	int arr[];

	public MyHash(int n){
		cap = n;
		arr = new int[cap];
		for(int i=0;i<cap;i++){
			arr[i]=-1;
		}
	}

	int getHash(int key){
		return key % cap;
	}

	public boolean insert(int key){
		showHashTable();
		if(size==cap)
			return false;
		int i = getHash(key);
		int h =i;
		while(true){
			if(arr[i]==-1 || arr[i]==-2){
				arr[i]=key;
				size++;
				return true;
			}
			else{
				i = (i+1) % cap;
			}

			if(arr[i]==key || i==h){
				return false;
			}
		}

	}

	public int search(int key){
		showHashTable();
		int i = getHash(key);
		int h = i;
		while(arr[i]!=-1){
			if(arr[i]==key)
				return i;
			i=(i+1) % cap;
			if(i==h)
				return -1;
		}
		return -1;
		
	}

	public boolean delete(int key){
		showHashTable();
		int loc = search(key);
		if(loc!=-1){
			arr[loc]=-1;
			return true;
		}
		return false;
	}



	public void showHashTable(){
		System.out.println(Arrays.toString(arr));
	}

}









