/*
Check if an Array is Sorted

check if adjacent elements are in proper order at every place
*/

class IsSorted{
	public static void main(String as[]){
		int[] arr = {1,3,5,7};
		boolean fl = true;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				fl = false;
				break;
			}
		}
		System.out.println(fl);
	}
}