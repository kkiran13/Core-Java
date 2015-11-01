public class q14 {
  public static boolean anagramcheck(String s1, String s2){
	  int sum1 = 0;
	  int sum2 = 0;
	  for(int i=0;i<s1.length();i++){
		  sum1 += s1.charAt(i);
		}
	  for(int j=0;j<s2.length();j++){
		  sum2 += s2.charAt(j);
		}
	  if(sum1==sum2) {
		  return true;
	  }else {
		  return false;
	  }
	  
  }
  public static void main(String[] args){
	 String[][] strarr = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
	 for(String[] pair:strarr){
	 System.out.println(pair[0]+" and "+pair[1]+": "+anagramcheck(pair[0],pair[1]));
	 }
  }
}
