/*
Move Zeros to End

approach:
haev two pointers from the begining
traverse one by one..
if a 0 is found.. then keep one pointer there itself and move th anothe rpointer to the nect posuition uintill we fins a non zero element
once no zero element is found, then place the value of 3nd pointer to the first pointer and move both pointers one by one again and ciontue the proces..

*/

import java.util.Arrays;

class MoveZeroToEnd{
	public static void main(String as[]){
		int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

		for(int i=0,j=0;j<arr.length;){
			if(arr[i]==0){
				if(arr[j]==0){
					j++;
					continue;
				}
				arr[i]=arr[j];
				arr[j]=0;
				i++;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

// nice..