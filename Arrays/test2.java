import java.util.Arrays;

class test2{
	public static void main(String as[]){
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int m=0,n=arr.length;

		for(int i=1;i<n;i++){
			if(arr[i]!=arr[m]){
				arr[++m] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr) + " - " + m);
	}
}