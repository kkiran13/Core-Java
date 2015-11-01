import java.util.Scanner;


public class Duplicatenumbers { //Finds Duplicate from a list of numbers.
	public static void main(String[] args){  //eg: input = 1 2 3 4 1...output is 1
		boolean flag = false;
		int out=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ist of elements separated by a space");
		String in = input.nextLine();
		String[] inn = in.split(" ");
		int[] intarr = new int[inn.length];
	
		for(int i=0;i<intarr.length;i++){
			intarr[i] = Integer.parseInt(inn[i]);
		}
		
		for(int j=0;j<intarr.length;j++){
			int num1 = intarr[j];
			
			for(int l=0;l<intarr.length;l++){
				int num2 = intarr[l];
				
				if(l==j){}
				else{
				    int num3 = intarr[l];
					if(num1==num3){
						flag = true;
						out = num1;
						break;
					}else{}
				}
			}
		}
		
		if(flag){
			System.out.println("Duplicate is "+out);
			
		}else{
			System.out.println("No Duplicates found!!");
		}
	}
}
