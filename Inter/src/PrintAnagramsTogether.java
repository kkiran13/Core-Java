import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*Given an array of words, print all anagrams together. For example, 
 * if the given array is {“cat”, “dog”, “tac”, “god”, “act”}, 
 * then output may be “cat tac act dog god”.*/

public class PrintAnagramsTogether {
	public static boolean ASC = true;
    public static boolean DESC = false;
	
	
	public static void PrintTogether(String[] arr){
		Map<String, Integer> hmap = new HashMap<String,Integer>();
		

		for(int i=0;i<arr.length;i++){
			hmap.put(arr[i], AsciiSum(arr[i]));
		}
		
		Map<String,Integer> sortedMapAsc = sortByComparator(hmap,ASC);
		
		for(Entry<String,Integer> entry:sortedMapAsc.entrySet()){
			System.out.print(entry.getKey()+" ");
		}
	}
	
	//Sort HashMap
	 private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
	    {

	        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

	        // Sorting the list based on values
	        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
	      public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
	                if (order) {  //Ascending
	                    return o1.getValue().compareTo(o2.getValue());
	                } else { //Descending
	                    return o2.getValue().compareTo(o1.getValue());
	                }
	            }
	        });

	        // Maintaining insertion order with the help of LinkedList
	        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	        for (Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }
	        return sortedMap;
	    }
	//End of HashMap sort
	 
	 
	public static int AsciiSum(String str){
		str = str.toLowerCase();
		int sum = 0;
		for(int i=0;i<str.length();i++){
			sum += (str.charAt(i)-64);
		}
		return sum;
	}
	
	public static void main(String[] args){
		String[] arr = {"cat", "dog", "tac", "god", "act"};
		PrintTogether(arr);
	}
}
