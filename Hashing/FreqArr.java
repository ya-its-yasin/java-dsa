/*
frequency of array elements

easy beesy

*/

import java.util.HashMap;

class FreqArr{
	public static void main(String as[]){
		int arr[] = {10,12,10,15,10,20,12,12};
		showAllFreq(arr);
	}

	public static void showAllFreq(int arr[]){
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i: arr){
			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		System.out.println(hm.toString());

	}
}