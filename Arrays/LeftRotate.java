/*
Left Rotate an Array by D places

wonderfull approach by gfg:
reverse the array from 0 to d-1,
then reverse the array from d to n,
then reverse the whole array..

as simple as that...
*/

import java.util.Arrays;
class LeftRotate{
	public static void main(String as[]){
		int arr[] = {1,2,3,4,5};
		int d = 3;

		arr = reverse(arr, 0,d-1);
		System.out.println(Arrays.toString(arr));
		arr = reverse(arr, d,arr.length-1);
		System.out.println(Arrays.toString(arr));
		arr = reverse(arr, 0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	static int[] reverse(int[] arr, int a, int b){
		for(int i=a,j=b;i<j;i++,j--){
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}

		return arr;
	}
}

// wonderfull solution..