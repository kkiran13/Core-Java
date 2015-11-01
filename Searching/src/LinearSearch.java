
public class LinearSearch {  // O(n)
	
	public static int Linear(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	
	public static void PrintArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {5,1,12,-5,16};
		PrintArray(arr);
		System.out.println();
		int res = Linear(arr,12);
		System.out.println("Key found ar array position: "+res);
	}
}
