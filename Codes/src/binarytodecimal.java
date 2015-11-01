import java.util.Scanner;


public class binarytodecimal { //Convert Binary to decimal
	public int bintodec(int number){
		int decimal = 0;
		int power = 0;
		while(number>0){
			if(number == 0){
				break;
			}else{
				int temp = number%10;
				decimal += temp*Math.pow(2, power);
				number = number/10;
				power++;
			}
		}
		return decimal;
	}
	
	public int Decval(int number){
		String[] arr = String.valueOf(number).split("(?!^)");
		int decval = 0;
		int ind = 0;
		for(int i=arr.length-1;i>=0;i--){
			decval = (int) (decval + (Integer.parseInt(arr[i])*Math.pow(2,ind)));
			ind++;
		}
		return decval;
	}
	
	public static void main(String a[]){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the binary number");
		int in = input.nextInt();
		binarytodecimal bd = new binarytodecimal();
		System.out.println("Input binary is : "+in);
		System.out.println("Output Decimal is: "+bd.bintodec(in));
		System.out.println(bd.Decval(in));
    }
}
