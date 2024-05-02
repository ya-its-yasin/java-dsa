/*
Selected sort
select the min element and place it in the negining 0th position..
then select 2nd min and place it in 1st psition and so on..
*/

import java.util.Arrays;

public class Selection{
	public static void main(String as[]){
		int arr[] = {5,8,3,6,10,3,10};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static int[] selectionSort(int[] arr){
		int minPos = 0,
		n = arr.length;
		for(int i=0;i<n;i++){
			minPos = i;
			for(int j=i;j<n;j++){
				if(arr[j]<arr[minPos]){
					minPos = j;
				}
			}
			//System.out.println("min " + arr[minPos]);
			int t = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = t;
			//System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}