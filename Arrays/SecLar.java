/*
Second Largest Element in Array

approach:
same as first largest element..
additionally have ne more if condition to check if the element is lesser than greatest element
*/

class SecLar{
	public static void main(String as[]){
		int[] arr = {1,3,5,7,4,2,9};
		int lar = -2, res = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>lar){
				res = lar;
				lar = arr[i];
			}else if(arr[i]>res && arr[i]<lar){
				res = arr[i];
			}
			//System.out.println(lar + " " + res);
		}
		System.out.println("Second largest element is :" + res);
	}
}