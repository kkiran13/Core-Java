/*The selection sort is a combination of searching and sorting. During each pass, the 
 * unsorted element with the smallest (or largest) value is moved to its proper position
 *  in the array. The number of times the sort passes through the array is one less than 
 *  the number of items in the array. In the selection sort, the inner loop finds the next
 *   smallest (or largest) value and the outer loop places that value into its proper*/

public class SelectionSort { // Thetha(n^2)
	
	public static int[] Selection(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) { //passes through n-1 times in the array
            int index = i; 
            
            for (int j = i + 1; j < arr.length; j++){ 
                if (arr[j] < arr[index]) //finds min in array after i
                    index = j;
            }
            
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
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
		int[] arr = {5,1,12,-5,16};
		PrintArray(arr);
		System.out.println();
		int[] res = Selection(arr);
		PrintArray(res);
	}
	
}
