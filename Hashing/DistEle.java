
/*

count distinct elements

traverse each element and add it in a hashset, 
and get the size of hashset, it gives us unique count

*/

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class DistEle{
	public static void main(String as[]){
		//Integer arr[] = {15,12,13,12,13,13,18};  //res 4
		Integer arr[] = {10,10,10};  //res 1
		Set<Integer> s = new HashSet<>(Arrays.asList(arr));
		System.out.println(s.size());
	}
}