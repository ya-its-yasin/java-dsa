class test1{
	public static void main(String as[]){
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int mx = Integer.MIN_VALUE , sl = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>mx){
				sl = mx;
				mx = arr[i];
			}
			else if(arr[i]<mx){
				if(arr[i]>sl){
					sl = arr[i];
				}

			}
		} 
		
		System.out.println(sl);
	}
}