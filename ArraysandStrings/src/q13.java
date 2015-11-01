public class q13 {
	public static String uniquechars(String str){
	  boolean[] barr = new boolean[256];
	  char[] chararr = new char[str.length()];
	  int ind = 0;
	  for(int i=0;i<str.length();i++){
		  char val = str.charAt(i);
		  if(barr[val]) {
			  chararr[ind++] = str.charAt(i);
		  }else{
			  barr[val]=true;
		  }	  
	}
	  String s = new String(chararr);
	  return s;
	}
	
	public static void main(String[] args){
		String[] words = {"abbccde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
	System.out.println(word + ": "+ uniquechars(word));
}
	}
}