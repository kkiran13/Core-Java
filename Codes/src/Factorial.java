import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


public class Factorial {

/*Factorials of N>20 can't be stored even in a 64−bit long long variable. 
* Big integers must be used for such calculations.*/
	
	public static void BigFact(int n){
		BigInteger fact = BigInteger.ONE;
		
		for(int i=2;i<=n;i++){
			fact = fact.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println("Big fact is: "+fact);
	}
	
	public static void Fact(int n){
		int result = n;
		System.out.print(result);
		for(int i=n-1;i>0;i--){
			result *= i;
			System.out.print("*"+i);
		}
		System.out.println("\n\nFactorial of n is: "+result);
	}
	
	public static void main(String[] args){
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Fact(n);
		System.out.println();
		BigFact(n);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}
}
