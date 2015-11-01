import java.util.HashMap;
import java.util.Map.Entry;


public class DuplicatesArray {
	public int[] RemoverDups(int[] arr){
		int arrlen = arr.length;
		boolean[] boolarr = new boolean[256];
		int countdups = 0;
		for(int i=0;i<arrlen;i++){
			if(boolarr[arr[i]]){
				countdups++;
			}else{
				boolarr[arr[i]] = true;
			}
		}
		
		boolean[] boolarr1 = new boolean[256];
		int[] res = new int[arrlen-countdups];
		int ind = 0;
		for(int i=0;i<arrlen;i++){
			if(boolarr1[arr[i]]){
				countdups++;
			}else{
				boolarr1[arr[i]] = true;
				res[ind++] = arr[i];
			}
		}
		arr = null;
		return res;
	}
	
	public int[] Dups(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
			map.put(arr[i], 1);
			}else{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		int countdups = 0;
		for(Entry<Integer, Integer> ee:map.entrySet()){
		    		countdups += (ee.getValue()-1);
		}
		
		int[] res = new int[arr.length-countdups];
		int ind = 0;
		for(Entry<Integer, Integer> ee:map.entrySet()){
	    	res[ind++] = ee.getKey();
		}
		return res;
	}
	
	public void OccurencePrint(int[] arr, int occurencr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				map.put(arr[i], map.get(arr[i])+1);
				if(map.get(arr[i])==3){
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,2,3,4,2,3};
		DuplicatesArray da = new DuplicatesArray();
		int[] res = da.RemoverDups(arr);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
		System.out.println();
		int[] res1 = da.Dups(arr);
		for(int i=0;i<res1.length;i++){
			System.out.print(res1[i]+" ");
		}
		System.out.println();
		da.OccurencePrint(arr,3);
	}
}