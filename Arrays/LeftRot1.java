/*
Left Rotate an Array by One

approach: 
take the first element in a temp variable..
then move all elements one step leftward (i-1)
the plase the value of temp variable at last of the array

*/

import java.util.Arrays;


class LeftRot1{
	public static void main(String as[]){
		int arr[] = {1,2,3,4,5};

		int t = arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = t;
		System.out.println(Arrays.toString(arr));
	}
}