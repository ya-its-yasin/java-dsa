/*
find largest element in the array,
*/


class Largest{
	public static void main(String as[]){
		int[] arr = {1,3,5,7,6,4,2};
		int lar=-1;
		for(int i=0;i<arr.length;i++){
			lar = arr[i]>lar ? arr[i] : lar;
		}
		System.out.println("Largest element is :" + lar);
	}
}

/*
speed (O)n
*/