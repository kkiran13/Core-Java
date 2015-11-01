/*Insertion sort is a simple sorting algorithm that builds the final sorted array one item 
 * at a time. It is much less efficient on large lists than more advanced algorithms 
 * such as quicksort, heapsort, or merge sort. Every repetition of insertion sort 
 * removes an element from the input data, inserting it into the correct position 
 * in the already-sorted list, until no input elements remain. The choice of which 
 * element to remove from the input is arbitrary, and can be made using almost any 
 * choice algorithm. You can see the code implementation below:*/

 public class insertionsort { //take each element as key and compare with previous elements in array
 
    public static void insertionSort(int array[]) {
       int len = array.length;
    	for(int i=0;i<len;i++){
    		int key = array[i];
    		int j = i-1;
    		while((j>-1)&&(array[j]>key)){
    			array[j+1]=array[j];
    			j--;
    		}
    		array[j+1]=key;
    		printNumbers(array);
    	}
    }
    
    private static void printNumbers(int[] input) {
        
        for (int i:input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int[] input = { 4, 2, 1};
        insertionSort(input);
    }
}