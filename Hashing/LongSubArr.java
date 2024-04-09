
/*

find length of longest subarray with given sum.. 
thats a good one..

now.. use a map.. to catch hold of prefix and its index position.. thats its
you knwo what to do..

*/

import java.util.Map;
import java.util.HashMap;

class LongSubArr{
	public static void main(String as[]){
		//int arr[] = {5,8,-4,-4,9,-2,2}; int sum = 0; //res 3
		//int arr[] = {3,1,0,1,8,2,3,6}; int sum = 5; //res 4
		//int arr[] = {8,3,7}; int sum = 5; //res 0
		int arr[] = {5,2,3,4}; int sum = 5; //res 2
		System.out.println(LongSubArray(arr,sum));
	}

	public static int LongSubArray(int[] arr, int sum){
		int presum=0, longest=0;
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			presum+=arr[i];
			if(presum==sum){
				longest = i+1;
			}
			else if(hm.containsKey(presum-sum)){
				longest = Math.max(longest, i- hm.get(presum-sum));
			}
			else
				hm.put(presum, i);
			System.out.println(hm.toString());
		}
		return longest;
	}

}