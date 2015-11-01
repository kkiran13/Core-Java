public class InsertionSort {
	
	public static int[] Insertion(int[] arr){ // (O^n2)
		int temp;
		for(int i=1;i<arr.length;i++){
			for(int j=i; j>0 ;j--){
				if(arr[j] < arr[j-1]){  //higher index number greater than lower index number
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			PrintArray(arr);
		}
		return arr;
	}
	
	public static void PrintArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {5,1,4,2,8};
		PrintArray(arr);
		System.out.println();
		int[] res = Insertion(arr);
		for(int x:res){
			System.out.print(x+" ");
		}
	}
}