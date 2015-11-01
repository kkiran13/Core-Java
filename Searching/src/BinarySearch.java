import java.util.Arrays;


public class BinarySearch { //worst case O(log n)
	
	public static int BinaryRecursive(int[] sortedArray, int start, int end, int key){
		 if (start < end) {
	            int mid = start + (end - start) / 2; 
	            if (key < sortedArray[mid]) {
	                return BinaryRecursive(sortedArray, start, mid-1, key);
	                 
	            } else if (key > sortedArray[mid]) {
	                return BinaryRecursive(sortedArray, mid+1, end , key);
	                 
	            } else {
	                return mid;  
	            }
	        }
		return -1;
	}
	
	public static int BinaryDivideAndConquer(int[] arr, int key){
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			int mid = (start+end)/2;
			if (key > arr[mid]){
				start = mid+1;
			}else if(key < arr[mid]){
				end = mid-1;
			}else{
				return mid;
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
		int[] arr = {2,45,234,567,876};
		PrintArray(arr);
		System.out.println();
		int res = BinaryRecursive(arr,0,arr.length-1,234);
		System.out.println("(Recursive solution) 234 found at: "+res);
		System.out.println("\n");
		int[] arr1 = {2,45,234,567,876};
		int res1 = BinaryDivideAndConquer(arr1, 234);
		System.out.println("(DAC solution)- 234 found at: "+res1);
	}
}	
