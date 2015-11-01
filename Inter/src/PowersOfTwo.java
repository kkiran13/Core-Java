import java.util.Scanner;


public class PowersOfTwo {
	
	public static int twopowercount(String s){
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
		    	String s1 = s.charAt(i)+"";
		    	int numi = Integer.parseInt(s1); //check single numbers is power of 2
		    	if(IsPowerOfTwo(numi) != -1 && IsPowerOfTwo(numi) <= 800){
		    		count++;
		    	}
		    	int value = numi;
			for(int j=i+1;j<s.length();j++){ //check number formed from i to j if power of 2
				String s2 = s.charAt(j)+"";
				value = value*10 + Integer.parseInt(s2);
				String x = value+"";
				if(x.length()>1 && x.charAt(0)!=0){ //check if first value of number is 0. If yes ignore it even though it is a power of 2
					if(IsPowerOfTwo(value) != -1 && IsPowerOfTwo(value) <= 800){
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static int IsPowerOfTwo(int n){
		int x = 0;
		while(n%2==0 && n>1){
			n /= 2;
			x++;
		}
		if(n==1){
			return x;
		}else{
			return -1;
		}
	}
	
/* Input: 
5
2222222
24256   ----> 2, 4, 2, 256
65536   
023223
33579  

Output:
7
4
1
4
0
*/
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n>0){
			System.out.println(twopowercount(scan.next()));
			n--;
		}
	}
}
