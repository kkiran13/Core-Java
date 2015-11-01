public class q11 {
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			char val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void RepeatedChars(String str){
		boolean[] chararr = new boolean[256];
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(chararr[ch]){
				System.out.print(ch);
			}else{				
				chararr[ch] = true;
			}
		}
	}
	
	public static boolean PalindromeCheck(String str){
		int i=0;
		int j=str.length()-1;
		str = str.toLowerCase();
		while(i<j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	/*An anagram of a string is another string that contains same characters, only the order of characters can be different. 
	 * For example, “abcd and “dabc” are anagram of each other.
	 * Increment the value in count array for characters in str1 and 
	 * decrement for characters in str2. Finally, if all count values are 0, 
	 * then the two strings are anagram of each other.*/
	public static boolean anagramcheck(String str1,String str2){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()){
			return false;
		}
		char[] countarr = new char[256];
		for(int i=0;i<str1.length();i++){
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			countarr[ch1]++;
			countarr[ch2]--;
		}
		for(int i=0;i<countarr.length;i++){
			if(countarr[i] != 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle", "aabbcc"};
				for (String word : words) {
			System.out.print(word + ": "+ isUniqueChars2(word));
			System.out.print("!! Repeated characters are: ");
			RepeatedChars(word);
			System.out.println();
		}
		System.out.println("Anagram check: "+"abba: "+PalindromeCheck("abba"));
		System.out.println("Anagram check: "+"abcd:dbaa "+anagramcheck("abcd","cdab"));
	}
}