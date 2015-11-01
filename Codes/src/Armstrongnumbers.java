import java.util.Scanner;

/*Armstrong numbers are sum of their own digits to power of number of digits
 * eg: 153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153*/

public class Armstrongnumbers {
	public boolean isarmstrong(int number){
		int numdigits = String.valueOf(number).length(); //length of number
		int tmp = number;
		int sum = 0;
		while(tmp>0){
			int tm = tmp%10;
			tmp = tmp/10;
			sum += Math.pow(tm, numdigits);
		}
		if(sum == number){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){
		Armstrongnumbers arms = new Armstrongnumbers();
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		System.out.println("Is "+in+" an Armstrong number??\n"+"Answer is "+arms.isarmstrong(in));
	}
}
