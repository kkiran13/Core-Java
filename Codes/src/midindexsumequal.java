import java.util.Scanner;

public class midindexsumequal {
	public static void main(String[] args){ //Find index of array where preceding and succeeding elements sum are equal
		
		boolean flag = false;
		int ind=0;
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the list of numbers separated by space");
		String in = input.nextLine();
		String[] inn = in.split(" ");
		int[] intarr = new int[inn.length];
	
		for(int i=0;i<intarr.length;i++){
			intarr[i] = Integer.parseInt(inn[i]);
		}
		for(int j=0;j<intarr.length;j++){
			//sum1 += intarr[j];
			int sum1 = 0;
			int sum2 = 0;
			for(int k=j+1;k<intarr.length;k++){ //find sum of top n elements from j
				sum2 += intarr[k];
			}
			for(int l=j-1;l>=0;l--){ //find sum of bottom n elements from j
				sum1 += intarr[l];
			}
			//System.out.println(sum2);
			//System.out.println(sum1);
			if(sum1 == sum2){
				flag = true;
				ind = j;
				sum = sum1;
				break;
			}
		}
		
		if(flag){
			System.out.println("Both halves equal at index "+ind+" and sums are "+sum);
		}else{
			System.out.println("No equality found");
		}
	}
}
