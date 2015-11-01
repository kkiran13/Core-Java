public class q12 {
	public static String reversestr(String str){
		char[] chararr = str.toCharArray();
		int i = 0;
		int j = chararr.length-1;
		char temp;
		while(i<j){
			temp = chararr[i];
			System.out.println(temp);
			chararr[i]=chararr[j];
			chararr[j]=temp;
			i++;
			j--;
		}
		String s = new String(chararr);
		return s;
	}
	
	public static void main(String[] args){
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
	System.out.println(word + ": "+ reversestr(word));
}
	}
}
