/*
Remove duplicates from a sorted array

approach: traverse and remove adjacent duplicates, since it is sorted array
*/


class RemDup{
	public static void main(String as[]){
		int arr[] = {1,1,2,2,3,4,5,5,5,6,8};
		System.out.println(arr[0]);
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				System.out.println(arr[i]);
			}
		}
	}
}