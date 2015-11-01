/*Bubble sort is a simple sorting algorithm that works by repeatedly stepping through 
 * the list to be sorted, comparing each pair of adjacent items and swapping them if 
 * they are in the wrong order. The pass through the list is repeated until no swaps 
 * are needed, which indicates that the list is sorted. The algorithm gets its name 
 * from the way smaller elements bubble to the top of the list. Because it only uses 
 * comparisons to operate on elements, it is a comparison sort. You can see the code 
 * implementation below: */

public class bubblesort {
	public void bubsort(int[] intarr){
		for(int i=0;i<intarr.length;i++){
			for(int j=i+1;j<intarr.length;j++){
				if(intarr[i]>intarr[j]){
					int temp = intarr[i];
					intarr[i] = intarr[j];
					intarr[j]=temp;
				}
			}
			/*for(int l:intarr){
				System.out.print(l+",");
			}
			System.out.println();*/
		}
		//System.out.println();
		for(int k:intarr){
		System.out.print(k+",");
		}
	}
	public static void main(String[] args){
		bubblesort bbs = new bubblesort();
		int[] in ={4, 2, 9, 6, 23, 12, 34, 0, 1};
		bbs.bubsort(in);
	}
}
