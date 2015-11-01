import java.util.Scanner;

public class Primenumbers{
	public static void main(String[] args){ 
	//Remove comments and comment lines with result variable to run for a range of values
		//This code tests if prime
		//int total = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = a.nextInt();
			double sqrt = Math.sqrt(i);
			boolean is_prime = true;
			  
			for(int j=2;j<=sqrt;j++){
				if(i%j == 0){
				is_prime = false;
				}
			}
		
		if(is_prime){
			System.out.println(i+" is "+is_prime);
			//System.out.println(i);
		}else {
			System.out.println(i+" is "+is_prime);
		}
	}
	}
//}
/*Scanner st = new Scanner(System.in);
int start = st.nextInt();
Scanner en = new Scanner(System.in);
int end = en.nextInt();*/
//for(int i=start;i<=end;i++){