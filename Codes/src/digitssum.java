import java.util.Scanner;

/*Below example shows how to find out sum of each digit in the given number using 
 * recursion logic.  * For example, if the number is 259, then the sum should be 2+5+9 = 16.*/
public class digitssum {
	int sum = 0;
	public int sumdigits(int num){
		if(num == 0){
			return sum;
		}else{
		sum+= num%10;
		num = num/10;
		sumdigits(num);
		}
		return sum;
	}
	public static void main(String[] args){
		digitssum dgs = new digitssum();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int in = input.nextInt();
		System.out.println();
		System.out.println("Sum of digits of "+in+" is "+dgs.sumdigits(in));
	}
}
