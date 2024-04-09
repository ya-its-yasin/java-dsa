import java.util.HashSet;

/*
find the subarray with zero sum
find the sum of teh sub array by adding one by one elements linearly..
and add the sum toa hashset which has unique elements...

when we hit a zero sum somewhere in middle... 
we will get one of previously recahed value in the hashset...

then a subarray with zero sum exist and we can return true.. and thats it..

*/
public class ZeroSubArr{
	public static void main(String as[]){
		HashSet<Integer> h = new HashSet<>();
		int arr[] = {3,4,3,-1,-2};	
		int preSum = 0;
		for(int i=0;i<arr.length;i++){
			preSum += arr[i];
			if(preSum==0 || h.contains(preSum))
				System.out.println("true");
			h.add(preSum);
			System.out.println(h.toString());
		}

	}
}