/*
Reverse an Array

approach: traverse with two pointers at start and end...
ad swap everything untill we reach middle element..
thats it.
*/

import java.util.Arrays;

class RevArr{
	public static void main(String as[]){
		int arr[]= {1,2,3,4,5,6,7,8};

		for(int i=0, j=arr.length-1;i<j;i++,j--){
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}

		System.out.println(Arrays.toString(arr));
	}
}