import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
/* lcs(s1,s2) = "" if s1=s2=null
 * lcs(s1,s2) = lcs(s1(0,length-1),s2(0,length-1))+s1.lastchar if last chars of s1 and s2 are equal 
 * maxlength(lcs(s1,s2(0,length-1)),lcs(s1(0,length-1),s2) otherwise*/
public class lcs_recursion{
public String lcs(String a, String b){
    int aLen = a.length();
    int bLen = b.length();
    if(aLen == 0 || bLen == 0){
        return "";
    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){ 
    //if last chars int two strings are equal then take LCS of 1st to (last-1) characters
        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1)) + a.charAt(aLen-1);
    }else{
        String x = lcs(a, b.substring(0,bLen-1));
        String y = lcs(a.substring(0,aLen-1), b);
        if(x.length() > y.length()){ //return (x.length() > y.length()) ? x : y; -->in short
        	return x;
        }else{
        	return y;
        }
        
    }
}
public static void main(String[] args) throws Exception{
	lcs_recursion x = new lcs_recursion();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter string 1");
	String str1 = br.readLine();
	System.out.println("Enter string 2");
	String str2 = br.readLine();
	System.out.println("Longest common subsequence is: "+x.lcs(str1,str2));
}
}