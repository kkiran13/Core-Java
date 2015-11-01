import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class MaxSumZeroSubarray {
	public static void main(String[] args){
		int[] arr = {4,2,-3,1,6,-2,-2,-2};
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			if (map.get(sum) == null){
				map.put(sum, new ArrayList<Integer>());
			}
			map.get(sum).add(i);
		}
		
		
		// Get Key and length of max length value list
		int maxlenlist = 0; 
		int keywithmaxlenlist = 0;
		for(Entry<Integer, ArrayList<Integer>> ee:map.entrySet()){
			System.out.println(ee.getKey()+" : "+ee.getValue());
			if(ee.getValue().size() > maxlenlist){
				maxlenlist = ee.getValue().size();
				keywithmaxlenlist = ee.getKey();
			}
		}
		
		// get max of list of the key obtained in above step
		int max = 0;
		for(int i=0;i<map.get(keywithmaxlenlist).size();i++){
			if(map.get(keywithmaxlenlist).get(i) > max){
				max = map.get(keywithmaxlenlist).get(i);
			}
		}
		
		System.out.println("Maximum Continuous Subarray summing to zero has "+max+" elements");
	}
}
