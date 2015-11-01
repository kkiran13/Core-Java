import java.util.Scanner;


public class fizzbuzz {  //if n divisible by 3 then Fizz, by 5 then Buzz, both 3 and 5 then FizzBuzz, else print the number itself
	public static void main(String[] args){
		Scanner n1 = new Scanner(System.in);
		int n = n1.nextInt();
		for(int i=1;i<=n;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%5==0){
			 System.out.println("Buzz");
			}else if (i%3==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
	}
}
}
