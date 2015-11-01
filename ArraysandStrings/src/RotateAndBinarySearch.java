// Rotate an array by n positions and modify Binary Search to find key
public class RotateAndBinarySearch {
	public static void Rotate(int[] arr,int n){
		Reverse(arr,0,n-1);
		Reverse(arr,n,arr.length-1);
		Reverse(arr,0,arr.length-1);
		PrintArray(arr);
	}
	
	public static void Reverse(int[] arr, int low, int high){
		while(low < high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	public static int ModifiedBinSearch(int[] arr,int key){
		int low = 0;
		int high = arr.length-1;
		while(low<=high){
			int mid = low + (high-low)/2;
			
			if(arr[mid] == key){
				return mid;
			}
			
			if(arr[low] <= arr[mid]){ //check if first half is sorted ascending
				if(key >= arr[low] && key < arr[mid]){
					high = mid-1;
				}else{
					low = mid+1;
				}
			}else{
				if(key > arr[mid] && key <= arr[high]){
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
		}
		return -1;
	}

	
	public static void PrintArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		System.out.print("Original Array:");
		PrintArray(arr);
		System.out.println();
		System.out.print("Rotated array:");
		Rotate(arr,5);
		System.out.println();
		System.out.println("Key found at: "+ModifiedBinSearch(arr,3));
	}
}
