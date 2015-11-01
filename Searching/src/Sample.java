import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class Sample {
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
		
		int maxlen = 0;
		int keyind = 0;
		for(Entry<Integer, ArrayList<Integer>> ee:map.entrySet()){
			System.out.println(ee.getKey()+" : "+ee.getValue());
			if(ee.getValue().size() > maxlen){
				maxlen = ee.getValue().size();
				keyind = ee.getKey();
			}
		}
		
		int max = 0;
		for(Entry<Integer, ArrayList<Integer>> i:map.entrySet()){
			if(i.getKey() == keyind){
				for(int k=0;k<i.getValue().size();k++){
					if(i.getValue().get(k) > max){
						max = i.getValue().get(k);
					}
				}
			}
		}
		System.out.println("Maximum Continuous Subarray summing to zero has "+max+" elements");
	}
}
