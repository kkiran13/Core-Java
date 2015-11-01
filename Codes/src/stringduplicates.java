import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*Write a program to find out duplicate or repeated characters in a string,
 *  and calculate the count of repetition.*/

public class stringduplicates {
	public void dups(String str){
		Map<Character,Integer> dupmap = new HashMap<Character,Integer>();
		char[] st = str.toCharArray();
		for(char key:st){
			if(dupmap.containsKey(key)){
				dupmap.put(key, dupmap.get(key)+1); //dupmap.get(key) gives count of values for the key
			}else{
				dupmap.put(key, 1);
			}
		}
		Set<Character> keys = dupmap.keySet(); //dupmap.keySet gives only keys of HashMap
		for(char key:keys){
			if(dupmap.get(key)>1){
				System.out.println(key+"----->"+dupmap.get(key));
			}
		}
	}
	
	public static void main(String[] args){
		stringduplicates sdp = new stringduplicates();
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		sdp.dups(in);
	}
}