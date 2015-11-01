/*Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function 
 * search(char pat[], char txt[]) that prints all occurrences of pat[] in txt[]. 
 * You may assume that n > m.
 * txt[] =  "THIS IS A TEST TEXT"
  pat[] = "TEST"
Output:

Pattern found at index 10
2) Input:

  txt[] =  "AABAACAADAABAAABAA"
  pat[] = "AABA"
Output:

   Pattern found at index 0
   Pattern found at index 9
   Pattern found at index 13
   */

public class PatternMatching {
	
	//Number of comparisons in worst case is O(patlen*(textlen-patlen+1))
	public static void Naive(char[] text, char[] pat){ //O(n)  Naive Approach
		int textlen = text.length;
		int patlen = pat.length;
		for(int i=0;i<=textlen-patlen;i++){ //loop till txt-pat length
			int j;
			for(j=0;j<patlen;j++){
				if(text[i+j]!=pat[j]){
					break;
				}
			}
			if(j==patlen){
				System.out.println("Pattern found at: "+i);
			}
		}
	}
	
	//The average and best case running time of the Rabin-Karp algorithm is O(textlen+patlen), 
	//but its worst-case time is O(textlen*patlen). 
	public static void RobinKarpAlgorithm(char[] text, char[] pat, int q){
		int textlen = text.length;
		int patlen = pat.length;
		int d = 256;
		int i,j;
		int p=0;  // hash value for pattern
		int t=0; // hash value for text
		int h=1;
		
		// The value of h would be "pow(d, M-1)%q"
		for(i=0;i<patlen-1;i++){
			h = (h*d)%q;
		}
		
		 // Calculate the hash value of pattern and first window of text
		for (i = 0; i < patlen; i++)
	    {
	        p = (d*p + pat[i])%q;
	        t = (d*t + text[i])%q;
	    }
		
		// Slide the pattern over text one by one 
		for (i = 0; i <= textlen - patlen; i++)
	    {
	        
	        // Check the hash values of current window of text and pattern
	        // If the hash values match then only check for characters on by one
	        if ( p == t )
	        {
	            /* Check for characters one by one */
	            for (j = 0; j < patlen; j++)
	            {
	                if (text[i+j] != pat[j])
	                    break;
	            }
	            if (j == patlen)  // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
	            {
	                System.out.println("Pattern found at index "+i);
	            }
	        }
	         
	        // Calculate hash value for next window of text: Remove leading digit, 
	        // add trailing digit           
	        if ( i < textlen-patlen )
	        {
	            t = (d*(t - text[i]*h) + text[i+patlen])%q;
	             
	            // We might get negative value of t, converting it to positive
	            if(t < 0) 
	              t = (t + q); 
	        }
	    }
		
		
	}
	
	public static void main(String[] args){
		String text = "AABAACAADAABAAABAA";
		String pattern = "AABA";
		char[] txt = text.toCharArray();
		char[] pat = pattern.toCharArray();
		System.out.println("Naive Approach Result:");
		Naive(txt,pat);
		System.out.println();
		System.out.println("Robin Karp result:");
		RobinKarpAlgorithm(txt,pat,101);
	}
}
