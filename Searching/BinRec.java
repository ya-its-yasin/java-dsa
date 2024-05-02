/*
Binary search recursive
*/

class BinRec{
	public static void main(String as[]){
		System.out.println(search(new int[]{1,2,3,5,5,6,7,9},Integer.parseInt(as[0]), 0, 7));
	}

	public static int search(int arr[], int x, int l, int r){
		int mid = ( l + r ) / 2;
		if(l>r) return -1;
		if(arr[mid]==x){
			return mid;
		}else if(arr[mid]>x){
			return search(arr,x,l,mid-1);
		}else{
			return search(arr,x,mid+1,r);
		}
	}
}


