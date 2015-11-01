import java.util.Scanner;


public class halfgreater { //input is list of number : 1 2 3 4 
	public static void main(String[] args){ //output says which half's sum is greater
		int mid = 0;
		int sum1 = 0;
		int sum2=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the elements separated by a space");
		String in = input.nextLine();
		String[] inn = in.split(" ");
		int[] intarr = new int[inn.length];
	
		for(int i=0;i<intarr.length;i++){
			intarr[i] = Integer.parseInt(inn[i]);
		}
		int len = intarr.length;
		if(intarr.length%2 != 0){
			mid = (len/2)+1;
		}else{
			mid = (len/2);
		}
		for(int j=0;j<mid;j++){
			sum1+=intarr[j];
		}
		for(int k=mid;k<len;k++){
			sum2+=intarr[k];
		}
		if(sum1<sum2){
			System.out.println("2nd half greater with "+sum2);
		}else if(sum1>sum2){
			System.out.println("1st half greater with "+sum1);
		}else{System.out.println("Both halves equal with "+sum1+" and "+sum2);
		
	}
  }
}
