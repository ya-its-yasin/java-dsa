/*
insertion sort

read elements one by one.. and swap reverse order untill it reaches its correct position 
*/

import java.util.Arrays;

public class Insertion{
	public static void main(String as[]){
		int arr[] = {5,8,3,6,10,3,10};
		arr = insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] insertionSort(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			int key = arr[i], j=i;
			while(j>0 && arr[j]<arr[j-1]){
				int t = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = t;
				j--;
				//System.out.println(Arrays.toString(arr));
			}
		}
		return arr;
	}
}
