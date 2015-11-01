import java.io.BufferedReader;
import java.io.InputStreamReader;


public class primerange {
	public void prime(int start,int end){
		if(start==1){
			start = start+1;
		}
		while(start<=end){
			boolean is_prime = true;
			int num = start;
			double sqr = Math.sqrt(num);
			for(int j=2;j<=sqr;j++){
				if(num%j==0){
					is_prime = false;
				}
			}
			if(is_prime){
				System.out.println(num);
	        }
			start ++;
		}
	}
	
	public static void main(String[] args) throws Exception{
		primerange pr = new primerange();
		pr.prime(1,30);
	}
}
