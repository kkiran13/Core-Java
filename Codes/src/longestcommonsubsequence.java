import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*finds longest common subsequence in a string*/
public class longestcommonsubsequence {
	public void lcs(String str){
		int len = str.length();
		char[] in = str.toCharArray();
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		for(int i=0;i<len;i++){
			String res = String.valueOf(in[i]);
			for(int j=i+1;j<len;j++){
				String inter = String.valueOf(in[j]);
				res += inter;
				if(hmap.containsKey(res)){
					hmap.put(res, hmap.get(res)+1);
				}else{
				hmap.put(res, 1);
				}
			}
		}
		int maxval = Collections.max(hmap.values());
		int maxkeylen = 0;
		int count = 0;
		String result = "";
		for(Entry<String, Integer> entry:hmap.entrySet()){
			if(entry.getValue()==maxval){
				int lent = entry.getKey().length();
				if(lent>maxkeylen){
					result = entry.getKey();
					count = entry.getValue();
					maxkeylen = lent;
				}
			}
		}
System.out.println("Longest Common Subsequence is: "+result+" with count of "+count);
	}
	
	public static void main(String[] args){
		longestcommonsubsequence x = new longestcommonsubsequence();
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		x.lcs(in);
	}
}
