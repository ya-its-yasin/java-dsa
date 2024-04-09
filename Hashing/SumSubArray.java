
/*

Sub array with given sum present or not..

approach: 
traverse elements one by one.. add to a preSum and place it in a hashset..
while traversing.. check if the ( presum - expected sum ) value is prsent in the hashset..
if yes.. then we got it....

*/

import java.util.HashSet;

class SumSubArray{
	public static void main(String as[]){
		int arr[] = {5,8,6,13};
		int sum = 14;
		System.out.println(hasSumSubArray(arr,sum));
	}

	public static boolean hasSumSubArray(int arr[], int sum){
		int preSum=0;
		HashSet<Integer> h = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			preSum+=arr[i];
			System.out.println( preSum + " " + sum + " " + h.toString());
			if(h.contains(preSum-sum) || preSum==sum){
				return true;
			}
			h.add(preSum);
		}
		return false;
	}
}