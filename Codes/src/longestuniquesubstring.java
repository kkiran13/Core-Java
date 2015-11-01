import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*Given a string, find the longest substrings without repeating characters. 
 * Iterate through the given string, find the longest maximum substrings.*/

public class longestuniquesubstring {
	public void lgs(String str){
		int len = str.length();
		char[] in = str.toCharArray();
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		Set<String> sett = new HashSet<String>();
		
		for(int i=0;i<len;i++){
			String res = String.valueOf(in[i]);
			sett.add(res);
			for(int j=i+1;j<len;j++){
				String inter = String.valueOf(in[j]);
				if(!sett.contains(inter)){
					sett.add(inter);
					res+=inter;
					hmap.put(res, res.length());
				}else{
				sett.clear();
				break;
				}
			}
		}
		
	int maxValueInMap=(Collections.max(hmap.values()));
	for (Entry<String, Integer> entry : hmap.entrySet()) {  //Iterate through hashmap
           if (entry.getValue()==maxValueInMap) {
              System.out.println("Longest is: "+entry.getKey());     // Print the key with max value
          }
       }
}
	public static void main(String[] args){
		longestuniquesubstring x = new longestuniquesubstring();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String in = input.nextLine();
		x.lgs(in);
	}
}
