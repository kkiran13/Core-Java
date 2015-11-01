import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* The binary numeral system, or base-2 number system, represents numeric values using 
 * two symbols: 0 and 1. More specifically, the usual base-2 system is a positional 
 * notation with a radix of 2. Because of its straightforward implementation in digital
 *  electronic circuitry using logic gates, the binary system is used internally by 
 *  almost all modern computers.*/

public class binarycheck {
	public boolean bincheck(int number){
		String[] arr = String.valueOf(number).split("(?!^)");
		for(int i=0;i<arr.length;i++){
			if(Integer.parseInt(arr[i])>1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		binarycheck bnc = new binarycheck();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check if it is binary");
		int in = input.nextInt();
		System.out.println(in+" is BINARY??\nAnswer is: "+bnc.bincheck(in));
	}
}
