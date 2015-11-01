import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/* A perfect number is a positive integer that is equal to the sum 
of its proper positive divisors, that is, the sum of its positive divisors 
excluding the number itself. Equivalently, a perfect number is a number that is 
half the sum of all of its positive divisors. The first perfect number is 6, because 1, 2 
and 3 are its proper positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6 
is equal to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6.*/

public class propernumber { //Finds if a number is a proper number. 
	public String propernum(int number){
		int sum = 0;
		for(int i=1;i<number;i++){
			if(number%i == 0){
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of divisors is: "+sum);
		if(sum == number){
		System.out.println(number+" is a proper number");;
		}else{
		System.out.println(number+ " is Not a proper number");
		}
		return null;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int in = input.nextInt();
		propernumber pn = new propernumber();
		System.out.println("Input number is "+in);
		pn.propernum(in);
	}
}
