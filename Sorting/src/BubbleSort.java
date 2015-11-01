/*Bubble sort, also referred to as sinking sort, is a simple sorting algorithm that works
 *  by repeatedly stepping through the list to be sorted, comparing each pair of adjacent
 *   items and swapping them if they are in the wrong order. The pass through the list is
 *    repeated until no swaps are needed, which indicates that the list is sorted. 
 *    The algorithm gets its name from the way smaller elements "bubble" to the top of the
 *     list. Because it only uses comparisons to operate on elements, it is a comparison 
 *     sort. Although the algorithm is simple, most of the other sorting algorithms are 
 *     more efficient for large lists.*/

public class BubbleSort {
	public static void Bubblesort(int[] array){ //O(n^2)
        int k;
        for (int m = 0; m < array.length ; m++) {
            for (int i = 0; i < array.length-1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swap(array,i, k);
                }
            }
            PrintArray(array);
        }
	}
	
	public static void swap(int[] arr, int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		Bubblesort(arr);
	}
}
