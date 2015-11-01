/*Given an array and an integer k, 
 * find the maximum for each and every contiguous subarray of size k.*/

import java.util.Deque;
import java.util.LinkedList;


public class maxofsubarrays {
	public void maxsub(int[] arr, int k){
		BoundedQueue qi = new BoundedQueue(k);
		int i;
		for(i=0;i<k;i++){
			while(!qi.isEmpty() && arr[i] >= arr[(Integer) qi.Rear()]){
				qi.Front();
			}
		}
		
	}
	
	public void MaxInSubArrayMethod(int[] arr, int k){ //O((n-k+1)*k)
		int n = arr.length;
		for(int i=0;i<=n-k;i++){
			int max = arr[i];
			for(int j=1;j<k;j++){
				if(arr[i+j]>max){
					max = arr[i+j];
				}
			}
			System.out.print(max+" ");
		}
	}
	
	public static void main(String[] args){
		maxofsubarrays max = new maxofsubarrays();
		int[] array = {12, 1, 78, 90, 57, 89, 56};
		max.MaxInSubArrayMethod(array,3);
		max.maxsub(array, 3);
	}
}
