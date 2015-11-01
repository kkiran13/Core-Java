/*Inversion Count for an array indicates – how far (or close) the array is from being 
 * sorted. If array is already sorted then inversion count is 0.
 * 
 * The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
 * 
 * Time Complexity: O(nlogn)
Algorithmic Paradigm: Divide and Conquer

*/

public class InversionCount {
	
	/* This function sorts the input array and returns the
	   number of inversions in the array */
	public int MergeSort(int[] arr, int size){
		int[] temp = new int[size];
		return _MergeSort(arr,temp,0,arr.length-1);
	}
	
	/* An auxiliary recursive function that sorts the input array and
	  returns the number of inversions in the array. */
	public int _MergeSort(int[] arr,int[] temp,int low, int high){
		int mid, invcount=0;
		if(low < high){
			/* Divide the array into two parts and call _mergeSortAndCountInv()
		       for each of the parts */
			mid = (low+high)/2;
			/* Inversion count will be sum of inversions in left-part, right-part
		      and number of inversions in merging */
			invcount = _MergeSort(arr,temp,low,mid);
			invcount += _MergeSort(arr,temp,mid+1,high);
			
			/*Merge the two parts*/
			invcount += merge(arr,temp,low,mid+1,high);
			
		}
		return invcount;
	}
	
	
	/* This function merges two sorted arrays and returns inversion count in
	   the arrays.*/
	public int merge(int[] arr,int[] temp, int low, int mid, int high){
		int invcount = 0;
		int i = low;
		int j = mid;
		int k = low;
		while((i<=mid-1) && (j<=high)){
			if(arr[i] <= arr[j]){
				temp[k] = arr[i];
				k++; i++;
			}else{
				temp[k] = arr[j];
				k++; j++;
				invcount += (mid-i);
			}
		}
		/* Copy the remaining elements of left subarray
		   (if there are any) to temp*/
		  while (i <= mid - 1){
		    temp[k] = arr[i];
		  	k++; i++;
		  }
		  /* Copy the remaining elements of right subarray
		   (if there are any) to temp*/
		  while (j <= high){
		    temp[k] = arr[j];
		  	k++; j++;
		  }
		  /*Copy back the merged elements to original array*/
		  for (i=low; i <= high; i++){
		    arr[i] = temp[i];
		  }
		  return invcount;
	}
	
	public static void main(String[] args){
		InversionCount ic = new InversionCount();
		int[] arr = {2, 4, 1, 3, 5 };
		System.out.println("Number of Inversions are: "+ic.MergeSort(arr, arr.length));
	}
}
