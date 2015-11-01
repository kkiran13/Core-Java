
public class AsciiSumOfString {
	
	public static int AsciiSum(String str){
		str = str.toLowerCase();
		int sum = 0;
		for(int i=0;i<str.length();i++){
			sum += (str.charAt(i)-64);
		}
		return sum;
	}
	
	public static void main(String[] args){
		String s1 = "";
		System.out.println(AsciiSum(s1));
	}
}
