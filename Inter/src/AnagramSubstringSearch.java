/*Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function 
 * search(char pat[], char txt[]) that prints all occurrences of pat[] and its 
 * permutations (or anagrams) in txt[]. You may assume that n > m. 
Expected time complexity is O(n)
1) Input:  txt[] = "BACDGABCDA"  pat[] = "ABCD"
   Output:   Found at Index 0
             Found at Index 5
             Found at Index 6
2) Input: txt[] =  "AAABABAA" pat[] = "AABA"
   Output:   Found at Index 0
             Found at Index 1
             Found at Index 4
             
             We can achieve O(n) time complexity under the assumption that alphabet size is fixed which is typically true as we have maximum 256 possible characters in ASCII. The idea is to use two count arrays:

1) The first count array store frequencies of characters in pattern.
2) The second count array stores frequencies of characters in current window of text.

The important thing to note is, time complexity to compare two count arrays is O(1) as 
the number of elements in them are fixed (independent of pattern and text sizes). 

Following are steps of this algorithm.
1) Store counts of frequencies of pattern in first count array countP[]. 
Also store counts of frequencies of characters in first window of text in array countTW[].

2) Now run a loop from i = M to N-1. Do following in loop.
…..a) If the two count arrays are identical, we found an occurrence.
…..b) Increment count of current character of text in countTW[]
…..c) Decrement count of first character in previous window in countWT[]

3) The last window is not checked by above loop, so explicitly check it.
 */
public class AnagramSubstringSearch {
	public static boolean compare(char[] arr1,char[] arr2){
		int max = 0;
		if(arr1.length > arr2.length){
			max = arr1.length;
		}else{
			max = arr2.length;
		}
		
		for(int i=0;i<max;i++){
			if(arr1[i]!=arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void search(char[] text, char[] pat){
		int patlen = pat.length; 
		int textlen = text.length;
		char[] countP = new char[256];
		char[] countTW = new char[256];
		
		// countP[]:  Store count of all characters of pattern
	    // countTW[]: Store count of current window of text
		for(int i=0;i<patlen;i++){
			countP[pat[i]]++;
			countTW[text[i]]++;
		}
		
		// Traverse through remaining characters of pattern
		for(int i=patlen;i<textlen;i++){
			// Compare counts of current window of text with
	        // counts of pattern[]
			if(compare(countP,countTW)){
				System.out.println("Found at Index: "+(i-patlen));
			}
			 // Add current character to current window
	        (countTW[text[i]])++;
	 
	        // Remove the first character of previous window
	        countTW[text[i-patlen]]--;
		}
		
		 if (compare(countP, countTW)){ //check last window explicitly
			 System.out.println("Found at Index: "+(textlen-patlen));
		 }
		 
	}
	
	public static void main(String[] args){
		String text = "BACDGABCDA";
		String pattern = "ABCD";
		char txt[] = text.toCharArray();
		char pat[] = pattern.toCharArray(); 
		search(txt, pat);
	}

}
