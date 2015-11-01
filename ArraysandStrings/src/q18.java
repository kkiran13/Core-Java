
public class q18 {
	public static boolean isSubstring(String big, String small) {
		System.out.println(big);
		System.out.println("Index where substring starts: "+big.indexOf(small));
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isRotation(String s1, String s2) {
	    /* check that s1 and s2 are equal length and not empty */
	    if (s1.length() == s2.length() && s1.length() > 0) { 
	    	/* concatenate s1 and s1 within new buffer */
	    	String s1s1 = s1 + s1;
	    	//System.out.println(s1s1);
	    	return isSubstring(s1s1, s2);
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}
}
