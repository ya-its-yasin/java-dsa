/*
Binary search iterative

*/

class BinIter{
	public static void main(String as[]){
		int arr[] = {1,2,3,5,6,8,8,12};
		int find = Integer.parseInt(as[0]);
		int l = 0, r = arr.length-1;

		while(l<=r){
			int mid = ( l + r ) / 2;
			if(arr[mid]==find){
				System.out.println(mid);
				return;
			}else if(arr[mid]>find){
				r = mid-1;
			}else{
				l = mid+1;
			}
		}
		System.out.println(-1);

	}
}