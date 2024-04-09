
/*

find longest sub array with equal number of 0s adn 1s

approach:
change all 0s to -1
then do the algorithm of longest subarray with given sum that is 0.

simple trick

*/


import java.util.Map;
import java.util.HashMap;

class BinSubArr{
	public static void main(String as[]){
		//int arr[] = {1,0,1,1,1,0,0}; //res 6
		//int arr[] = {1,1,1,1}; //res 0
		//int arr[] = {0,0,1,1,1,1,1,0};  //res 4
		int arr[] = {0,0,1,0,1,1};  //res 6
		System.out.println(binSubArray(arr));
	}

	public static int binSubArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				arr[i]=-1;
		}
		return LongSubArray(arr,0);
	}

	public static int LongSubArray(int[] arr, int sum){
		int presum=0, longest=0;
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			presum+=arr[i];
			if(presum==sum){
				longest = i+1;
			}
			if(hm.containsKey(presum-sum)){
				longest = Math.max(longest, i- hm.get(presum-sum));
			}
			else
				hm.put(presum, i);
			System.out.println(hm.toString());
		}
		return longest;
	}

}