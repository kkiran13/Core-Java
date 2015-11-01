import java.util.Scanner;


public class reversestring { //Reverse a string using recursive algorithm
	String res = "";
	public String reverse(String str){
		if(str.length()==1){
			return str; 
		}else{
			res += str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
		}
		return res;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String in = input.next();
		reversestring r = new reversestring();
		System.out.println();
		System.out.println("Reverse of "+in+" is "+r.reverse(in));
	}
}
