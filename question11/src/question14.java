//import java.util.Arrays;

public class question14 {
	/*public static boolean anagram(String s, String t) {
		if (s.length() != t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		//System.out.println("sarr is: "+s_array);
		for (char c : s_array) { // count number of each char in s.
			if (letters[c] == 0) num_unique_chars++;//appends to array the ascii value and checks if number is existing already
			//System.out.println("uni is: "+num_unique_chars);
			letters[c]++;
			//System.out.println("let is: "+letters[c]);
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (letters[c] == 0) { // Found more of char c in t than in s.
				return false;
			}
			--letters[c];
			if (letters[c] == 0) {
				++num_completed_t;
				if (num_completed_t == num_unique_chars) {
					// its a match if t has been processed completely
					return i == t.length() - 1;
				}
			}
		}
		return false;
	}*/
	
	/*public static boolean iAnagram(String word, String anagram){ 
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray(); 
		Arrays.sort(charFromWord); Arrays.sort(charFromAnagram);
		System.out.println(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram); 
		}*/

	//Read more: http://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz3R9vXMrqL
	/*public static boolean isAnagram(String word, String anagram){
		System.out.println(word+" "+anagram);
		if(word.length() != anagram.length()){ return false; } 
		char[] chars = word.toCharArray(); 
		for(char c : chars){ 
			int index = anagram.indexOf(c); 
			System.out.println("ind is: "+index);
		if(index != -1){ 
			anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
			//System.out.println("ana1 is: "+anagram.substring(0,index));	
			//System.out.println("ana2 is: "+anagram.substring(index +1, anagram.length()));
			//System.out.println("ana is: "+anagram);
		}
		else{ return false; } 
		} return anagram.isEmpty(); 
		}*/
	
	public static boolean ana(String s, String t){
		if (s.length() != t.length()) { return false;} 
		char[] cha = s.toCharArray();
		for(char c:cha){
			int index = t.indexOf(c);
			if (index != -1){
				t = t.substring(0,index)+t.substring(index+1,t.length());
			}
			else { return false;}
		}return t.isEmpty();
		
	}

	//Read more: http://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz3R9wdNXxR
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			//boolean ana = ana(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + ana(word1,word2));
		//System.out.println("Result is: "+ana("aaaa","abaa"));
		}
	}
}
