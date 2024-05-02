/*
Bubble sort algorithm
compare ad swap adjacent values continously untill end
*/
import java.util.Arrays;

public class Bubble{
	public static void main(String as[]){
		int arr[] = {5,8,3,6,10,3,10};
		arr = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] bubbleSort(int[] arr){
		int len = arr.length, z=1;
		boolean swapped;
		for(int i=0;i<len-1;i++){
			swapped = false;
			for(int j=0;j<len-1;j++){
				if(arr[j]> arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapped = true;	
				}
				System.out.print(z++ + " ");
			}
			if(!swapped){break;}
		}
		return arr;
	}
}