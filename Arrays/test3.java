import java.util.Arrays;
class test3{
	public static void main(String as[]){
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		int m=0,n=arr.length;

		for(int i=0;i<n;i++){
			if(arr[i]!=0){
				arr[m++] = arr[i];
			}
		}
		while(m<n){
			arr[m++] = 0;
		}


		System.out.println(Arrays.toString(arr));

	}
}