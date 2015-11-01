import java.util.Scanner;

public class reversenumber { //Reverses a number
 
    public int reverseNumber(int number){
         
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
     
    public static void main(String a[]){
    	Scanner input = new Scanner(System.in);
    	int in = input.nextInt();
    	reversenumber nr = new reversenumber();
    	System.out.println();
    	System.out.println("Input number is: "+in);
        System.out.println("Result: "+nr.reverseNumber(in));
    }
}