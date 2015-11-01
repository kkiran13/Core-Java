import java.util.HashMap;
import java.util.Map;

//Given an array of positive and negative numbers, 
//max length of subarray (of size atleast one) with 0 sum.
//and return start and end index of 0 sum subarray

public class LongestSumContinuousToZero { //O(n) solution
	
	public static void Largest(int[] arr){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int end = 0; //end index of 0 sum subarray
		int start = 0; //start index of 0 sum subarray
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if (!map.containsKey(sum)) {
				map.put(sum, i);  //store in map all possible sum values in array with corresponding index
		    }else{
		    	int diff = i-map.get(sum); //get difference of index when sum again occurs to the value of key(sum)
		    	if(end < diff){ //if maxlength index is less than diff then ind = diff
		    		start = map.get(sum)+1; //get start index
		    		end = diff;  //get end index
		    	}
		    }
		}
		System.out.println("Found zero sum subarray with length:"+end+"\nStarting at:"+start+" Ending at:"+end);
	}
	
	public static void main(String[] args){
		
		int[] arr = {15,-2,2,-8,1,7,10,23};
		//int[] arr1 = {4, 2, -3, 1,6,-2,-2,-2};
		//int[] arr2 =  {4, 2, -3, 1, 6};
		//int[] arr3 = {-3, 2, 3, 1, 6};
		Largest(arr);
	}
	
}