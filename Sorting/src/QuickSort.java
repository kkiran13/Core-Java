/*1) Choose an element, called pivot, from the list. Generally pivot can be the middle 
 * index element.
2) Reorder the list so that all elements with values less than the pivot come before the 
pivot, while all elements with values greater than the pivot come after it (equal values 
can go either way). After this partitioning, the pivot is in its final position. This is 
called the partition operation.
3) Recursively apply the above steps to the sub-list of elements with smaller values and 
separately the sub-list of elements with greater values.*/

//The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case 
//is Θ(n2). 

public class QuickSort { 
	
	static int[] array;
	static int length;
	
	public void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		this.array = arr;
		length = array.length;
		quickSort(0,length-1);	
	}
	
	 private void quickSort(int lowerIndex, int higherIndex) {
         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which
	             * is greater then the pivot value, and also we will identify a number
	             * from right side which is less then the pivot value. Once the search
	             * is done, then we exchange both numbers.
	             */
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	
	public static void exchangeNumbers(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args){
		QuickSort qs = new QuickSort();
		int[] arr = {24,2,45,20,56,75,2,56,99,53,12};
		qs.sort(arr);
		for(int i:arr){
            System.out.print(i);
            System.out.print(" ");
        }
	}
}
